package org.generation.brazil.gfood.cliente;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Cliente {

  @Id //já diz que é uma pk
  @GeneratedValue(strategy = GenerationType.IDENTITY)     //para gerar auto_incremento do meu id
  private Long id;

  @NotNull
  private String nome;

  private String endereco;

}
