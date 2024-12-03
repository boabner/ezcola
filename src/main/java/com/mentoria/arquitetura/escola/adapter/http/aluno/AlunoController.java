package com.mentoria.arquitetura.escola.adapter.http.aluno;

import static org.springframework.http.HttpStatus.CREATED;

import com.mentoria.arquitetura.escola.domain.ports.aluno.AlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/alunos")
@RequiredArgsConstructor
public class AlunoController {

  private final AlunoService alunoService;
  private final AlunoDtoMapper mapper;

  @PostMapping
  @ResponseStatus(CREATED)
  public AlunoDto processarNovoAluno(@RequestBody @Valid AlunoRequest request) {

    var aluno = alunoService.processarNovoAluno(request.nome(), request.email(), request.cpf(), request.rg());

    if (aluno != null) {

      return mapper.paraAlunoDto(aluno);
    }
    return null;
  }
}
