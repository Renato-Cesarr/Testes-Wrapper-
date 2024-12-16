package wrappers.Float;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

class WrapperFloat {

    RecordFloat valores;

    @BeforeEach
    void setup() {
        valores = new RecordFloat(
            10.5f,  
            20.5f,   
            10.5f,  
            10.5f,   
            20.5f,  
            31.0f,  
            10L,     
            "10.5",  
            10,      
            10.5     
        );
    }

    @Test
    void TesteCompare() {
        assertTrue(Float.compare(valores.valor1(), valores.valor2()) < 0);
        assertTrue(Float.compare(valores.valor2(), valores.valor1()) > 0);
        assertEquals(0, Float.compare(valores.valor1(), valores.valor3()));
    }

    @Test
    void TesteIsNaN() {
        Float valorNaN = Float.NaN;
        assertTrue(valorNaN.isNaN());
        assertFalse(valores.valor1().isNaN());
    }

    @Test
    void TesteIsInfinite() {
        Float valorPositivoInfinito = Float.POSITIVE_INFINITY;
        Float valorNegativoInfinito = Float.NEGATIVE_INFINITY;

        assertTrue(valorPositivoInfinito.isInfinite());
        assertTrue(valorNegativoInfinito.isInfinite());
        assertFalse(valores.valor1().isInfinite());
    }

    @Test
    void TesteParseFloat() {
        assertEquals(valores.valor10_5f(), Float.parseFloat(valores.valorString()));
    }

    @Test
    void TesteValueOf() {
        Float valor = Float.valueOf(valores.valorString());
        assertEquals(valores.valor10_5f(), valor);
    }

    @Test
    void TesteToString() {
        assertEquals(valores.valor10_5f().toString(), valores.valor1().toString());
    }

    @Test
    void TesteFloatToIntBits() {
        assertEquals(Float.floatToIntBits(valores.valor1()), Float.floatToIntBits(valores.valor10_5f()));
    }

    @Test
    void TesteFloatToRawIntBits() {
        assertEquals(Float.floatToRawIntBits(valores.valor1()), Float.floatToRawIntBits(valores.valor10_5f()));
    }

    @Test
    void TesteIntBitsToFloat() {
        int bits = Float.floatToIntBits(valores.valor10_5f());
        assertEquals(valores.valor10_5f(), Float.intBitsToFloat(bits));
    }

    @Test
    void TesteHashCode() {
        assertEquals(valores.valor1().hashCode(), Float.valueOf(valores.valor10_5f()).hashCode());
    }

    @Test
    void TesteEquals() {
        assertTrue(valores.valor1().equals(valores.valor3()));
        assertFalse(valores.valor1().equals(valores.valor2()));
    }

    @Test
    void TesteMax() {
        assertEquals(valores.valor20_5f(), Float.max(valores.valor1(), valores.valor2()));
    }

    @Test
    void TesteMin() {
        assertEquals(valores.valor10_5f(), Float.min(valores.valor1(), valores.valor2()));
    }

    @Test
    void TesteSum() {
        assertEquals(valores.valorSoma(), Float.sum(valores.valor1(), valores.valor2()));
    }

    @Test
    void TesteByteValue() {
        assertEquals((byte) valores.valor10(), valores.valor1().byteValue());
    }

    @Test
    void TesteShortValue() {
        assertEquals((short) valores.valor10(), valores.valor1().shortValue());
    }

    @Test
    void TesteIntValue() {
        assertEquals(valores.valor10(), valores.valor1().intValue());
    }

    @Test
    void TesteLongValue() {
        assertEquals(valores.valor10L(), valores.valor1().longValue());
    }

    @Test
    void TesteFloatValue() {
        assertEquals(valores.valor10_5f(), valores.valor1().floatValue());
    }

    @Test
    void TesteDoubleValue() {
        assertEquals(valores.valorDouble(), valores.valor1().doubleValue());
    }
}
