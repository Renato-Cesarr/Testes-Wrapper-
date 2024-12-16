package wrappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapperByte {

    Byte valor1;
    Byte valor2;
    Byte valor3;

    @BeforeEach
    void setup() {
        valor1 = 10;
        valor2 = 20;
        valor3 = 10;
    }

    @Test
    void TesteCompare() {
        assertTrue(Byte.compare(valor1, valor2) < 0);
        assertTrue(Byte.compare(valor2, valor1) > 0);
        assertEquals(0, Byte.compare(valor1, valor3));
    }

    @Test
    void TesteValueOf() {
        String valorString = "10";
        Byte valor = Byte.valueOf(valorString);
        assertEquals((byte) 10, valor);
        assertThrows(NumberFormatException.class, () -> Byte.valueOf("128"));
        assertThrows(NumberFormatException.class, () -> Byte.valueOf("-129"));
    }

    @Test
    void TesteParseByte() {
        String valorString = "10";
        assertEquals((byte) 10, Byte.parseByte(valorString));
        assertThrows(NumberFormatException.class, () -> Byte.parseByte("128"));
        assertThrows(NumberFormatException.class, () -> Byte.parseByte("-129"));
    }

    @Test
    void TesteToString() {
        assertEquals("10", valor1.toString());
    }

    @Test
    void TesteHashCode() {
        assertEquals(valor1.hashCode(), Byte.valueOf((byte) 10).hashCode());
    }

    @Test
    void TesteEquals() {
        assertTrue(valor1.equals(valor3));
        assertFalse(valor1.equals(valor2));
    }

    @Test
    void TesteMax() {
        assertEquals((byte) 20, (byte) Math.max(valor1, valor2));
    }

    @Test
    void TesteMin() {
        assertEquals((byte) 10, (byte) Math.min(valor1, valor2));
    }

    @Test
    void TesteSum() {
        assertEquals((byte) (valor1 + valor2), (byte) (valor1 + valor2));
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
        assertEquals(10.0f, valor1.floatValue());
    }

    @Test
    void TesteDoubleValue() {
        assertEquals(10.0, valor1.doubleValue());
    }
}
