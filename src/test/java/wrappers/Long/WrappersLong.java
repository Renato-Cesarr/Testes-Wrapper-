package wrappers.Long;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersLong {

	private LongValues values;

	@BeforeEach
	void setUp() {
		values = LongValues.VALORES_TIPICOS;
	}

	@Test
	void deveRetornarValorMaximoCorreto() {
		Long max = values.getValores().stream().max(Long::compare).orElseThrow();
		assertTrue(values.getValores().stream().allMatch(v -> v <= max));
	}

	@Test
	void deveRetornarValorMinimoCorreto() {
		Long min = values.getValores().stream().min(Long::compare).orElseThrow();
		assertTrue(values.getValores().stream().allMatch(v -> v >= min));
	}

	@Test
	void deveSomarValoresCorretamente() {
		Long soma = values.getValores().stream().reduce(0L, Long::sum);
		assertTrue(values.getValores().stream().mapToLong(Long::longValue).sum() == soma);
	}

	@Test
	void deveCompararValoresCorretamente() {
		values.getValores().stream().forEach(valor -> {
			assertEquals(0, Long.compare(valor, valor));
			values.getValores().stream().filter(v -> v != valor).forEach(outro -> {
				assertTrue(Long.compare(valor, outro) != 0);
			});
		});
	}

	@Test
	void deveConverterValoresCorretamente() {
		values.getValores().forEach(valor -> {
			assertEquals(valor.byteValue(), valor.byteValue());
			assertEquals(valor.shortValue(), valor.shortValue());
			assertEquals(valor.intValue(), valor.intValue());
			assertEquals(valor.longValue(), valor.longValue());
			assertEquals(valor.doubleValue(), valor.doubleValue(), 0.001);
		});
	}

	@Test
	void deveLidarComParseLongValidoEInvalido() {
		values.getValores().forEach(valor -> {
			assertDoesNotThrow(() -> Long.parseLong(valor.toString()));
		});
		assertThrows(NumberFormatException.class, () -> Long.parseLong("abc"));
	}

	@Test
	void deveVerificarHashCodeEIgualdadeCorretos() {
		Long valor1 = values.getValores().get(0);
		Long valor2 = values.getValores().get(0);
		assertEquals(valor1.hashCode(), valor2.hashCode());
		assertTrue(valor1.equals(valor2));
	}

	@Test
	void deveLidarComOverflow() {
		assertTrue(Long.MAX_VALUE + 1 == Long.MIN_VALUE);
		assertTrue(Long.MIN_VALUE - 1 == Long.MAX_VALUE);
	}

	@Test
	void deveTestarValueOf() {
		values.getValores().forEach(valor -> {
			assertEquals(Long.valueOf(valor.toString()), valor);
		});
	}

	@Test
	void deveTestarToString() {
		values.getValores().forEach(valor -> {
			assertEquals(valor.toString(), valor.toString());
		});
	}

	@Test
	void deveTestarCompareTo() {
		values.getValores().stream().forEach(valor -> {
			assertTrue(valor.compareTo(valor) == 0); //
			values.getValores().stream().filter(outro -> outro != valor).forEach(outro -> {
				assertTrue(valor.compareTo(outro) != 0);
			});
		});
	}

	@Test
	void deveTestarBitCount() {
		values.getValores().forEach(valor -> {
			int bitCount = Long.bitCount(valor);
			assertTrue(bitCount >= 0);
		});
	}


	@Test
	void deveTestarPrecisaoDoubleValue() {
		values.getValores().forEach(valor -> {
			assertEquals(valor.doubleValue(), valor.doubleValue(), 0.001);
		});
	}
}
