package wrappers.Long;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersLong {

    RecordLong valoresLong;

    @BeforeEach
    void setup() {
        valoresLong = new RecordLong(100L, 100L, Long.MAX_VALUE, Long.MIN_VALUE );
    }

    @Test
    void TesteCompareTo() {
        assertEquals(0, valoresLong.longBase().compareTo(100L));
        assertTrue(valoresLong.longBase().compareTo(50L) > 0);
        assertTrue(valoresLong.longBase().compareTo(150L) < 0);
    }

    @Test
    void TesteEquals() {
        assertTrue(valoresLong.longBase().equals(100L));
        assertFalse(valoresLong.longBase().equals(150L));
    }

    @Test
    void TesteMaxValue() {
        assertEquals(Long.MAX_VALUE, valoresLong.longMax());
    }

    @Test
    void TesteMinValue() {
        assertEquals(Long.MIN_VALUE, valoresLong.longMin());
    }

    @Test
    void TesteValueOf() {
        assertEquals(valoresLong.longBase(), Long.valueOf("100"));
        assertThrows(NumberFormatException.class, () -> Long.valueOf("invalid"));
    }

    @Test
    void TesteLongToString() {
        assertEquals("100", valoresLong.longBase().toString());
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
    void TesteValueOfPrimitive() {
        assertEquals(valoresLong.longBase(), Long.valueOf(valoresLong.valorBase()));
    }

    @Test
    void TesteParseLongWithRadix() {
        assertEquals(100L, Long.parseLong("64", 16)); 
        assertThrows(NumberFormatException.class, () -> Long.parseLong("ZZ", 16));
    }

    @Test
    void TesteShortValue() {
        assertEquals(100, valoresLong.longBase().shortValue());
    }

    @Test
    void TesteIntValue() {
        assertEquals(100, valoresLong.longBase().intValue());
    }

    @Test
    void TesteLongValue() {
        assertEquals(100L, valoresLong.longBase().longValue());
    }

    @Test
    void TesteDoubleValue() {
        assertEquals(100.0, valoresLong.longBase().doubleValue());
    }

    @Test
    void TesteFloatValue() {
        assertEquals(100.0f, valoresLong.longBase().floatValue());
    }

    @Test
    void TesteToStringComPositivoValor() {
        assertEquals("9223372036854775807", Long.toString(Long.MAX_VALUE));
    }

    @Test
    void TesteToStringComNegativoValor() {
        assertEquals("-9223372036854775808", Long.toString(Long.MIN_VALUE));
    }
}
