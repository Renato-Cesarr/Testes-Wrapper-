package wrappers.Caracter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersCaracter{

    private RecordCaracter valores;

    @BeforeEach
    void setup() {
        valores = new RecordCaracter('a', 'b', 'a');
    }

    @Test
    void TesteCompare() {
        assertTrue(Character.compare(valores.valor1(), valores.valor2()) < 0);
        assertTrue(Character.compare(valores.valor2(), valores.valor1()) > 0);
        assertEquals(0, Character.compare(valores.valor1(), valores.valor3()));
    }

    @Test
    void TesteValueOf() {
        String valorString = "a";
        Character valor = Character.valueOf(valorString.charAt(0));
        assertEquals('a', valor);
    }

    @Test
    void TesteParseCharacter() {
        String valorString = "a";
        assertEquals('a', valorString.charAt(0));
    }

    @Test
    void TesteToString() {
        assertEquals("a", valores.valor1().toString());
    }

    @Test
    void TesteHashCode() {
        assertEquals(valores.valor1().hashCode(), Character.valueOf('a').hashCode());
    }

    @Test
    void TesteEquals() {
        assertTrue(valores.valor1().equals(valores.valor3()));
        assertFalse(valores.valor1().equals(valores.valor2()));
    }

    @Test
    void TesteIsUpperCase() {
        assertFalse(Character.isUpperCase(valores.valor1()));
        assertTrue(Character.isUpperCase('A'));
    }

    @Test
    void TesteIsLowerCase() {
        assertTrue(Character.isLowerCase(valores.valor1()));
        assertFalse(Character.isLowerCase('A'));
    }

    @Test
    void TesteIsDigit() {
        assertFalse(Character.isDigit(valores.valor1()));
        assertTrue(Character.isDigit('3'));
    }

    @Test
    void TesteToUpperCase() {
        assertEquals('A', Character.toUpperCase(valores.valor1()));
    }

    @Test
    void TesteToLowerCase() {
        assertEquals('a', Character.toLowerCase('A'));
    }

    @Test
    void TesteCharValue() {
        assertEquals('a', valores.valor1().charValue());
    }

    @Test
    void TesteCodePoint() {
        int expectedCodePoint = (int) 'a';
        assertEquals(expectedCodePoint, Character.codePointAt(new char[]{valores.valor1()}, 0));
    }

    @Test
    void TesteIsWhitespace() {
        assertFalse(Character.isWhitespace(valores.valor1()));
        assertTrue(Character.isWhitespace(' '));
    }
}
