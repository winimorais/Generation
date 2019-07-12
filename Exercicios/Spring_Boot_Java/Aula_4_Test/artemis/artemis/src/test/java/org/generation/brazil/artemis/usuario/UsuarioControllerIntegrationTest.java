package org.generation.brazil.artemis.usuario;


import org.generation.brazil.artemis.ArtemisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =   ArtemisApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioControllerIntegrationTest {

  @Autowired
  private TestRestTemplate testRestTemplate;

  @LocalServerPort
  private int port;

  private String getRootUrl(String path) {
    return "http://localhost:" + port + "/api/v1" + path;
  }

  @Test
  public void testaCriacaoDeUmNovoUsuario() {

//    Criar novo usuario
//    Usuario usuario = new Usuario();
//    usuario.setNome("Winicius Morais");
//    usuario.setEmail("winimorais@gmail.com");
//    usuario.setLogin("winimorais");
//    usuario.setSenha("@123ww");

//    Chamada da API
    ResponseEntity<Usuario> postResponse = testRestTemplate.postForEntity(getRootUrl("/usuarios"), usuario, Usuario.class);

      assertNotNull(postResponse);

      assertEquals(201, postResponse.getStatusCodeValue());
  }

}
