package wrappers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersLong {

    Long longBase;
    Long valorBase;
    Long longMax;
    Long longMin;

    @BeforeEach
    void setup() {
        longBase = 100L;
        valorBase = 100L;
        longMax = Long.MAX_VALUE;
        longMin = Long.MIN_VALUE;
    }

    @Test
    void TesteCompareTo() {
        assertEquals(0, longBase.compareTo(100L));
        assertTrue(longBase.compareTo(50L) > 0);
        assertTrue(longBase.compareTo(150L) < 0);
    }

    @Test
    void TesteEquals() {
        assertTrue(longBase.equals(100L));
        assertFalse(longBase.equals(150L));
    }

    @Test
    void TesteMaxValue() {
        assertEquals(Long.MAX_VALUE, longMax);
    }

    @Test
    void TesteMinValue() {
        assertEquals(Long.MIN_VALUE, longMin);
    }

    @Test
    void TesteValueOf() {
        assertEquals(longBase, Long.valueOf("100"));
        assertThrows(NumberFormatException.class, () -> Long.valueOf("invalid"));
    }

    @Test
    void TesteLongToString() {
        assertEquals("100", longBase.toString());
    }

    @Test
    void TesteParseLong() {
        assertEquals(100L, Long.parseLong("100"));
        assertThrows(NumberFormatException.class, () -> Long.parseLong("invalid"));
    }

    @Test
    void TesteCompare() {
        assertEquals(0, Long.compare(100L, 100L));
        assertTrue(Long.compare(50L, 100L) < 0);
        assertTrue(Long.compare(150L, 100L) > 0);
    }

    @Test
    void TesteToString() {
        assertEquals("100", longBase.toString());
    }

    @Test
    void TesteValueOfPrimitive() {
        assertEquals(longBase, Long.valueOf(valorBase));
    }

    @Test
    void TesteParseLongWithRadix() {
        assertEquals(100L, Long.parseLong("64", 16));  // 64 é 100 em base 16
        assertThrows(NumberFormatException.class, () -> Long.parseLong("ZZ", 16));
    }

    @Test
    void TesteShortValue() {
        assertEquals(100, longBase.shortValue());
    }

    @Test
    void TesteIntValue() {
        assertEquals(100, longBase.intValue());
    }

    @Test
    void TesteLongValue() {
        assertEquals(100L, longBase.longValue());
    }

    @Test
    void TesteDoubleValue() {
        assertEquals(100.0, longBase.doubleValue());
    }

    @Test
    void TesteFloatValue() {
        assertEquals(100.0f, longBase.floatValue());
    }

    @Test
    void TesteToStringWithPositiveValue() {
        assertEquals("9223372036854775807", Long.toString(Long.MAX_VALUE));
    }

    @Test
    void TesteToStringWithNegativeValue() {
        assertEquals("-9223372036854775808", Long.toString(Long.MIN_VALUE));
    }
}
