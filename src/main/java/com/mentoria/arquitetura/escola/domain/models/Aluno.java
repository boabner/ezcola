package com.mentoria.arquitetura.escola.domain.models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class Aluno {

  String id;
  String nome;
  String email;
  String cpf;
  String rg;

  //Demais comportamentos do dominio
}
