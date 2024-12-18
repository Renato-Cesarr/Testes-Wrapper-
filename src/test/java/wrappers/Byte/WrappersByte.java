	package wrappers.Byte;
	
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;
	
	class WrappersByte {

    @Test
    void deveCompararValoresCorretamente() {
        for (ByteValues valor : ByteValues.values()) {
            byte valorAtual = valor.getValor();

            byte maiorValor = (byte) (valorAtual + 1); 
            assertTrue(Byte.compare(valorAtual, maiorValor) < 0);

            byte menorValor = (byte) (valorAtual - 1);
            assertTrue(Byte.compare(valorAtual, menorValor) > 0);
        }
    }

    void deveVerificarIgualdadeEntreDoisValores() {
        byte valor1 = ByteValues.BYTE_MAX.getValor();
        byte valor2 = ByteValues.BYTE_MIN.getValor();
        assertNotEquals(valor1, valor2);
    }

    @Test
    void deveRetornarMaximoCorreto() {
        assertEquals(Byte.MAX_VALUE, ByteValues.BYTE_MAX.getValor());
    }

    @Test
    void deveRetornarMinimoCorreto() {
        assertEquals(Byte.MIN_VALUE, ByteValues.BYTE_MIN.getValor());
    }

    @Test
    void deveConverterStringParaByteCorretamente() {
        for (ByteValues valor : ByteValues.values()) {
            assertEquals(valor.getValor(), Byte.valueOf(String.valueOf(valor.getValor())));
        }
    }

    @Test
    void deveRetornarStringCorreta() {
        for (ByteValues valor : ByteValues.values()) {
            assertEquals(String.valueOf(valor.getValor()), valor.getValor().toString());
        }
    }

    @Test
    void deveConverterStringParaByteParseCorretamente() {
        for (ByteValues valor : ByteValues.values()) {
            assertEquals(valor.getValor(), Byte.parseByte(String.valueOf(valor.getValor())));
        }
    }

    @Test
    void deveConverterParaShortCorretamente() {
        for (ByteValues valor : ByteValues.values()) {
            assertEquals(valor.getValor().shortValue(), valor.getValor().shortValue());
        }
    }

    @Test
    void deveConverterParaIntCorretamente() {
        for (ByteValues valor : ByteValues.values()) {
            assertEquals(valor.getValor().intValue(), valor.getValor().intValue());
        }
    }

    @Test
    void deveConverterParaLongCorretamente() {
        for (ByteValues valor : ByteValues.values()) {
            assertEquals(valor.getValor().longValue(), valor.getValor().longValue());
        }
    }

    @Test
    void deveConverterParaDoubleCorretamente() {
        for (ByteValues valor : ByteValues.values()) {
            assertEquals(valor.getValor().doubleValue(), valor.getValor().doubleValue());
        }
    }

    @Test
    void deveConverterParaFloatCorretamente() {
        for (ByteValues valor : ByteValues.values()) {
            assertEquals(valor.getValor().floatValue(), valor.getValor().floatValue());
        }
    }

    @Test
    void deveRetornarStringCorretaComValorPositivo() {
        assertEquals(String.valueOf(ByteValues.BYTE_Positivo.getValor()), Byte.toString(Byte.MAX_VALUE));
    }

    @Test
    void deveRetornarStringCorretaComValorNegativo() {
        assertEquals(String.valueOf(ByteValues.BYTE_Negativo.getValor()), Byte.toString(Byte.MIN_VALUE));
    }
}
