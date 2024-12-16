package wrappers;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WrappersInteger {
	
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
        assertEquals(0, Integer.compare(5, 5));
        assertEquals(-1, Integer.compare(5, 10));
        assertEquals(1, Integer.compare(10, 5));
    }

    @Test
    void TesteCompareTo() {
        Integer valorUm = 5;
        Integer valorDois = 10;
        assertEquals(0, valorUm.compareTo(5));
        assertEquals(-1, valorUm.compareTo(valorDois));
        assertEquals(1, valorDois.compareTo(valorUm));
    }

    @Test
    void TesteDecode() {
        assertEquals(777, Integer.decode("777"));
        assertEquals(-16, Integer.decode("-0x10"));
        assertEquals(10, Integer.decode("+10"));
    }

    @Test
    void TesteDivideUnsigned() {
        assertEquals(2, Integer.divideUnsigned(10, 5));
        assertEquals(0, Integer.divideUnsigned(5, 10));
    }

    @Test
    void TesteDoubleValue() {
        Integer numeroAntesDaConversao = 10;
        assertEquals(10.0, numeroAntesDaConversao.doubleValue(), 0.1);
    }

    @Test
    void TesteEquals() {
        Integer primeiroValor = 10;
        Integer segundoValor = 10;
        assertTrue(primeiroValor.equals(segundoValor));
    }

    @Test
    void TesteFloatValue() {
        Integer numeroAntesDaConversao = 10;
        assertEquals(10.0f, numeroAntesDaConversao.floatValue(), 0.1);
    }

    @Test
    void TesteGetInteger() {
        System.setProperty("NumeroMaximo", "2");
        assertEquals(Integer.valueOf(2), Integer.getInteger("NumeroMaximo"));
    }

    @Test
    void TesteGetIntegerComValorPadrao() {
        assertEquals(5, Integer.getInteger("NaoExistente", 5));
    }

    @Test
    void TesteGetIntegerComValorPadraoInteger() {
        assertEquals(Integer.valueOf(5), Integer.getInteger("NaoExistente", Integer.valueOf(5)));
    }

    @Test
    void TesteHashCode() {
        Integer valor = 10;
        assertEquals(valor.hashCode(), Integer.hashCode(10));
    }

    @Test
    void TesteHighestOneBit() {
        assertEquals(8, Integer.highestOneBit(10));
    }

    @Test
    void TesteIntValue() {
        Integer valor = 10;
        assertEquals(10, valor.intValue());
    }

    @Test
    void TesteLongValue() {
        Integer valor = 10;
        assertEquals(10L, valor.longValue());
    }

    @Test
    void TesteLowestOneBit() {
        assertEquals(2, Integer.lowestOneBit(10));
    }

    @Test
    void TesteMax() {
        assertEquals(20, Integer.max(10, 20));
    }

    @Test
    void TesteMin() {
        assertEquals(10, Integer.min(10, 20));
    }

    @Test
    void TesteNumberOfLeadingZero() {
        assertEquals(28, Integer.numberOfLeadingZeros(10));
    }

    @Test
    void TesteNumberOfTrailingZero() {
        assertEquals(1, Integer.numberOfTrailingZeros(10));
    }

    @Test
    void TesteParseInt() {
        assertEquals(24112003, Integer.parseInt("24112003"));
    }

    @Test
    void TesteParseIntComParametros() {
        assertEquals(24112003, Integer.parseInt("24112003", 10));
    }

    @Test
    void TesteParseUnsignedInt() {
        assertEquals(10, Integer.parseUnsignedInt("10"));
    }

    @Test
    void TesteParseUnsignedIntComParametros() {
        assertEquals(4, Integer.parseUnsignedInt("100", 2));
    }

    @Test
    void TesteRemainderUnsigned() {
        assertEquals(1, Integer.remainderUnsigned(10, 3));
    }

    @Test
    void TesteReverse() {
        assertEquals(-536870912, Integer.reverse(10));
    }

    @Test
    void TesteReverseBytes() {
        assertEquals(167772160, Integer.reverseBytes(10));
    }

    @Test
    void TesteRotateLeft() {
        assertEquals(40, Integer.rotateLeft(10, 2));
    }

    @Test
    void TesteRotateRight() {
        assertEquals(-2147483646, Integer.rotateRight(10, 2));
    }

    @Test
    void TesteShortValue() {
        Integer valor = -2;
        assertEquals(-2, valor.shortValue());
    }

    @Test
    void TesteSignum() {
        assertEquals(-1, Integer.signum(-10));
    }

    @Test
    void TesteSum() {
        assertEquals(200, Integer.sum(90, 110));
    }

    @Test
    void TesteToBinaryString() {
        assertEquals("1010", Integer.toBinaryString(10));
    }

    @Test
    void TesteToHexString() {
        assertEquals("a", Integer.toHexString(10));
    }

    @Test
    void TesteToOctalString() {
        assertEquals("12", Integer.toOctalString(10));
    }

    @Test
    void TesteToString() {
        Integer valor = 100;
        assertEquals("100", valor.toString());
    }

    @Test
    void TesteToStringComParametros() {
        assertEquals("200", Integer.toString(200));
        assertEquals("314", Integer.toString(200, 8));
    }

    @Test
    void TesteToUnsignedLong() {
        assertEquals(10L, Integer.toUnsignedLong(10));
    }

    @Test
    void TesteToUnsignedString() {
        assertEquals("10", Integer.toUnsignedString(10));
    }

    @Test
    void TesteToUnsignedStringComParametro() {
        assertEquals("10", Integer.toUnsignedString(10, 10));
    }

    @Test
    void TesteValueOfComInt() {
        assertEquals(Integer.valueOf(200), Integer.valueOf(200));
    }

    @Test
    void TesteValueOfComString() {
        assertEquals(Integer.valueOf("200"), Integer.valueOf("200"));
    }

    @Test
    void TesteValueOfComStringEParametros() {
        assertEquals(Integer.valueOf("200", 10), Integer.valueOf("200"));
    }
}
