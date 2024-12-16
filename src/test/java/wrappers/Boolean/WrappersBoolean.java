package wrappers.Boolean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapperBoolean {

    RecordBoolean recordBoolean;

    @BeforeEach
    void setup() {
        recordBoolean = new RecordBoolean(true, false, null, true, false);
    }

    @Test
    void TesteCompareTo() {
        assertEquals(0, recordBoolean.booleanTrue().compareTo(true));
        assertTrue(recordBoolean.booleanTrue().compareTo(false) > 0);
        assertTrue(recordBoolean.booleanFalse().compareTo(true) < 0);
    }

    @Test
    void TesteEquals() {
        assertTrue(recordBoolean.booleanTrue().equals(true));
        assertFalse(recordBoolean.booleanTrue().equals(false));
    }

    @Test
    void TesteBooleanValue() {
        assertTrue(recordBoolean.booleanTrue());
        assertFalse(recordBoolean.booleanFalse());
    }

    @Test
    void TesteToString() {
        assertEquals("true", recordBoolean.booleanTrue().toString());
        assertEquals("false", recordBoolean.booleanFalse().toString());
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
        assertNull(recordBoolean.booleanNull());
    }

    @Test
    void TestePrimitiveBoolean() {
        assertTrue(recordBoolean.primTrue());
        assertFalse(recordBoolean.primFalse());
    }

    @Test
    void TesteToStringWithPrimitiveTrue() {
        assertEquals("true", Boolean.toString(recordBoolean.primTrue()));
    }

    @Test
    void TesteToStringWithPrimitiveFalse() {
        assertEquals("false", Boolean.toString(recordBoolean.primFalse()));
    }

    @Test
    void TesteParseBooleanWithInvalidString() {
        assertFalse(Boolean.parseBoolean("123"));
        assertFalse(Boolean.parseBoolean("test"));
    }
}
