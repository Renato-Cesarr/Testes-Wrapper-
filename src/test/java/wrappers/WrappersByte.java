package wrappers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersByte {

    Byte byteBase;
    byte valorBase;
    Byte byteMax;
    Byte byteMin;

    @BeforeEach
    void setup() {
        byteBase = 10;
        valorBase = 10;
        byteMax = Byte.MAX_VALUE;
        byteMin = Byte.MIN_VALUE;
    }

    @Test
    void TesteCompareTo() {
        assertEquals(0, byteBase.compareTo((byte) 10));
        assertTrue(byteBase.compareTo((byte) 5) > 0);
        assertTrue(byteBase.compareTo((byte) 15) < 0);
    }

    @Test
    void TesteEquals() {
        assertTrue(byteBase.equals((byte) 10));
        assertFalse(byteBase.equals((byte) 15));
    }

    @Test
    void TesteMaxValue() {
        assertEquals(Byte.MAX_VALUE, byteMax);
    }

    @Test
    void TesteMinValue() {
        assertEquals(Byte.MIN_VALUE, byteMin);
    }

    @Test
    void TesteValueOf() {
        assertEquals(byteBase, Byte.valueOf("10"));
        assertThrows(NumberFormatException.class, () -> Byte.valueOf("invalid"));
    }

    @Test
    void TesteByteToString() {
        assertEquals("10", byteBase.toString());
    }

    @Test
    void TesteParseByte() {
        assertEquals(10, Byte.parseByte("10"));
        assertThrows(NumberFormatException.class, () -> Byte.parseByte("invalid"));
    }

    @Test
    void TesteCompare() {
        assertEquals(0, Byte.compare((byte) 10, (byte) 10));
        assertTrue(Byte.compare((byte) 5, (byte) 10) < 0);
        assertTrue(Byte.compare((byte) 15, (byte) 10) > 0);
    }

    @Test
    void TesteToString() {
        assertEquals("10", byteBase.toString());
    }

    @Test
    void TesteValueOfPrimitive() {
        assertEquals(byteBase, Byte.valueOf(valorBase));
    }

    @Test
    void TesteParseByteWithRadix() {
        assertEquals(10, Byte.parseByte("A", 16));  // A é 10 em base 16
        assertThrows(NumberFormatException.class, () -> Byte.parseByte("Z", 16));
    }

    @Test
    void TesteShortValue() {
        assertEquals(10, byteBase.shortValue());
    }

    @Test
    void TesteIntValue() {
        assertEquals(10, byteBase.intValue());
    }

    @Test
    void TesteLongValue() {
        assertEquals(10L, byteBase.longValue());
    }

    @Test
    void TesteDoubleValue() {
        assertEquals(10.0, byteBase.doubleValue());
    }

    @Test
    void TesteFloatValue() {
        assertEquals(10.0f, byteBase.floatValue());
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
