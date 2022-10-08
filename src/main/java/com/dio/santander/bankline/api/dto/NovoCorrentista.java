package com.dio.santander.bankline.api.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class NovoCorrentista {
    @NotBlank
    private String nome;
    @NotBlank
    @Size(max = 20)
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}