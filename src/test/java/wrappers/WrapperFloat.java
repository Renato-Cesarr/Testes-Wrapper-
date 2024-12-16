package wrappers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapperFloat {

    Float valor1;
    Float valor2;
    Float valor3;

    @BeforeEach
    void setup() {
        valor1 = 10.5f;
        valor2 = 20.5f;
        valor3 = 10.5f;
    }

    @Test
    void TesteCompare() {
        assertTrue(Float.compare(valor1, valor2) < 0);
        assertTrue(Float.compare(valor2, valor1) > 0);
        assertEquals(0, Float.compare(valor1, valor3));
    }

    @Test
    void TesteIsNaN() {
        Float valorNaN = Float.NaN;
        assertTrue(valorNaN.isNaN());
        assertFalse(valor1.isNaN());
    }

    @Test
    void TesteIsInfinite() {
        Float valorPositivoInfinito = Float.POSITIVE_INFINITY;
        Float valorNegativoInfinito = Float.NEGATIVE_INFINITY;

        assertTrue(valorPositivoInfinito.isInfinite());
        assertTrue(valorNegativoInfinito.isInfinite());
        assertFalse(valor1.isInfinite());
    }

    @Test
    void TesteParseFloat() {
        String valorString = "10.5";
        assertEquals(10.5f, Float.parseFloat(valorString));
    }

    @Test
    void TesteValueOf() {
        String valorString = "10.5";
        Float valor = Float.valueOf(valorString);
        assertEquals(10.5f, valor);
    }

    @Test
    void TesteToString() {
        assertEquals("10.5", valor1.toString());
    }

    @Test
    void TesteFloatToIntBits() {
        assertEquals(Float.floatToIntBits(valor1), Float.floatToIntBits(10.5f));
    }

    @Test
    void TesteFloatToRawIntBits() {
        assertEquals(Float.floatToRawIntBits(valor1), Float.floatToRawIntBits(10.5f));
    }

    @Test
    void TesteIntBitsToFloat() {
        int bits = Float.floatToIntBits(10.5f);
        assertEquals(10.5f, Float.intBitsToFloat(bits));
    }

    @Test
    void TesteHashCode() {
        assertEquals(valor1.hashCode(), Float.valueOf(10.5f).hashCode());
    }

    @Test
    void TesteEquals() {
        assertTrue(valor1.equals(valor3));
        assertFalse(valor1.equals(valor2));
    }

    @Test
    void TesteMax() {
        assertEquals(20.5f, Float.max(valor1, valor2));
    }

    @Test
    void TesteMin() {
        assertEquals(10.5f, Float.min(valor1, valor2));
    }

    @Test
    void TesteSum() {
        assertEquals(31.0f, Float.sum(valor1, valor2));
    }

    @Test
    void TesteByteValue() {
        assertEquals((byte) 10, valor1.byteValue());
    }

    @Test
    void TesteShortValue() {
        assertEquals((short) 10, valor1.shortValue());
    }

    @Test
    void TesteIntValue() {
        assertEquals(10, valor1.intValue());
    }

    @Test
    void TesteLongValue() {
        assertEquals(10L, valor1.longValue());
    }

    @Test
    void TesteFloatValue() {
        assertEquals(10.5f, valor1.floatValue());
    }

    @Test
    void TesteDoubleValue() {
        assertEquals(10.5, valor1.doubleValue());
    }
}
