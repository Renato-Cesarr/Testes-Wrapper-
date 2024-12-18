package wrappers.Double;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class WrapperDouble {

    @Test
    void deveRetornarValorMaximoCorreto() {
        Double max = DoubleValues.VALORES_GRANDES.getValores().stream().max(Double::compare).orElseThrow();
        assertTrue(DoubleValues.VALORES_GRANDES.getValores().stream().allMatch(v -> v <= max));
    }

    @Test
    void deveRetornarValorMinimoCorreto() {
        Double min = DoubleValues.VALORES_GRANDES.getValores().stream().min(Double::compare).orElseThrow();
        assertTrue(DoubleValues.VALORES_GRANDES.getValores().stream().allMatch(v -> v >= min));
    }

    @Test
    void deveSomarValoresCorretamente() {
        Double soma = DoubleValues.VALORES_PEQUENOS.getValores().stream().reduce(0.0, Double::sum);
        assertTrue(DoubleValues.VALORES_PEQUENOS.getValores().stream().mapToDouble(Double::doubleValue).sum() == soma);
    }

    @Test
    void deveIdentificarValorEspecialIsNaN() {
        Long quantidadeNaN = DoubleValues.VALORES_ESPECIAIS.getValores().stream().filter(v -> Double.isNaN(v)).count();
        assertEquals(1, quantidadeNaN);
    }

    @Test
    void deveIdentificarValorEspecialIsInfinite() {
        Long infinitos = DoubleValues.VALORES_ESPECIAIS.getValores().stream().filter(v -> Double.isInfinite(v)).count();
        assertEquals(2, infinitos);
    }

    @Test
    void deveCompararZerosCorretamente() {
        assertNotEquals(Double.doubleToLongBits(0.0), Double.doubleToLongBits(-0.0));
    }

    @Test
    void deveRemoverValoresDuplicados() {
        List<Double> unicos = DoubleValues.VALORES_DUPLICADOS.getValores().stream().distinct()
                .collect(Collectors.toList());
        assertTrue(unicos.size() > 1);
    }

    @Test
    void deveRestaurarValorCorretamenteUsandoDoubleToLongBits() {
        Double original = DoubleValues.VALOR_CONSTANTE.getValores().get(0);
        Long bits = Double.doubleToLongBits(original);
        Double restaurado = Double.longBitsToDouble(bits);
        assertEquals(original, restaurado, 0.001);
    }

    @Test
    void deveGarantirPrecisaoNaAdicao() {
        assertTrue(Math.abs(0.1 + 0.2 - 0.3) < 1e-15);
    }

    @Test
    void deveConverterValoresCorretamente() {
        Double valor = DoubleValues.VALOR_CONSTANTE.getValores().get(1);
        assertEquals(valor.byteValue(), valor.byteValue());
        assertEquals(valor.shortValue(), valor.shortValue());
        assertEquals(valor.intValue(), valor.intValue());
        assertEquals(valor.longValue(), valor.longValue());
        assertEquals(valor.floatValue(), valor.floatValue(), 0.001);
    }

    @Test
    void deveLidarComParseDoubleValidoEInvalido() {
        assertEquals(15.5, Double.parseDouble("15.5"));
        assertThrows(NumberFormatException.class, () -> Double.parseDouble("abc"));
    }

    @Test
    void deveVerificarHashCodeEIgualdadeCorretos() {
        Double valor1 = DoubleValues.VALOR_CONSTANTE.getValores().get(0);
        Double valor2 = DoubleValues.VALOR_CONSTANTE.getValores().get(0);
        assertEquals(valor1.hashCode(), valor2.hashCode());
        assertTrue(valor1.equals(valor2));
    }

    @Test
    void deveCompararValoresCorretamente() {
        List<Double> ordenados = DoubleValues.VALORES_PEQUENOS.getValores().stream().sorted(Double::compare)
                .collect(Collectors.toList());
        assertEquals(ordenados.get(0), ordenados.stream().min(Double::compare).orElseThrow());
        assertEquals(ordenados.get(ordenados.size() - 1), ordenados.stream().max(Double::compare).orElseThrow());
    }

    @Test
    void deveFiltrarPositivosENaN() {
        long positivos = DoubleValues.VALORES_MISTURADOS.getValores().stream().filter(v -> v > 0).count();
        assertTrue(positivos > 0);

        long quantidadeNaN = DoubleValues.VALORES_MISTURADOS.getValores().stream().filter(v -> Double.isNaN(v)).count();
        assertTrue(quantidadeNaN > 0);
    }
}
