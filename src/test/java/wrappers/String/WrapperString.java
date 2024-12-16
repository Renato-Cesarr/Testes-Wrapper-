package wrappers.String;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapperString {

    RecordString textos;

    @BeforeEach
    void setup() {
        textos = new RecordString(
            "teste", 
            "TESTE",  
            "teste",  
            "  teste  ", 
            "um,two,tres",      
            String.format("Nome: %s, Idade: %d", "João", 25),
            "a1b2c3"               
        );
    }

    @Test
    void TesteCharAt() {
        assertEquals('t', textos.textoBase().charAt(0));
        assertEquals('e', textos.textoBase().charAt(1));
    }

    @Test
    void TesteCompareTo() {
        String texto2 = "teste";
        String texto3 = "outro";
        assertEquals(0, textos.textoBase().compareTo(texto2));
        assertTrue(textos.textoBase().compareTo(texto3) > 0);
        assertTrue(texto3.compareTo(textos.textoBase()) < 0);
    }
    
    @Test
    void TesteContains() {
        assertTrue(textos.textoBase().contains("tes"));
        assertFalse(textos.textoBase().contains("outro"));
    }

    @Test
    void TesteEndsWith() {
        assertTrue(textos.textoBase().endsWith("teste"));
        assertFalse(textos.textoBase().endsWith("outro"));
    }

    @Test
    void TesteEquals() {
        assertTrue(textos.textoBase().equals("teste"));
        assertFalse(textos.textoBase().equals("outro"));
    }

    @Test
    void TesteIndexOf() {
        assertEquals(0, textos.textoBase().indexOf("t"));
        assertEquals(-1, textos.textoBase().indexOf("outro"));
    }

    @Test
    void TesteIsEmpty() {
        String textoVazio = "";
        assertFalse(textos.textoBase().isEmpty());
        assertTrue(textoVazio.isEmpty());
    }

    @Test
    void TesteLength() {
        assertEquals(5, textos.textoBase().length());
    }

    @Test
    void TesteReplace() {
        assertEquals("tezte", textos.textoBase().replace('s', 'z'));
    }

    @Test
    void TesteSplit() {
        String[] partes = textos.textoSplit().split(",");
        assertEquals(3, partes.length);
        assertEquals("um", partes[0]);
        assertEquals("two", partes[1]);
        assertEquals("tres", partes[2]);
    }

    @Test
    void TesteStartsWith() {
        assertTrue(textos.textoBase().startsWith("te"));
        assertFalse(textos.textoBase().startsWith("out"));
    }

    @Test
    void TesteSubString() {
        assertEquals("tes", textos.textoBase().substring(0, 3));
    }

    @Test
    void TesteToLowerCase() {
        assertEquals(textos.textoBaseLowerCase(), textos.textoBaseUpperCase().toLowerCase());
    }

    @Test
    void TesteToUpperCase() {
        assertEquals(textos.textoBaseUpperCase(), textos.textoBaseLowerCase().toUpperCase());
    }

    @Test
    void TesteTrim() {
        assertEquals("teste", textos.textoBaseTrimmed().trim());
    }

    @Test
    void TesteValueOf() {
        int numero = 123;
        assertEquals("123", String.valueOf(numero));
    }

    @Test
    void TesteFormat() {
        assertEquals(textos.textoFormatado(), String.format("Nome: João, Idade: 25"));
    }

    @Test
    void TesteReplaceAll() {
        assertEquals("abc", textos.textoReplaceAll().replaceAll("[0-9]", ""));
    }

    @Test
    void TesteMatches() {
        assertTrue(textos.textoBase().matches(".*\\w.*"));
        assertFalse(textos.textoBase().matches(".*\\d.*"));
    }

    @Test
    void TesteCodePointAt() {
        assertEquals(116, textos.textoBase().codePointAt(0));
    }

    @Test
    void TesteCodePointBefore() {
        assertEquals(116, textos.textoBase().codePointBefore(1));
    }

    @Test
    void TesteGetBytes() {
        byte[] bytes = textos.textoBase().getBytes();
        assertEquals(5, bytes.length);
    }

    @Test
    void TesteCompareToIgnoreCase() {
        assertEquals(0, textos.textoBase().compareToIgnoreCase(textos.textoBaseUpperCase()));
    }

    @Test
    void TesteContainsIgnoreCase() {
        assertTrue(textos.textoBase().toLowerCase().contains("teste"));
    }
    
    @Test
    void TesteJoin() {
        String textoJoin = String.join(",", "um", "dois", "tres");
        assertEquals("um,dois,tres", textoJoin);
    }
}
