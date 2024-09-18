/**
 * @author Ana Chen Zhang
 * @version 18/09/2024
 */

public class Carta {
    public enum Palo {
        CORAZONES, DIAMANTES, TREBOLES, PICAS
    }

    private int valor; // De 1 (As) a 13 (Rey)
    private Palo palo;

    public Carta(int valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Método para obtener la representación en cadena de la carta
    @Override
    public String toString() {
        String valorStr;
        valorStr = switch (valor) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(valor);
        };
        return valorStr + " de " + palo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }
}
