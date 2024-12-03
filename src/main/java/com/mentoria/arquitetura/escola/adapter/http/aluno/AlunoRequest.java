package com.mentoria.arquitetura.escola.adapter.http.aluno;

import jakarta.validation.constraints.NotBlank;

public record AlunoRequest(
    @NotBlank
    String nome,
    @NotBlank
    String email,
    @NotBlank
    String cpf,
    @NotBlank
    String rg
) {

}
