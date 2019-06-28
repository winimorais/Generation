package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.cliente.Cliente;
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

    @ResponseStatus(HttpStatus.CREATED)     //INSET direto no postman, não no banco
    @PostMapping("/produtos")
    public Produto save(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @DeleteMapping("/produtos/{id}")        //DELETE direto no postman
    public void delete (@PathVariable Long id) {
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
}
