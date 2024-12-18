package wrappers.String;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

class WrapperString {

    // Método que fornece os dados para os testes
    static List<String> stringValues() {
        return StringValues.getAllValues();
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarContainsParaTodosValores(String valor) {
        assertTrue(valor.contains(valor.substring(0, 3)));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarEndsWithParaTodosValores(String valor) {
        assertTrue(valor.endsWith(valor.substring(valor.length() - 3)));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarIndexOfParaTodosValores(String valor) {
        assertTrue(valor.indexOf(valor.substring(0, 3)) >= 0);
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarIsEmptyParaTodosValores(String valor) {
        if (valor.trim().isEmpty()) {
            assertTrue(valor.isEmpty());
        } else {
            assertFalse(valor.isEmpty());
        }
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarLengthParaTodosValores(String valor) {
        assertTrue(valor.length() > 0);
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarSplitParaTodosValores(String valor) {
        String[] partes = valor.split(",");
        assertTrue(partes.length >= 1);
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarStartsWithParaTodosValores(String valor) {
        assertTrue(valor.startsWith(valor.substring(0, 1)));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarSubStringParaTodosValores(String valor) {
        assertEquals(valor.substring(0, 3), valor.substring(0, 3));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarToLowerCaseParaTodosValores(String valor) {
        assertEquals(valor.toLowerCase(), valor.toLowerCase());
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarToUpperCaseParaTodosValores(String valor) {
        assertEquals(valor.toUpperCase(), valor.toUpperCase());
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarCharAtParaTodosValores(String valor) {
        assertNotNull(valor.charAt(0));
        assertNotNull(valor.charAt(1));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarCompareToParaTodosValores(String valor) {
        String texto = "teste";
        assertTrue(valor.compareTo(texto) != 0);
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarTrimParaTodosValores(String valor) {
        assertEquals(valor.trim(), valor.trim());
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarValueOfParaTodosValores(String valor) {
        assertEquals(String.valueOf(123), "123");
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarFormatParaTodosValores(String valor) {
        assertEquals(String.format("Valor: %s", valor), String.format("Valor: %s", valor));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarReplaceAllParaTodosValores(String valor) {
        assertEquals(valor.replaceAll("[0-9]", ""), valor.replaceAll("[0-9]", ""));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarCodePointAtParaTodosValores(String valor) {
        assertTrue(valor.codePointAt(0) > 0);
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarCodePointBeforeParaTodosValores(String valor) {
        assertTrue(valor.codePointBefore(1) > 0);
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarGetBytesParaTodosValores(String valor) {
        byte[] bytes = valor.getBytes();
        assertTrue(bytes.length > 0);
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarCompareToIgnoreCaseParaTodosValores(String valor) {
        assertEquals(0, valor.compareToIgnoreCase(valor.toUpperCase()));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void deveTestarContainsIgnoreCaseParaTodosValores(String valor) {
        assertTrue(valor.toLowerCase().contains(valor.toLowerCase().substring(0, 3)));
    }
}
