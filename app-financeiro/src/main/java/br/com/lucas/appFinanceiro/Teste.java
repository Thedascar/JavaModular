package br.com.lucas.appFinanceiro;

import br.com.lucas.App.Calculadora;


import java.util.ServiceLoader;

public class Teste {
    public static void main(String[] args) {

        Calculadora calc = ServiceLoader
                .load(Calculadora.class)
                .findFirst()
                .get();

        System.out.println(calc.soma(10.5,45.5));
    }
}
