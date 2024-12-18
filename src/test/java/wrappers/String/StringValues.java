package wrappers.String;

import java.util.Arrays;
import java.util.List;

public enum StringValues {
    EXEMPLO_1("fsddsfdsf"),
    EXEMPLO_2("XYZ456"),
    EXEMPLO_3("sdfsfdsfds"), 
    EXEMPLO_4("valor1,valor2,valor3"),
    EXEMPLO_5("nome: [nome], idade: [idade]"),
    EXEMPLO_6("123abc456");

    private final String valor;

    StringValues(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public static List<String> getAllValues() {
        return Arrays.asList(EXEMPLO_1.getValor(), EXEMPLO_2.getValor(), EXEMPLO_3.getValor(),
                             EXEMPLO_4.getValor(), EXEMPLO_5.getValor(), EXEMPLO_6.getValor());
    }
}
