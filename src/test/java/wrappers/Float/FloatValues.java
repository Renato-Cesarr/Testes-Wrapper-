package wrappers.Float;

import java.util.Arrays;
import java.util.List;

public enum FloatValues {
	VALORES_PEQUENOS(Arrays.asList(1.5f, 2.5f, 0.5f, -1.0f, -2.5f)),
	VALORES_GRANDES(Arrays.asList(10.0f, 20.5f, 30.1f, 40.8f, 50.9f)),
	VALORES_MISTURADOS(Arrays.asList(-10.5f, 0f, 15.3f, Float.NaN, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY)),
	VALORES_DUPLICADOS(Arrays.asList(10.5f, 10.5f, 20.0f, 10.5f)),
	VALORES_ESPECIAIS(Arrays.asList(Float.NaN, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, 0.0f, -0.0f)),
	VALOR_CONSTANTE(Arrays.asList(10.0f, 20.0f));

	private final List<Float> valores;

	FloatValues(List<Float> valores) {
		this.valores = valores;
	}

	public List<Float> getValores() {
		return valores;
	}
}
