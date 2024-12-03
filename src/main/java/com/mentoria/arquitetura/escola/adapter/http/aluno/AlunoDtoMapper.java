package com.mentoria.arquitetura.escola.adapter.http.aluno;

import com.mentoria.arquitetura.escola.domain.models.Aluno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlunoDtoMapper {

  AlunoDto paraAlunoDto(Aluno aluno);
}
