package org.generation.brazil.artemis.usuario;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.Optional;
import org.generation.brazil.artemis.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

  private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

  @Autowired
  private UsuarioRepository usuarioRepository;

  @ApiOperation(value = "Insere um novo usuário",
      notes = "Insere um novo usuário",
      response = Usuario.class)
  @ApiResponses(value = {
      @ApiResponse(code = 201, message = "Inserido"),
      @ApiResponse(code = 401, message = "Sem autorização"),
      @ApiResponse(code = 403, message = "Proíbido"),
      @ApiResponse(code = 404, message = "Não encontrado")
  })
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/usuarios")
  public Usuario save(@RequestBody Usuario usuario) {
    logger.info("Estamos salvando um usuário!");
    return usuarioRepository.save(usuario);
  }

  @ApiOperation(value = "Lista todos os usuários",
      notes = "Lista todos os usuários",
      response = List.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Sucesso"),
      @ApiResponse(code = 401, message = "Sem autorização"),
      @ApiResponse(code = 403, message = "Proíbido"),
      @ApiResponse(code = 404, message = "Não encontrado")
  })
  @GetMapping("/usuarios")
  public List<Usuario> findAll() {
    logger.error("ERROR");
    logger.warn("WARN");
    logger.info("INFO");
    logger.debug("DEBUG");
    return usuarioRepository.findAll();
  }

  @GetMapping("/usuarios/{id}")
  public Optional<Usuario> findById(@PathVariable Long id) {
    return usuarioRepository.findById(id);
  }

  @PutMapping("/usuarios/{id}")
  public Usuario update(
      @ApiParam(required = true, name = "id", value="Id necessário para atualizar o usuário")
      @PathVariable Long id,
      @RequestBody Usuario usuario)
      throws ResourceNotFoundException {
    // "UPDATE produto SET ... WHERE ..."
    return usuarioRepository.findById(id).map(usuarioAtualizado -> {
      usuarioAtualizado.setNome(usuario.getNome());
      usuarioAtualizado.setEmail(usuario.getEmail());
      return usuarioRepository.save(usuarioAtualizado);
    }).orElseThrow(() ->
        new ResourceNotFoundException("Não existe produto cadastrado com o id: " + id));
  }

  @DeleteMapping("/usuarios/{id}")
  public void delete(@PathVariable Long id) {
    usuarioRepository.deleteById(id);
  }

}