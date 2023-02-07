package com.springBD.SpringRestAPIPostgre.controller;

import com.springBD.SpringRestAPIPostgre.service.Calculos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/m1s06")

public class CalcularIMCController {
    @PostMapping("/ex2/calcularIMC") //ok
    public String calcularIMC(@RequestParam("peso") Double peso, @RequestParam("altura") Double altura){
        //realizar o calculo

            /*Implementado para que n�o possa colocar um CPF somente com zeros*/
            if (peso > 0.0 && altura > 0.0) {
                Double imc = Calculos.calcularIMC(peso, altura);
                return String.valueOf(imc);
            }
            else {
                return ResponseEntity.badRequest().body("Não foi aceito os dados informados, vefique!!").getBody();
            }
    }
}
