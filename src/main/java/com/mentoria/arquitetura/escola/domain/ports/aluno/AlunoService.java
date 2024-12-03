package com.mentoria.arquitetura.escola.domain.ports.aluno;

import com.mentoria.arquitetura.escola.domain.models.Aluno;

public interface AlunoService {

  Aluno processarNovoAluno(String nome, String cpf, String rg, String email);
}
