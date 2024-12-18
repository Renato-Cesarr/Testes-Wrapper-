package wrappers.Double;

import java.util.Arrays;
import java.util.List;

public enum DoubleValues {
    VALORES_PEQUENOS(Arrays.asList(1.5, 2.5, 0.5, -1.0, -2.5)),
    VALORES_GRANDES(Arrays.asList(10.0, 20.5, 30.1, 40.8, 50.9)),
    VALORES_MISTURADOS(Arrays.asList(-10.5, 0.0, 15.3, Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY)),
    VALORES_DUPLICADOS(Arrays.asList(10.5, 10.5, 20.0, 10.5)),
    VALORES_ESPECIAIS(Arrays.asList(Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0, -0.0)),
    VALOR_CONSTANTE(Arrays.asList(10.0, 20.0));

    private final List<Double> valores;

    DoubleValues(List<Double> valores) {
        this.valores = valores;
    }

    public List<Double> getValores() {
        return valores;
    }
}
