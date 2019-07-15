package org.generation.brazil.gfood.cliente;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDate;

import static java.lang.String.*;

@Data
@Entity
public class Cliente {

  @Id //já diz que é uma pk
  @GeneratedValue(strategy = GenerationType.IDENTITY)     //para gerar auto_incremento do meu id
  private Long id;

  @NotNull
  private String nome;

  private String endereco;

  @Column(name="data_nascimento")
  @NotNull
  private LocalDate dataNascimento;

}
