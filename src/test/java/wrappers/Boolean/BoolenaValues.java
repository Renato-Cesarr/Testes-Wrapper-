package wrappers.Boolean;

public enum BoolenaValues {
    TRUE(true),
    FALSE(false),
    NULL(null);

    private final Boolean valor;

    BoolenaValues(Boolean valor) {
        this.valor = valor;
    }

    public Boolean getValor() {
        return valor;
    }
}
