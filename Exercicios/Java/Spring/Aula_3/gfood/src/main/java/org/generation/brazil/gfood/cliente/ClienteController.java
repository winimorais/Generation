package org.generation.brazil.gfood.cliente;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

////@Controller
//@RestController
//public class ClienteController {
//
//    //@ResponseBody     //Antigamente usava contoller + reponseBody - para atualizar só uma parte da página
//    //@RequestMapping("/index") // notação antiga
//    @GetMapping("/index")
//    public String index() {
//        return "Uma mensagem de teste!";
//    }
//
//    @PostMapping("/post")
//    public String post() {
//        return "Não dá para fazer pelo navegador!";
//    }
//}     // a gente só viu diferença do controller para o restcontroller, teste para conversar com o navegador

@RestController
public class ClienteController {

  @Autowired
  //injeta a dependência que preciso, sem ele o repository dá null. Quando preciso usar algum repository dentro do meu controller.
  private ClienteRepository repository;


  @GetMapping("/clientes")
  public List<Cliente> findAll() {
    //"SELECT * FROM cliente"
    return repository.findAll();
  }

//  Para selecionar por id
  @GetMapping("/clientes/{id}")
  public Optional<Cliente> findByIdIn(@PathVariable Long id) {
    //"SELECT * FROM cliente"
    return repository.findById(id);
  }

  @PostMapping("/clientes/nome")
  public List<Cliente> findByNome(@RequestParam String nome) {
    return repository.findByNome(nome);
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/clientes")
  public Cliente save(
      @RequestBody Cliente cliente) {     //requestbody faz a conversão do json em objeto

//        System.out.println("Nome: " + cliente.getNome());     //quando eu insiro dado no postman, printa aqui no console
//        System.out.println("Endereço: " + cliente.getEndereco());

    // "INSERT INTO cliente ..."
    return repository.save(cliente);
  }

  @PutMapping("/clientes/{id}") //o nome que chamo o id é o mesmo que o id embaixo
  public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente)   //2 parâmetros
      throws ResourceNotFoundException {
    // "UPDATE cliente SET ... WHERE ..."
    return repository.findById(id).map(clienteAtualizado -> {
      clienteAtualizado.setNome(cliente.getNome());
      clienteAtualizado.setEndereco(cliente.getEndereco());
      return repository.save(clienteAtualizado);
    }).orElseThrow(() ->
        new ResourceNotFoundException("Não existe cliente cadastrado com o id: " + id));
  }


  @DeleteMapping("/clientes/{id}")
  public void delete(@PathVariable Long id) {   //tudo que era integer a gnt começou a usar Long
    // "DELETE FROM clioente WHERE id = ..."
    repository.deleteById(id);
  }

//  - Buscar uma lista de clientes por data de Nascimento
  @PostMapping("/clientes/data-nascimento")
  public List<Cliente> findByDataNascimento(@RequestParam(value = "data-nascimento") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate dataNascimento) {
    return repository.findByDataNascimento(dataNascimento);
  }

//  Buscar uma lista de clientes por nome e data de Nascimento
    @PostMapping("/clientes/nomeAndData")
    public List<Cliente> findByNomeAndDataNascimento(@RequestParam String nome, LocalDate dataNascimento) {
      return repository.findByNomeAndDataNascimento(nome, dataNascimento);
    }

}
