package wrappers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapperDouble {

    Double valor1;
    Double valor2;
    Double valor3;

    @BeforeEach
    void setup() {
        valor1 = 10.5;
        valor2 = 20.5;
        valor3 = 10.5;
    }

    @Test
    void TesteCompare() {
        assertTrue(Double.compare(valor1, valor2) < 0);
        assertTrue(Double.compare(valor2, valor1) > 0);
        assertEquals(0, Double.compare(valor1, valor3));
    }

    @Test
    void TesteIsNaN() {
        Double valorNaN = Double.NaN;
        assertTrue(valorNaN.isNaN());
        assertFalse(valor1.isNaN());
    }

    @Test
    void TesteIsInfinite() {
        Double valorPositivoInfinito = Double.POSITIVE_INFINITY;
        Double valorNegativoInfinito = Double.NEGATIVE_INFINITY;

        assertTrue(valorPositivoInfinito.isInfinite());
        assertTrue(valorNegativoInfinito.isInfinite());
        assertFalse(valor1.isInfinite());
    }

    @Test
    void TesteParseDouble() {
        String valorString = "10.5";
        assertEquals(10.5, Double.parseDouble(valorString));
    }

    @Test
    void TesteValueOf() {
        String valorString = "10.5";
        Double valor = Double.valueOf(valorString);
        assertEquals(10.5, valor);
    }

    @Test
    void TesteToString() {
        assertEquals("10.5", valor1.toString());
    }

    @Test
    void TesteDoubleToLongBits() {
        assertEquals(Double.doubleToLongBits(valor1), Double.doubleToLongBits(10.5));
    }

    @Test
    void TesteDoubleToRawLongBits() {
        assertEquals(Double.doubleToRawLongBits(valor1), Double.doubleToRawLongBits(10.5));
    }

    @Test
    void TesteLongBitsToDouble() {
        long bits = Double.doubleToLongBits(10.5);
        assertEquals(10.5, Double.longBitsToDouble(bits));
    }

    @Test
    void TesteHashCode() {
        assertEquals(valor1.hashCode(), Double.valueOf(10.5).hashCode());
    }

    @Test
    void TesteEquals() {
        assertTrue(valor1.equals(valor3));
        assertFalse(valor1.equals(valor2));
    }

    @Test
    void TesteMax() {
        assertEquals(20.5, Double.max(valor1, valor2));
    }

    @Test
    void TesteMin() {
        assertEquals(10.5, Double.min(valor1, valor2));
    }

    @Test
    void TesteSum() {
        assertEquals(31.0, Double.sum(valor1, valor2));
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
