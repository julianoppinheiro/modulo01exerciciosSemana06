package com.springBD.SpringRestAPIPostgre.service;

public class Calculos {
    public static double calcularIMC(Double peso, Double altura){
        double imc = peso / (altura * altura);
        return (double) Math.round(imc);
    }
}
