package wrappers.Byte;

import java.util.Arrays;
import java.util.List;

public enum ByteValues {
    VALOR_1((byte) 10),
    VALOR_2((byte) 20),
    VALOR_3((byte) -128),
    VALOR_4((byte) 127),
    VALOR_5((byte) 0);

    private final Byte valor;

    ByteValues(Byte valor) {
        this.valor = valor;
    }

    public Byte getValor() {
        return valor;
    }

    public static List<Byte> getAllValues() {
        return Arrays.asList(VALOR_1.getValor(), VALOR_2.getValor(), VALOR_3.getValor(), VALOR_4.getValor(), VALOR_5.getValor());
    }
}
