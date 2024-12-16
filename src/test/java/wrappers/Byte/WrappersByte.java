package wrappers.Byte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersByte {

    RecordByte valores;

    @BeforeEach
    void setup() {
        valores = new RecordByte((byte) 10, (byte) 10, Byte.MAX_VALUE, Byte.MIN_VALUE);
    }

    @Test
    void TesteCompareTo() {
        assertEquals(0, valores.byteBase().compareTo((byte) 10));
        assertTrue(valores.byteBase().compareTo((byte) 5) > 0);
        assertTrue(valores.byteBase().compareTo((byte) 15) < 0);
    }

    @Test
    void TesteEquals() {
        assertTrue(valores.byteBase().equals((byte) 10));
        assertFalse(valores.byteBase().equals((byte) 15));
    }

    @Test
    void TesteMaxValue() {
        assertEquals(Byte.MAX_VALUE, valores.byteMax());
    }

    @Test
    void TesteMinValue() {
        assertEquals(Byte.MIN_VALUE, valores.byteMin());
    }

    @Test
    void TesteValueOf() {
        assertEquals(valores.byteBase(), Byte.valueOf("10"));
        assertThrows(NumberFormatException.class, () -> Byte.valueOf("invalido"));
    }

    @Test
    void TesteByteToString() {
        assertEquals("10", valores.byteBase().toString());
    }

    @Test
    void TesteParseByte() {
        assertEquals(10, Byte.parseByte("10"));
        assertThrows(NumberFormatException.class, () -> Byte.parseByte("invalido"));
    }

    @Test
    void TesteCompare() {
        assertEquals(0, Byte.compare((byte) 10, (byte) 10));
        assertTrue(Byte.compare((byte) 5, (byte) 10) < 0);
        assertTrue(Byte.compare((byte) 15, (byte) 10) > 0);
    }

    @Test
    void TesteToString() {
        assertEquals("10", valores.byteBase().toString());
    }

    @Test
    void TesteValueOfPrimitive() {
        assertEquals(valores.byteBase(), Byte.valueOf(valores.valorBase()));
    }

    @Test
    void TesteParseByteWithRadix() {
        assertEquals(10, Byte.parseByte("A", 16));  // A é 10 em base 16
        assertThrows(NumberFormatException.class, () -> Byte.parseByte("Z", 16));
    }

    @Test
    void TesteShortValue() {
        assertEquals(10, valores.byteBase().shortValue());
    }

    @Test
    void TesteIntValue() {
        assertEquals(10, valores.byteBase().intValue());
    }

    @Test
    void TesteLongValue() {
        assertEquals(10L, valores.byteBase().longValue());
    }

    @Test
    void TesteDoubleValue() {
        assertEquals(10.0, valores.byteBase().doubleValue());
    }

    @Test
    void TesteFloatValue() {
        assertEquals(10.0f, valores.byteBase().floatValue());
    }

    @Test
    void TesteToStringWithPositiveValue() {
        assertEquals("127", Byte.toString(Byte.MAX_VALUE));
    }

    @Test
    void TesteToStringWithNegativeValue() {
        assertEquals("-128", Byte.toString(Byte.MIN_VALUE));
    }
}
