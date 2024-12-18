package wrappers.Integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;

class WrappersInteger {

	@Test
	void deveRetornarValorMaximoCorreto() {
		Integer max = IntegerValues.VALORES_GRANDES.getValores().stream().max(Integer::compare).orElseThrow();
		assertTrue(IntegerValues.VALORES_GRANDES.getValores().stream().allMatch(v -> v <= max));
	}

	@Test
	void deveRetornarValorMinimoCorreto() {
		Integer min = IntegerValues.VALORES_GRANDES.getValores().stream().min(Integer::compare).orElseThrow();
		assertTrue(IntegerValues.VALORES_GRANDES.getValores().stream().allMatch(v -> v >= min));
	}

	@Test
	void deveSomarValoresCorretamente() {
		Integer soma = IntegerValues.VALORES_PEQUENOS.getValores().stream().reduce(0, Integer::sum);
		assertEquals(IntegerValues.VALORES_PEQUENOS.getValores().stream().mapToInt(Integer::intValue).sum(), soma);
	}

	@Test
	void deveIdentificarValorEspecialMaxValue() {
		assertTrue(Integer.MAX_VALUE == Integer.parseInt(String.valueOf(Integer.MAX_VALUE)));
	}

	@Test
	void deveIdentificarValorEspecialMinValue() {
		assertTrue(Integer.MIN_VALUE == Integer.parseInt(String.valueOf(Integer.MIN_VALUE)));
	}
	@Test
	void deveRemoverValoresDuplicados() {
		List<Integer> unicos = IntegerValues.VALORES_DUPLICADOS.getValores().stream().distinct()
				.collect(Collectors.toList());
		assertTrue(unicos.size() > 1);
	}

	@Test
	void deveConverterValoresCorretamente() {
		Integer valor = IntegerValues.VALOR_CONSTANTE.getValores().get(1);
		assertEquals(valor.byteValue(), valor.byteValue());
		assertEquals(valor.shortValue(), valor.shortValue());
		assertEquals(valor.longValue(), valor.longValue());
		assertEquals(valor.floatValue(), valor.floatValue(), 0.001);
		assertEquals(valor.doubleValue(), valor.doubleValue(), 0.001);
	}

	@Test
	void deveLidarComParseIntegerValidoEInvalido() {
		assertEquals(15, Integer.parseInt("15"));
		assertThrows(NumberFormatException.class, () -> Integer.parseInt("abc"));
	}

	@Test
	void deveVerificarHashCodeEIgualdadeCorretos() {
		Integer valor1 = IntegerValues.VALOR_CONSTANTE.getValores().get(0);
		Integer valor2 = IntegerValues.VALOR_CONSTANTE.getValores().get(0);
		assertEquals(valor1.hashCode(), valor2.hashCode());
		assertTrue(valor1.equals(valor2));
	}

	@Test
	void deveCompararValoresCorretamente() {
		List<Integer> ordenados = IntegerValues.VALORES_PEQUENOS.getValores().stream().sorted(Integer::compare)
				.collect(Collectors.toList());
		assertEquals(ordenados.get(0), ordenados.stream().min(Integer::compare).orElseThrow());
		assertEquals(ordenados.get(ordenados.size() - 1), ordenados.stream().max(Integer::compare).orElseThrow());
	}

	@Test
	void deveFiltrarPositivos() {
		long positivos = IntegerValues.VALORES_MISTURADOS.getValores().stream().filter(v -> v > 0).count();
		assertTrue(positivos > 0);
	}

	@Test
	void deveConverterParaStringCorretamente() {
		Integer valor = IntegerValues.VALOR_CONSTANTE.getValores().get(0);
		assertEquals(String.valueOf(valor), valor.toString());
	}
}
