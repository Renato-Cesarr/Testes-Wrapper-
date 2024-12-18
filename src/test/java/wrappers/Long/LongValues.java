package wrappers.Long;

import java.util.Arrays;
import java.util.List;

public enum LongValues {
    VALORES_TIPICOS(Arrays.asList(1L, 2L, 3L, 4L, 5L)),
    VALORES_GRANDES(Arrays.asList(Long.MAX_VALUE, Long.MAX_VALUE - 1L)),
    VALORES_PEQUENOS(Arrays.asList(1L, -1L)),
    VALOR_CONSTANTE(Arrays.asList(100L));

    private final List<Long> valores;

    LongValues(List<Long> valores) {
        this.valores = valores;
    }

    public List<Long> getValores() {
        return valores;
    }
}
