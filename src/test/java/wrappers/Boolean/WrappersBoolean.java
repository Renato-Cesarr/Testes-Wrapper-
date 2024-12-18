package wrappers.Boolean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapperBoolean {

    @BeforeEach
    void setup() {
    }

    @Test
    void TesteCompareTo() {
        assertEquals(0, BoolenaValues.TRUE.getValor().compareTo(true));
        assertTrue(BoolenaValues.TRUE.getValor().compareTo(false) > 0);
        assertTrue(BoolenaValues.FALSE.getValor().compareTo(true) < 0);
    }

    @Test
    void TesteEquals() {
        assertTrue(BoolenaValues.TRUE.getValor().equals(true));
        assertFalse(BoolenaValues.TRUE.getValor().equals(false));
    }

    @Test
    void TesteBooleanValue() {
        assertTrue(BoolenaValues.TRUE.getValor());
        assertFalse(BoolenaValues.FALSE.getValor());
    }

    @Test
    void TesteToString() {
        assertEquals("true", BoolenaValues.TRUE.getValor().toString());
        assertEquals("false", BoolenaValues.FALSE.getValor().toString());
    }

    @Test
    void TesteParseBoolean() {
        assertTrue(Boolean.parseBoolean("true"));
        assertFalse(Boolean.parseBoolean("false"));
        assertFalse(Boolean.parseBoolean("qualquer outro"));
    }

    @Test
    void TesteValueOf() {
        assertEquals(Boolean.TRUE, Boolean.valueOf(true));
        assertEquals(Boolean.FALSE, Boolean.valueOf(false));
        assertEquals(Boolean.FALSE, Boolean.valueOf("false"));
        assertEquals(Boolean.TRUE, Boolean.valueOf("true"));
    }

    @Test
    void TesteBooleanToString() {
        assertEquals("true", Boolean.toString(true));
        assertEquals("false", Boolean.toString(false));
    }

    @Test
    void TesteCompare() {
        assertEquals(0, Boolean.compare(true, true));
        assertTrue(Boolean.compare(true, false) > 0);
        assertTrue(Boolean.compare(false, true) < 0);
    }

    @Test
    void TesteLogicalOperations() {
        assertTrue(Boolean.logicalAnd(true, true));
        assertFalse(Boolean.logicalAnd(true, false));
        assertFalse(Boolean.logicalAnd(false, false));

        assertTrue(Boolean.logicalOr(true, false));
        assertFalse(Boolean.logicalOr(false, false));

        assertFalse(Boolean.logicalXor(true, true));
        assertTrue(Boolean.logicalXor(true, false));
    }

    @Test
    void TesteNullBoolean() {
        assertNull(BoolenaValues.NULL.getValor());
    }

    @Test
    void TestePrimitiveBoolean() {
        assertTrue(Boolean.TRUE);
        assertFalse(Boolean.FALSE);
    }

    @Test
    void TesteToStringWithPrimitiveTrue() {
        assertEquals("true", Boolean.toString(Boolean.TRUE));
    }

    @Test
    void TesteToStringWithPrimitiveFalse() {
        assertEquals("false", Boolean.toString(Boolean.FALSE));
    }

    @Test
    void TesteParseBooleanWithInvalidString() {
        assertFalse(Boolean.parseBoolean("123"));
        assertFalse(Boolean.parseBoolean("test"));
    }
}
