package wrappers.Integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersInteger {

    public RecordInteger records;

    @BeforeEach
    void setup() {
        records = new RecordInteger(
            Integer.valueOf(5),
            Integer.valueOf(10),
            Integer.valueOf(20),
            Integer.valueOf(10),
            "10",
            "24112003"
        );
    }

    @Test
    void TesteBitCount() {
        assertEquals(2, Integer.bitCount(records.valor5()));
    }

    @Test
    void TesteByteValue() {
        assertEquals(5, records.valor5().byteValue());
    }

    @Test
    void TesteCompare() {
        assertEquals(0, Integer.compare(records.valor5(), records.valor5()));
        assertEquals(-1, Integer.compare(records.valor5(), records.valor10()));
        assertEquals(1, Integer.compare(records.valor10(), records.valor5()));
    }

    @Test
    void TesteCompareTo() {
        assertEquals(0, records.valor5().compareTo(records.valor5()));
        assertEquals(-1, records.valor5().compareTo(records.valor10()));
        assertEquals(1, records.valor10().compareTo(records.valor5()));
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
        assertEquals(10.0, records.valor10().doubleValue(), 0.1);
    }

    @Test
    void TesteEquals() {
        assertTrue(records.valor10().equals(records.valor10()));
    }

    @Test
    void TesteFloatValue() {
        assertEquals(10.0f, records.valor10().floatValue(), 0.1);
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
        Integer valor = records.valor10();
        assertEquals(valor.hashCode(), Integer.hashCode(records.valor10()));
    }

    @Test
    void TesteHighestOneBit() {
        assertEquals(8, Integer.highestOneBit(records.valor10()));
    }

    @Test
    void TesteIntValue() {
        Integer valor = records.valor10();
        assertEquals(10, valor.intValue());
    }

    @Test
    void TesteLongValue() {
        Integer valor = records.valor10();
        assertEquals(10L, valor.longValue());
    }

    @Test
    void TesteLowestOneBit() {
        assertEquals(2, Integer.lowestOneBit(records.valor10()));
    }

    @Test
    void TesteMax() {
        assertEquals(records.valor20(), Integer.max(records.valor10(), records.valor20()));
    }

    @Test
    void TesteMin() {
        assertEquals(records.valor10(), Integer.min(records.valor10(), records.valor20()));
    }

    @Test
    void TesteNumberOfLeadingZero() {
        assertEquals(28, Integer.numberOfLeadingZeros(records.valor10()));
    }

    @Test
    void TesteNumberOfTrailingZero() {
        assertEquals(1, Integer.numberOfTrailingZeros(records.valor10()));
    }

    @Test
    void TesteParseInt() {
        assertEquals(24112003, Integer.parseInt(records.valorString24112003()));
    }

    @Test
    void TesteParseIntComParametros() {
        assertEquals(24112003, Integer.parseInt(records.valorString24112003(), 10));
    }

    @Test
    void TesteParseUnsignedInt() {
        assertEquals(10, Integer.parseUnsignedInt(records.valorString10()));
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
        assertEquals(1342177280, Integer.reverse(records.valor10()));
    }

    @Test
    void TesteReverseBytes() {
        assertEquals(167772160, Integer.reverseBytes(records.valor10()));
    }

    @Test
    void TesteRotateLeft() {
        assertEquals(40, Integer.rotateLeft(records.valor10(), 2));
    }

    @Test
    void TesteRotateRight() {
        assertEquals(-2147483646, Integer.rotateRight(records.valor10(), 2));
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
        assertEquals("1010", Integer.toBinaryString(records.valor10()));
    }

    @Test
    void TesteToHexString() {
        assertEquals("a", Integer.toHexString(records.valor10()));
    }

    @Test
    void TesteToOctalString() {
        assertEquals("12", Integer.toOctalString(records.valor10()));
    }

    @Test
    void TesteToString() {
        Integer valor = 100;
        assertEquals("100", valor.toString());
    }

    @Test
    void TesteToStringComParametros() {
        assertEquals("200", Integer.toString(200));          
        assertEquals("310", Integer.toString(200, 8));
    }

    @Test
    void TesteToUnsignedLong() {
        assertEquals(10L, Integer.toUnsignedLong(records.valor10()));
    }

    @Test
    void TesteToUnsignedString() {
        assertEquals("10", Integer.toUnsignedString(records.valor10()));
    }

    @Test
    void TesteToUnsignedStringComParametro() {
        assertEquals("10", Integer.toUnsignedString(records.valor10(), 10));
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
