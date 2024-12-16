package wrappers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapperBoolean {

    Boolean booleanTrue;
    Boolean booleanFalse;
    Boolean booleanNull;
    Boolean primTrue;
    Boolean primFalse;

    @BeforeEach
    void setup() {
        booleanTrue = true;
        booleanFalse = false;
        booleanNull = null;
        primTrue = true;
        primFalse = false;
    }

    @Test
    void TesteCompareTo() {
        assertEquals(0, booleanTrue.compareTo(true));
        assertTrue(booleanTrue.compareTo(false) > 0);
        assertTrue(booleanFalse.compareTo(true) < 0);
    }

    @Test
    void TesteEquals() {
        assertTrue(booleanTrue.equals(true));
        assertFalse(booleanTrue.equals(false));
    }

    @Test
    void TesteBooleanValue() {
        assertTrue(booleanTrue.booleanValue());
        assertFalse(booleanFalse.booleanValue());
    }

    @Test
    void TesteToString() {
        assertEquals("true", booleanTrue.toString());
        assertEquals("false", booleanFalse.toString());
    }

    @Test
    void TesteParseBoolean() {
        assertTrue(Boolean.parseBoolean("true"));
        assertFalse(Boolean.parseBoolean("false"));
        assertFalse(Boolean.parseBoolean("any other string")); // Qualquer string diferente de "true" retorna false
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
        assertNull(booleanNull);
    }

    @Test
    void TestePrimitiveBoolean() {
        assertTrue(primTrue);
        assertFalse(primFalse);
    }

    @Test
    void TesteToStringWithPrimitiveTrue() {
        assertEquals("true", Boolean.toString(primTrue));
    }

    @Test
    void TesteToStringWithPrimitiveFalse() {
        assertEquals("false", Boolean.toString(primFalse));
    }

    @Test
    void TesteParseBooleanWithInvalidString() {
        assertFalse(Boolean.parseBoolean("123"));
        assertFalse(Boolean.parseBoolean("test"));
    }
}
