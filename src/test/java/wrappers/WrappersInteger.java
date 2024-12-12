package wrappers;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WrappersInteger {
	// Integer wrapperInteger = Integer.valueOf(0);
	@Test
	void TesteBitCount() {
		Integer numeroSerContado = 5;
		assertEquals(2, Integer.bitCount(numeroSerContado));
	}

	@Test
	void TesteByteValue() {
		Integer valorByte = 5;
		assertEquals(5, valorByte.byteValue());
	}

	@Test
	void TesteCompare() {
		Integer valorUmASerComparado = 5;
		Integer valorDoisASerComparado = 10;
		assertEquals(1, valorDoisASerComparado.compareTo(valorUmASerComparado));
	}

	@Test
	void TesteDecode() {
		String palavraTranformarNumero = "777";
		assertEquals(777, Integer.decode(palavraTranformarNumero));
	}

	@Test
	void TesteDivideUnsigned() {
		Integer numeroUmASerDividido = 10;
		Integer numeroDoisASerDividido = 5;
		assertEquals(2, Integer.divideUnsigned(numeroUmASerDividido, numeroDoisASerDividido));
	}

	@Test
	void TesteDoubleValue() {
		Integer numeroAntesDaConversao = 10;
		double resultadoDaConversao = numeroAntesDaConversao.doubleValue();
		assertEquals(10.0, resultadoDaConversao, 0.1);
	}

	@Test
	void TesteEquals() {
		Integer primeiroValorASerComparado = 10;
		Integer segundoValorASerComparado = 10;
		assertTrue(primeiroValorASerComparado.equals(segundoValorASerComparado));
	}

	@Test
	void TesteFloatValue() {
		Integer numeroAntesDaConversao = 10;
		Float resultadoDaConversao = numeroAntesDaConversao.floatValue();
		assertEquals(10.0, resultadoDaConversao, 0.1);
	}

	@Test
	void TesteGetInteger() {
		System.setProperty("Numero maximo de chocolates", "2");
		String valorDaPropriedadeEmString = System.getProperty("Numero maximo de chocolates");
		Integer maximoDeChocolates = Integer.valueOf(valorDaPropriedadeEmString);
		assertEquals(Integer.valueOf(2), maximoDeChocolates);
	}

	@Test
	void TesteHashCode() {
		Integer valor = 10;
		assertEquals(Integer.valueOf(10).hashCode(), valor.hashCode());
	}

	@Test
	void TestHashCodeComParametros() {
		assertEquals(20, Integer.hashCode(20));
	}

	@Test
	void TesteHighestOneBit() {
		Integer valorInteger = 10;
		assertEquals(8, Integer.highestOneBit(valorInteger));
	}

	@Test
	void TesteIntValue() {
		Integer valorSemConversao = 10;
		assertEquals(10, valorSemConversao.intValue());
	}

	@Test
	void TesteLongValue() {
		Integer valorSemConversao = 10;
		assertEquals(10L, valorSemConversao.longValue());
	}

	@Test
	void TesteLowestOneBit() {
		Integer valorSemCOnversao = 10;
		assertEquals(8, Integer.highestOneBit(valorSemCOnversao));
	}

	@Test
	void TesteMax() {
		Integer valorUm = 10;
		Integer valorDois = 20;
		assertEquals(20, Integer.max(valorDois, valorUm));
	}

	@Test
	void TesteMin() {
		Integer valorUm = 5;
		Integer valorDois = 22;
		assertEquals(5, Integer.min(valorDois, valorUm));
	}

	@Test
	void TesteNumberOfLeadingZero() {
		Integer valorUm = 10;
		assertEquals(28, Integer.numberOfLeadingZeros(valorUm));
	}

	@Test
	void TesteNumberOfTralingZero() {
		Integer valorUm = 10;
		assertEquals(1, Integer.numberOfTrailingZeros(valorUm));
	}

	@Test
	void TesteParseInt() {
		String numeroEmString = "24112003";
		assertEquals(24112003, Integer.parseInt(numeroEmString));
	}

	@Test
	void TesteParseIntComParametros() {
		String numeroEmString = "24112003";
		assertEquals(24112003, Integer.parseInt(numeroEmString, 10));
	}

	@Test
	void TesteParseUnsignedInt() {
		String numeroEmString = "10";
		assertEquals(10, Integer.parseUnsignedInt(numeroEmString));
	}

	@Test
	void TesteParseUnsignedIntComPametrosAdicionais() {
		String numeroEmString = "100";
		assertEquals(4, Integer.parseInt(numeroEmString, 2));
	}

	@Test
	void TesteRemainderUnsigned() {
		Integer valorUm = 10;
		Integer valorDois = -100;
		assertEquals(10, Integer.remainderUnsigned(valorUm, valorDois));
	}

	@Test
	void TesteReverse() {
		Integer valorSemReversao = 10;
		assertEquals(1, Integer.parseInt(new StringBuilder(valorSemReversao.toString()).reverse().toString()));
	}
	@Test
	void TesteReverseBytes() {
	    Integer valorSemReversao = 10;
	    assertEquals(167772160, Integer.reverseBytes(valorSemReversao));
	}
	@Test
	void TesteRotateLeft() {
		Integer valorBits = 10;
		Integer valorBistDistancia = 2;
		assertEquals(40, Integer.rotateLeft(valorBits, valorBistDistancia));
	}
	@Test
	void TesteRotateRigth() {
		Integer valorBits = 10;
		Integer valorBistDistancia = 2;
		assertEquals(-2147483646, Integer.rotateRight(valorBits, valorBistDistancia));
	}
	@Test
	void TesteShortValue () {
		Integer valorSemConversao = -2;
		assertEquals(-2, valorSemConversao.shortValue());
	}
	@Test 
	void TesteSignum(){
		Integer numeroComSinal = -10;
		assertEquals(-1, Integer.signum(numeroComSinal));
	}
	@Test
	void TesteSum() {
		Integer valorUmSoma = 90;
		Integer valorDoisSoma = 110;
		assertEquals(200, Integer.sum(valorDoisSoma, valorUmSoma));
	}
	@Test
	void TesteToBinaryString() {
	    Integer valorAntesDaConvercao = 10;
	    assertEquals("1010", Integer.toBinaryString(valorAntesDaConvercao));
	}
	@Test
	void TesteToHexString () {
	    Integer valorAntesDaConvercao = 10;
	    assertEquals("a", Integer.toHexString(valorAntesDaConvercao));
	}
	@Test
	void TesteToOctalString () {
	    Integer valorAntesDaConvercao = 10;
	    assertEquals("12", Integer.toOctalString(valorAntesDaConvercao));
	}
	@Test
	void TesteToString () {
		Integer valorAntesDaConversao = 100;
		assertEquals("100", valorAntesDaConversao.toString());
	}
	@Test
	void TesteToStringComUmParametros() {
		Integer valorAntesDaConversao = 200;
		assertEquals("200", Integer.toString(valorAntesDaConversao));
	}
	@Test
	void TesteToStringComDoisParametros() {
		Integer valorAntesDaConversao = 200;
		Integer valorDaBaseDecimal = 10;
		assertEquals("200", Integer.toString(valorAntesDaConversao,valorDaBaseDecimal));
	}
	@Test
	void TesteToUnsignedLong() {
	    Integer valorPositivo = 10;
	    assertEquals(10L, Integer.toUnsignedLong(valorPositivo));
	}
	@Test
	void TesteToUnsignedString() {
	    Integer valorPositivo = 10;
	    assertEquals("10", Integer.toUnsignedString(valorPositivo));
	}
	@Test
	void TesteToUnsignedStringComParametro() {
	    Integer valorPositivo = 10;
		Integer valorDaBaseDecimal = 10;
	    assertEquals("10", Integer.toUnsignedString(valorPositivo,valorDaBaseDecimal));
	}
	@Test
	void TesteValueOfComInt() {
		Integer valorUm = Integer.valueOf(200);
		Integer valorDois = Integer.valueOf(200);
		assertEquals(valorUm, valorDois);
	}
	@Test
	void TestValueOfComString() {
		Integer valorUm = Integer.valueOf("0");
		Integer valorDois = Integer.valueOf("0");
		assertEquals(valorUm, valorDois);
	}
	@Test
	void TestValueOfComStringEParametros() {
		Integer valorUm = Integer.valueOf("0",10);
		Integer valorDois = Integer.valueOf("0",10);
		assertEquals(valorUm, valorDois);
	}
	
}
