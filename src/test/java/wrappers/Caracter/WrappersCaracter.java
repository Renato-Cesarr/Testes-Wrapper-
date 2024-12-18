package wrappers.Caracter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrappersCaracter {

    @BeforeEach
    void setup() {
    }

    @Test
    void deveRetornarValorCorretoAoUsarValueOf() {
        for (CaracterValues valor : CaracterValues.values()) {
            char esperado = valor.getValor();
            Character caracter = Character.valueOf(esperado);
            assertEquals(esperado, caracter.charValue());
        }
    }

    @Test
    void deveRetornarValorCorretoAoUsarParseCharacter() {
        for (CaracterValues valor : CaracterValues.values()) {
            assertEquals(valor.getValor(), Character.toString(valor.getValor()).charAt(0));
        }
    }

    @Test
    void deveRetornarStringCorretaAoUsarToString() {
        for (CaracterValues valor : CaracterValues.values()) {
            assertEquals(String.valueOf(valor.getValor()), Character.toString(valor.getValor()));
        }
    }

    @Test
    void deveRetornarHashCodeCorretoAoUsarHashCode() {
        for (CaracterValues valor : CaracterValues.values()) {
            assertEquals(Character.valueOf(valor.getValor()).hashCode(), valor.getValor());
        }
    }

    @Test
    void deveRetornarTrueAoCompararIgualdadeComMesmoValor() {
        for (CaracterValues valor : CaracterValues.values()) {
            assertEquals(valor.getValor(), valor.getValor());
        }
    }

    @Test
    void deveRetornarTrueSeCaractereForMaiusculo() {
        for (CaracterValues valor : CaracterValues.values()) {
            assertEquals(Character.isUpperCase(valor.getValor()), Character.isUpperCase(valor.getValor()));
        }
    }

    @Test
    void deveRetornarTrueSeCaractereForMinusculo() {
        for (CaracterValues valor : CaracterValues.values()) {
            boolean isLowerCase = Character.isLowerCase(valor.getValor());
            assertEquals(Character.isLowerCase(valor.getValor()), isLowerCase);
        }
    }

    @Test
    void deveRetornarTrueSeCaractereForDigito() {
        for (CaracterValues valor : CaracterValues.values()) {
            boolean isDigit = Character.isDigit(valor.getValor());
            assertEquals(Character.isDigit(valor.getValor()), isDigit);
        }
    }

    @Test
    void deveRetornarCaractereMinusculoAoUsarToLowerCase() {
        for (CaracterValues valor : CaracterValues.values()) {
            assertEquals(Character.toLowerCase(valor.getValor()), valor.getValor());
        }
    }

    @Test
    void deveCompararCaracteresCorretamente() {
        for (CaracterValues valor : CaracterValues.values()) {
            for (CaracterValues outroValor : CaracterValues.values()) {
                if (valor != outroValor) {
                    assertTrue(Character.compare(valor.getValor(), outroValor.getValor()) != 0);
                } else {
                    assertEquals(0, Character.compare(valor.getValor(), outroValor.getValor()));
                }
            }
        }
    }
}
