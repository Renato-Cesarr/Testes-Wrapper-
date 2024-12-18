package wrappers.Integer;

import java.util.Arrays;
import java.util.List;

public enum IntegerValues {
    VALORES_PEQUENOS(Arrays.asList(1, 2, 3, -1, -2)),
    VALORES_GRANDES(Arrays.asList(1000, 2000, 3000, 4000, 5000)),
    VALORES_MISTURADOS(Arrays.asList(-1000, 0, 1500, Integer.MAX_VALUE, Integer.MIN_VALUE)),
    VALORES_DUPLICADOS(Arrays.asList(10, 10, 20, 10)),
    VALORES_ESPECIAIS(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0)),
    VALOR_CONSTANTE(Arrays.asList(10, 20));

    private final List<Integer> valores;

    IntegerValues(List<Integer> valores) {
        this.valores = valores;
    }

    public List<Integer> getValores() {
        return valores;
    }
}
