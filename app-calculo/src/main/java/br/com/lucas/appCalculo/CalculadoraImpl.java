package br.com.lucas.appCalculo;

import br.com.lucas.App.Calculadora;
import br.com.lucas.appLogging.Logger;
import br.com.lucas.interno.OperacoesAritmeticas;

public class CalculadoraImpl implements Calculadora {

    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando...");
        return opAritmeticas.soma(nums);
    }
}
