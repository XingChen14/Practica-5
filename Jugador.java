/**
 * @author Ana Chen Zhang
 * @version 18/09/2024
 */

import java.util.*;

public class Jugador {
    public String nombre;
    private final List<Carta> mano;
    private final List<Carta> cartasRegresadas; // Lista para cartas regresadas

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
        this.cartasRegresadas = new ArrayList<>();
    }


    // Asigna cartas al jugador
    public void recibirCartas(List<Carta> cartas) {
        mano.addAll(cartas);
    }

    // Deshacerse de una carta
    public void regresarCarta(Carta carta) {
        mano.remove(carta);
        cartasRegresadas.add(carta);
    }

    // Devuelve la representación en cadena del jugador
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(nombre + ": ");
        for (Carta carta : mano) {
            sb.append(carta).append(", ");
        }
        return sb.toString();
    }

    public List<Carta> getMano() {
        return mano;
    }

    public List<Carta> getCartasRegresadas() {
        return cartasRegresadas;
    }


    public String getNombre() {
        return nombre;
    }
}