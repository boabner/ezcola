package com.mentoria.arquitetura.escola.infrastructure.adapters.documents;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Value
@Builder
@Document(collection = "alunos")
public class AlunoDocument {

  @Id
  String id;
  String nome;
  String email;
  String cpf;
  String rg;
}
