package wrappers.Byte;

public enum ByteValues {
	BYTE_10((byte) 1), BYTE_MAX(Byte.MAX_VALUE), BYTE_MIN(Byte.MIN_VALUE), BYTE_Positivo((byte) 127),
	BYTE_Negativo((byte) -128);

	private final Byte valor;

	ByteValues(Byte valor) {
		this.valor = valor;
	}

	public Byte getValor() {
		return valor;
	}
}
