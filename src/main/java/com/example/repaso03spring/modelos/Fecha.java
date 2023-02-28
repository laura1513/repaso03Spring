package com.example.repaso03spring.modelos;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fecha implements Serializable {
    private int dia;
    private int mes;
    private int anyo;
}
