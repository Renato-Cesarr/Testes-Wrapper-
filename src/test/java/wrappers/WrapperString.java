package wrappers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapperString {

    String textoBase;
    String textoBaseUpperCase;
    String textoBaseLowerCase;
    String textoBaseTrimmed;
    
    String textoSplit;
    String textoFormatado;
    String textoReplaceAll;
    
    @BeforeEach
    void setup() {
        textoBase = "teste";
        textoBaseUpperCase = "TESTE";
        textoBaseLowerCase = "teste";
        textoBaseTrimmed = "  teste  ";
        
        textoSplit = "um,two,tres";
        textoFormatado = String.format("Nome: %s, Idade: %d", "João", 25);
        textoReplaceAll = "a1b2c3";
    }

    @Test
    void TesteCharAt() {
        assertEquals('t', textoBase.charAt(0));
        assertEquals('e', textoBase.charAt(1));
    }

    @Test
    void TesteCompareTo() {
        String texto2 = "teste";
        String texto3 = "outro";
        
        assertEquals(0, textoBase.compareTo(texto2));
        assertTrue(textoBase.compareTo(texto3) < 0);
        assertTrue(texto3.compareTo(textoBase) > 0);
    }

    @Test
    void TesteContains() {
        assertTrue(textoBase.contains("tes"));
        assertFalse(textoBase.contains("outro"));
    }

    @Test
    void TesteEndsWith() {
        assertTrue(textoBase.endsWith("teste"));
        assertFalse(textoBase.endsWith("outro"));
    }

    @Test
    void TesteEquals() {
        assertTrue(textoBase.equals("teste"));
        assertFalse(textoBase.equals("outro"));
    }

    @Test
    void TesteIndexOf() {
        assertEquals(0, textoBase.indexOf("t"));
        assertEquals(-1, textoBase.indexOf("outro"));
    }

    @Test
    void TesteIsEmpty() {
        String textoVazio = "";
        assertFalse(textoBase.isEmpty());
        assertTrue(textoVazio.isEmpty());
    }

    @Test
    void TesteLength() {
        assertEquals(5, textoBase.length());
    }

    @Test
    void TesteReplace() {
        assertEquals("tezte", textoBase.replace('s', 'z'));
    }

    @Test
    void TesteSplit() {
        String[] partes = textoSplit.split(",");
        assertEquals(3, partes.length);
        assertEquals("um", partes[0]);
        assertEquals("two", partes[1]);
        assertEquals("tres", partes[2]);
    }

    @Test
    void TesteStartsWith() {
        assertTrue(textoBase.startsWith("te"));
        assertFalse(textoBase.startsWith("out"));
    }

    @Test
    void TesteSubString() {
        assertEquals("tes", textoBase.substring(0, 3));
        assertEquals("te", textoBase.substring(2, 4));
    }

    @Test
    void TesteToLowerCase() {
        assertEquals(textoBaseLowerCase, textoBaseUpperCase.toLowerCase());
    }

    @Test
    void TesteToUpperCase() {
        assertEquals(textoBaseUpperCase, textoBaseLowerCase.toUpperCase());
    }

    @Test
    void TesteTrim() {
        assertEquals("teste", textoBaseTrimmed.trim());
    }

    @Test
    void TesteValueOf() {
        int numero = 123;
        assertEquals("123", String.valueOf(numero));
    }

    @Test
    void TesteFormat() {
        assertEquals(textoFormatado, String.format("Nome: João, Idade: 25"));
    }

    @Test
    void TesteReplaceAll() {
        assertEquals("abc", textoReplaceAll.replaceAll("[0-9]", ""));
    }

    @Test
    void TesteMatches() {
        assertTrue(textoBase.matches(".*\\w.*"));
        assertFalse(textoBase.matches(".*\\d.*"));
    }

    @Test
    void TesteCodePointAt() {
        assertEquals(116, textoBase.codePointAt(0));
    }

    @Test
    void TesteCodePointBefore() {
        assertEquals(116, textoBase.codePointBefore(1));
    }

    @Test
    void TesteGetBytes() {
        byte[] bytes = textoBase.getBytes();
        assertEquals(5, bytes.length);
    }

    @Test
    void TesteCompareToIgnoreCase() {
        assertEquals(0, textoBase.compareToIgnoreCase(textoBaseUpperCase));
    }

    @Test
    void TesteContainsIgnoreCase() {
        assertTrue(textoBase.toLowerCase().contains("teste"));
    }
    
    @Test
    void TesteJoin() {
        String textoJoin = String.join(",", "um", "dois", "tres");
        assertEquals("um,dois,tres", textoJoin);
    }
}
