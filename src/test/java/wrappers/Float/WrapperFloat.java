package wrappers.Float;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class WrapperFloat {

    @Test
    void testeMax() {
        Float max = FloatValues.VALORES_GRANDES.getValores().stream().max(Float::compare).orElseThrow();
        assertTrue(FloatValues.VALORES_GRANDES.getValores().stream().allMatch(v -> v <= max));
    }

    @Test
    void testeMin() {
        Float min = FloatValues.VALORES_GRANDES.getValores().stream().min(Float::compare).orElseThrow();
        assertTrue(FloatValues.VALORES_GRANDES.getValores().stream().allMatch(v -> v >= min));
    }

    @Test
    void testeSomaValoresPequenos() {
        Float soma = FloatValues.VALORES_PEQUENOS.getValores().stream().reduce(0f, Float::sum);
        assertTrue(FloatValues.VALORES_PEQUENOS.getValores().stream().mapToDouble(Float::doubleValue).sum() == soma);
    }

    @Test
    void testeComparacaoZeros() {
        assertNotEquals(Float.floatToIntBits(0.0f), Float.floatToIntBits(-0.0f));
    }

    @Test
    void testeDistinctValoresDuplicados() {
        List<Float> unicos = FloatValues.VALORES_DUPLICADOS.getValores().stream().distinct().collect(Collectors.toList());
        assertEquals(2, unicos.size());
        assertTrue(unicos.contains(10.5f));
        assertTrue(unicos.contains(20.0f));
    }

    @Test
    void testeFloatToIntBitsRestauracao() {
        Float original = FloatValues.VALOR_CONSTANTE.getValores().get(0);
        Integer bits = Float.floatToIntBits(original);
        Float restaurado = Float.intBitsToFloat(bits);
        assertEquals(original, restaurado, 0.001);
    }

    @Test
    void testePrecisaoAdicao() {
        assertTrue(Math.abs(0.1f + 0.2f - 0.3f) < 1e-6);
    }

    @Test
    void testeConversaoValores() {
        Float valor = FloatValues.VALOR_CONSTANTE.getValores().get(1);
        assertEquals((byte) 10, valor.byteValue());
        assertEquals((short) 10, valor.shortValue());
        assertEquals(10, valor.intValue());
        assertEquals(10L, valor.longValue());
        assertEquals(10.5, valor.doubleValue(), 0.001);
    }

    @Test
    void testeParseFloatValidoEInvalido() {
        assertEquals(15.5f, Float.parseFloat("15.5"));
        assertThrows(NumberFormatException.class, () -> Float.parseFloat("abc"));
    }

    @Test
    void testeHashCodeIgualdade() {
        Float valor1 = FloatValues.VALOR_CONSTANTE.getValores().get(0);
        Float valor2 = FloatValues.VALOR_CONSTANTE.getValores().get(0);
        assertEquals(valor1.hashCode(), valor2.hashCode());
        assertTrue(valor1.equals(valor2));
    }

    @Test
    void testeCompare() {
        List<Float> ordenados = FloatValues.VALORES_PEQUENOS.getValores().stream()
                .sorted(Float::compare)
                .collect(Collectors.toList());
        assertEquals(-2.5f, ordenados.get(0));
        assertEquals(2.5f, ordenados.get(ordenados.size() - 1));
    }
}
