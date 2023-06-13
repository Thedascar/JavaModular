import br.com.lucas.App.Calculadora;
import br.com.lucas.appCalculo.CalculadoraImpl;

module app.calculo{
    exports br.com.lucas.appCalculo;
    requires app.logging;
    requires app.api;
    provides br.com.lucas.App.Calculadora
        with br.com.lucas.appCalculo.CalculadoraImpl;
}