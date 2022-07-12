package com.capgemini.vsestrutural.charpter.dominio.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ComsumerEntity implements Serializable {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
}
