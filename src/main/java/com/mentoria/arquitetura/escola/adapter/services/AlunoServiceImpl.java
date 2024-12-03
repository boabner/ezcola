package com.mentoria.arquitetura.escola.adapter.services;

import com.mentoria.arquitetura.escola.domain.models.Aluno;
import com.mentoria.arquitetura.escola.domain.ports.aluno.AlunoService;
import com.mentoria.arquitetura.escola.infrastructure.adapters.persistence.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {

  private final AlunoRepository repository;
  private final AlunoMapper mapper;

  public Aluno processarNovoAluno(String nome, String cpf, String rg, String email) {

    var alunoDocument = mapper.paraAlunoDocument(nome, email, cpf, rg);

    //Salvar
    var novoAluno = repository.save(alunoDocument);

    //Enviar para topico
    //handler/service/producer

    //Enviar email
    //handler/service/producer

    return mapper.paraAluno(novoAluno);
  }
}
