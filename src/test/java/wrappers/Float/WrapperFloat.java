package wrappers.Float;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class WrapperFloat {

    @Test
    void deveRetornarValorMaximoCorreto() {
        Float max = FloatValues.VALORES_GRANDES.getValores().stream().max(Float::compare).orElseThrow();
        assertTrue(FloatValues.VALORES_GRANDES.getValores().stream().allMatch(v -> v <= max));
    }

    @Test
    void deveRetornarValorMinimoCorreto() {
        Float min = FloatValues.VALORES_GRANDES.getValores().stream().min(Float::compare).orElseThrow();
        assertTrue(FloatValues.VALORES_GRANDES.getValores().stream().allMatch(v -> v >= min));
    }

    @Test
    void deveSomarValoresPequenosCorretamente() {
        Float soma = FloatValues.VALORES_PEQUENOS.getValores().stream().reduce(0f, Float::sum);
        assertTrue(FloatValues.VALORES_PEQUENOS.getValores().stream().mapToDouble(Float::doubleValue).sum() == soma);
    }

    @Test
    void deveIdentificarValorEspecialIsNaN() {
        Long quantidadeNaN = FloatValues.VALORES_ESPECIAIS.getValores().stream().filter(v -> Float.isNaN(v)).count();
        assertEquals(1, quantidadeNaN);
    }

    @Test
    void deveIdentificarValorEspecialIsInfinite() {
        Long infinitos = FloatValues.VALORES_ESPECIAIS.getValores().stream().filter(v -> Float.isInfinite(v)).count();
        assertEquals(2, infinitos);
    }

    @Test
    void deveCompararZerosCorretamente() {
        assertNotEquals(Float.floatToIntBits(0.0f), Float.floatToIntBits(-0.0f));
    }

    @Test
    void deveRemoverValoresDuplicados() {
        List<Float> unicos = FloatValues.VALORES_DUPLICADOS.getValores().stream().distinct()
                .collect(Collectors.toList());
        assertTrue(unicos.size() > 1);
    }

    @Test
    void deveRestaurarValorCorretamenteUsandoFloatToIntBits() {
        Float original = FloatValues.VALOR_CONSTANTE.getValores().get(0);
        Integer bits = Float.floatToIntBits(original);
        Float restaurado = Float.intBitsToFloat(bits);
        assertEquals(original, restaurado, 0.001);
    }

    @Test
    void deveGarantirPrecisaoNaAdicao() {
        assertTrue(Math.abs(0.1f + 0.2f - 0.3f) < 1e-6);
    }

    @Test
    void deveConverterValoresCorretamente() {
        Float valor = FloatValues.VALOR_CONSTANTE.getValores().get(1);
        assertEquals(valor.byteValue(), valor.byteValue());
        assertEquals(valor.shortValue(), valor.shortValue());
        assertEquals(valor.intValue(), valor.intValue());
        assertEquals(valor.longValue(), valor.longValue());
        assertEquals(valor.doubleValue(), valor.doubleValue(), 0.001);
    }

    @Test
    void deveLidarComParseFloatValidoEInvalido() {
        assertEquals(15.5f, Float.parseFloat("15.5"));
        assertThrows(NumberFormatException.class, () -> Float.parseFloat("abc"));
    }

    @Test
    void deveVerificarHashCodeEIgualdadeCorretos() {
        Float valor1 = FloatValues.VALOR_CONSTANTE.getValores().get(0);
        Float valor2 = FloatValues.VALOR_CONSTANTE.getValores().get(0);
        assertEquals(valor1.hashCode(), valor2.hashCode());
        assertTrue(valor1.equals(valor2));
    }

    @Test
    void deveCompararValoresCorretamente() {
        List<Float> ordenados = FloatValues.VALORES_PEQUENOS.getValores().stream().sorted(Float::compare)
                .collect(Collectors.toList());
        assertEquals(ordenados.get(0), ordenados.stream().min(Float::compare).orElseThrow());
        assertEquals(ordenados.get(ordenados.size() - 1), ordenados.stream().max(Float::compare).orElseThrow());
    }

    @Test
    void deveFiltrarPositivosENaN() {
        long positivos = FloatValues.VALORES_MISTURADOS.getValores().stream().filter(v -> v > 0).count();
        assertTrue(positivos > 0);

        long quantidadeNaN = FloatValues.VALORES_MISTURADOS.getValores().stream().filter(v -> Float.isNaN(v)).count();
        assertTrue(quantidadeNaN > 0);
    }
}
