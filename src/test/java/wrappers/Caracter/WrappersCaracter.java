package wrappers.Caracter;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class WrappersCaracter {

    static Stream<Character> caracterValues() {
        return CaracterValues.getAllValues().stream();
    }

    static Stream<Character> digitValues() {
        return Stream.of(CaracterValues.NUMERO_ZERO.getValor(), CaracterValues.NUMERO_NOVE.getValor());
    }

    static Stream<Character> TolowerEUper() {
        return Stream.of(CaracterValues.LETRA_A.getValor(), CaracterValues.LETRA_Z.getValor());
    }

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarCharCount(Character valor) {
        int codePoint = Character.codePointAt(new char[] { valor }, 0);
        assertEquals(Character.charCount(codePoint), Character.charCount(codePoint));
    }

    @ParameterizedTest
    @MethodSource("digitValues")
    void deveTestarForDigit(Character valor) {
        int numericValue = Character.getNumericValue(valor);
        assertEquals(valor, Character.forDigit(numericValue, 10));
    }

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarIsDigit(Character valor) {
        boolean result = Character.isDigit(valor);
        assertEquals(result, Character.getNumericValue(valor) >= 0 && Character.getNumericValue(valor) <= 9);
    }

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarIsLetter(Character valor) {
        assertEquals(Character.isLetter(valor), Character.isAlphabetic(valor));
    }

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarIsLetterOrDigit(Character valor) {
        boolean isLetterOrDigit = Character.isLetter(valor) || Character.isDigit(valor);
        assertEquals(Character.isLetterOrDigit(valor), isLetterOrDigit);
    }

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarIsWhitespace(Character valor) {
        boolean result = Character.isWhitespace(valor);
        assertEquals(result, valor == ' ' || valor == '\t' || valor == '\n' || valor == '\r');
    }

    @ParameterizedTest
    @MethodSource("TolowerEUper")
    void deveTestarToLowerCase(Character valor) {
        if (Character.isLetter(valor)) {
            char lowerCase = Character.toLowerCase(valor);
            assertTrue(Character.isLowerCase(lowerCase));
        } else {
            assertEquals(valor, Character.toLowerCase(valor)); 
        }
    }

    @ParameterizedTest
    @MethodSource("TolowerEUper")
    void deveTestarToUpperCase(Character valor) {
        if (Character.isLetter(valor)) {
            char upperCase = Character.toUpperCase(valor);
            assertTrue(Character.isUpperCase(upperCase));
        } else {
            assertEquals(valor, Character.toUpperCase(valor)); 
        }
    } 

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarToString(Character valor) {
        assertEquals(Character.toString(valor), String.valueOf(valor));
    }

   /* @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarGetNumericValue(Character valor) {
        if (Character.isDigit(valor)) {
            assertEquals(Character.getNumericValue(valor), Integer.parseInt(String.valueOf(valor)));
        } else {
            assertEquals(-1, Character.getNumericValue(valor));}
    } */

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarIsDefined(Character valor) {
        assertEquals(Character.isDefined(valor), Character.getType(valor) != Character.UNASSIGNED);
    }

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarIsISOControl(Character valor) {
        boolean result = Character.isISOControl(valor);
        assertEquals(result, (valor >= 0x00 && valor <= 0x1F) || (valor >= 0x7F && valor <= 0x9F));
    }

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarIsAlphabetic(Character valor) {
        assertEquals(Character.isAlphabetic(valor), Character.isLetter(valor));
    }

    @ParameterizedTest
    @MethodSource("caracterValues")
    void deveTestarIsSurrogate(Character valor) {
        assertEquals(Character.isSurrogate(valor), Character.isSurrogatePair(valor, valor));
    }
}
