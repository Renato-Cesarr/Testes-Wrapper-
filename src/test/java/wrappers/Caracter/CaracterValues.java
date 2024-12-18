package wrappers.Caracter;

public enum CaracterValues {
	CARACTER_A('l'), CARACTER_B('a'), CARACTER_C('Z'), CARACTER_D('y');

	private final char valor;

	CaracterValues(char valor) {
		this.valor = valor;
	}

	public char getValor() {
		return valor;
	}
	
}
