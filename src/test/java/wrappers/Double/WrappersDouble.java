package wrappers.Double;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersDouble{

    private RecordDouble valores;

    @BeforeEach
    void setup() {
        valores = new RecordDouble(
            1.0,                        
            2.0,                    
            1.0,                     
            Double.NaN,                   
            Double.POSITIVE_INFINITY,       
            Double.NEGATIVE_INFINITY,        
            "1.0",                          
            Double.doubleToLongBits(1.0)     
        );
    }

    @Test
    void TesteCompare() {
        int comparacao1 = Double.compare(valores.valor1(), valores.valor2());
        int comparacao2 = Double.compare(valores.valor2(), valores.valor1());
        int comparacao3 = Double.compare(valores.valor1(), valores.valor3());

        assertTrue(comparacao1 < 0);
        assertTrue(comparacao2 > 0);
        assertEquals(0, comparacao3);
    }

    @Test
    void TesteIsNaN() {
        assertTrue(valores.valorNaN().isNaN());
        assertFalse(valores.valor1().isNaN());
    }

    @Test
    void TesteIsInfinite() {
        assertTrue(valores.infinitoPositivo().isInfinite());
        assertTrue(valores.infinitoNegativo().isInfinite());
        assertFalse(valores.valor1().isInfinite());
    }

    @Test
    void TesteParseDouble() {
        assertEquals(valores.valor1(), Double.parseDouble(valores.valorString()));
    }

    @Test
    void TesteValueOf() {
        Double valor = Double.valueOf(valores.valorString());
        assertEquals(valores.valor1(), valor);
    }

    @Test
    void TesteToString() {
        assertEquals(valores.valorString(), valores.valor1().toString());
    }

    @Test
    void TesteDoubleToLongBits() {
        assertEquals(valores.valor1Bits(), Double.doubleToLongBits(valores.valor1()));
    }

    @Test
    void TesteDoubleToRawLongBits() {
        assertEquals(valores.valor1Bits(), Double.doubleToRawLongBits(valores.valor1()));
    }

    @Test
    void TesteLongBitsToDouble() {
        assertEquals(valores.valor1(), Double.longBitsToDouble(valores.valor1Bits()));
    }

    @Test
    void TesteHashCode() {
        assertEquals(valores.valor1().hashCode(), Double.valueOf(valores.valor1()).hashCode());
    }

    @Test
    void TesteEquals() {
        assertTrue(valores.valor1().equals(valores.valor3()));
        assertFalse(valores.valor1().equals(valores.valor2()));
    }

    @Test
    void TesteMax() {
        assertEquals(valores.valor2(), Double.max(valores.valor1(), valores.valor2()));
    }

    @Test
    void TesteMin() {
        assertEquals(valores.valor1(), Double.min(valores.valor1(), valores.valor2()));
    }

    @Test
    void TesteSum() {
        Double somaEsperada = valores.valor1() + valores.valor2();
        assertEquals(somaEsperada, Double.sum(valores.valor1(), valores.valor2()));
    }

    @Test
    void TesteByteValue() {
        Byte valorEsperado = valores.valor1().byteValue();
        assertEquals(valorEsperado, valores.valor1().byteValue());
    }

    @Test
    void TesteShortValue() {
        Short valorEsperado = valores.valor1().shortValue();
        assertEquals(valorEsperado, valores.valor1().shortValue());
    }

    @Test
    void TesteIntValue() {
        Integer valorEsperado = valores.valor1().intValue();
        assertEquals(valorEsperado, valores.valor1().intValue());
    }

    @Test
    void TesteLongValue() {
        Long valorEsperado = valores.valor1().longValue();
        assertEquals(valorEsperado, valores.valor1().longValue());
    }

    @Test
    void TesteFloatValue() {
        Float valorEsperado = valores.valor1().floatValue();
        assertEquals(valorEsperado, valores.valor1().floatValue());
    }

    @Test
    void TesteDoubleValue() {
        Double valorEsperado = valores.valor1().doubleValue();
        assertEquals(valorEsperado, valores.valor1().doubleValue());
    }
}
