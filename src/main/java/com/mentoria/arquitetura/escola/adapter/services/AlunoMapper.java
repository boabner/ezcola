package com.mentoria.arquitetura.escola.adapter.services;

import com.mentoria.arquitetura.escola.domain.models.Aluno;
import com.mentoria.arquitetura.escola.infrastructure.adapters.documents.AlunoDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

  AlunoDocument paraAlunoDocument(String nome, String email, String cpf, String rg);

  Aluno paraAluno(AlunoDocument alunoDocument);
}
