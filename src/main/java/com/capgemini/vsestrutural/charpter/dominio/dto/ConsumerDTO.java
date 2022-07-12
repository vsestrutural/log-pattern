package com.capgemini.vsestrutural.charpter.dominio.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsumerDTO {
    private int id;
    private String transactionNumber;
    private String email;
}
