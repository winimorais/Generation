package org.generation.brazil.gfood.produto;

import java.math.BigDecimal;
import java.util.Optional;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

  @Autowired
  private ProdutoRepository repository;

  @GetMapping("/produtos")
  public List<Produto> findAll() {
    return repository.findAll();
  }

  //  Para selecionar por id
  @GetMapping("/produtos/{id}")
  public Optional<Produto> findByIdIn(@PathVariable Long id) {
    //"SELECT * FROM produtos"
    return repository.findById(id);
  }

  @ResponseStatus(HttpStatus.CREATED)     //INSET direto no postman, não no banco
  @PostMapping("/produtos")
  public Produto save(@RequestBody Produto produto) {
    return repository.save(produto);
  }

  @DeleteMapping("/produtos/{id}")        //DELETE direto no postman
  public void delete(@PathVariable Long id) {
    repository.deleteById(id);
  }

  @PutMapping("/produtos/{id}")
  public Produto update(@PathVariable Long id, @RequestBody Produto produto)
      throws ResourceNotFoundException {
    return repository.findById(id).map(produtoAtualizado -> {
      produtoAtualizado.setNome(produto.getNome());
      produtoAtualizado.setDescricao(produto.getDescricao());
      return repository.save(produtoAtualizado);
    }).orElseThrow(() ->
        new ResourceNotFoundException("Não existe produto cadastrado com o id: " + id));
  }

  //    Buscar uma lista de produtos com o preço < 10,00

  @PostMapping("/produtos/menor")
  public List<Produto> findByPrecoLessThan(@RequestParam BigDecimal preco) {
    return repository.findByPrecoLessThan(preco);
  }

//    Buscar uma lista de produtos com o preço > 10,00

  @PostMapping("/produtos/maior")
  public List<Produto> findByPrecoGreaterThan(@RequestParam BigDecimal preco) {
    return repository.findByPrecoGreaterThan(preco);
  }

//    Buscar uma lista de produtos com o preço entre 10,00 e 20,00

  @PostMapping("/produtos/maiormenor")
  public List<Produto> findByPrecoBetween(@RequestParam BigDecimal preco) {
    return repository.findByPrecoBetween(preco);
  }


}
