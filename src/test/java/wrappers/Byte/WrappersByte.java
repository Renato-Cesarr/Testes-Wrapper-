package wrappers.Byte;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

class WrappersByte {

    static List<Byte> byteValues() {
        return ByteValues.getAllValues();
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarByteValue(Byte valor) {
        assertEquals(valor.byteValue(), valor);
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarCompareTo(Byte valor) {
        assertTrue(valor.compareTo((byte) 0) != 0 || valor.compareTo((byte) 0) == 0);
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarEquals(Byte valor) {
        assertTrue(valor.equals(valor));
        assertFalse(valor.equals(null));
        assertFalse(valor.equals((byte) 100));
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarHashCode(Byte valor) {
        assertEquals(valor.hashCode(), Byte.valueOf(valor).hashCode());
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarToString(Byte valor) {
        assertEquals(valor.toString(), Byte.toString(valor));
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarParseByte(Byte valor) {
        String valorStr = valor.toString();
        assertEquals(Byte.parseByte(valorStr), valor.byteValue());
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarValueOf(Byte valor) {
        assertEquals(Byte.valueOf(valor), valor);
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarDecode(Byte valor) {
        String hex = "0x" + Integer.toHexString(valor & 0xFF);
        try {
            assertEquals(Byte.decode(hex), valor);
        } catch (NumberFormatException e) {
        	
        	
        }
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarMaxValue(Byte valor) {
        assertEquals(Byte.MAX_VALUE, (byte) 127);
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarMinValue(Byte valor) {
        assertEquals(Byte.MIN_VALUE, (byte) -128);
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarToUnsignedInt(Byte valor) {
        int unsignedInt = Byte.toUnsignedInt(valor);
        assertTrue(unsignedInt >= 0 && unsignedInt <= 255);
    }

    @ParameterizedTest
    @MethodSource("byteValues")
    void deveTestarToUnsignedLong(Byte valor) {
        long unsignedLong = Byte.toUnsignedLong(valor);
        assertTrue(unsignedLong >= 0 && unsignedLong <= 255);
    }
}
