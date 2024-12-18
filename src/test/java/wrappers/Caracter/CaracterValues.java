package wrappers.Caracter;

import java.util.Arrays;
import java.util.List;

public enum CaracterValues {
	LETRA_A('A'), LETRA_Z('Z'), NUMERO_ZERO('0'), NUMERO_NOVE('9'), SIMBOLO_EXCLAMACAO('!'), ESPACO(' '),
	NOVA_LINHA('\n');

	private final char valor;

	CaracterValues(char valor) {
		this.valor = valor;
	}

	public char getValor() {
		return valor;
	}

	public static List<Character> getAllValues() {
		return Arrays.asList(LETRA_A.getValor(), LETRA_Z.getValor(), NUMERO_ZERO.getValor(), NUMERO_NOVE.getValor(),
				SIMBOLO_EXCLAMACAO.getValor(), ESPACO.getValor(), NOVA_LINHA.getValor());
	}
}
