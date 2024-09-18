/**
 * @author Ana Chen Zhang
 * @version 18/09/2024
 */

import java.util.*;

public class Mazo {
    private final List<Carta> cartas;
    private final List<Carta> cartasRepartidas;

    public Mazo() {
        cartas = new ArrayList<>();
        cartasRepartidas = new ArrayList<>();
        inicializarMazo();
    }

    public Mazo(List<Carta> cartas, List<Carta> cartasRepartidas) {
        this.cartas = cartas;
        this.cartasRepartidas = cartasRepartidas;
    }

    // Inicializa el mazo con 52 cartas
    private void inicializarMazo() {
        for (Carta.Palo palo : Carta.Palo.values()) {
            for (int i = 1; i <= 13; i++) {
                cartas.add(new Carta(i, palo));
            }
        }
    }

    // Baraja el mazo
    public void barajar() {
        Collections.shuffle(cartas);
    }

    // Reparte un número determinado de cartas
    public List<Carta> repartir(int numCartas) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < numCartas; i++) {
            if (!cartas.isEmpty()) {
                Carta carta = cartas.remove(0);
                mano.add(carta);
                cartasRepartidas.add(carta);
            }
        }
        return mano;
    }

    // Restablece el mazo a su estado inicial
    public void restablecerMazo() {
        cartas.addAll(cartasRepartidas);
        cartasRepartidas.clear();
        barajar();
    }

    // Gestiona la pila de cartas no repartidas (agrega o quita cartas)
    public void regresarCarta(Carta carta) {
        cartas.add(carta);
        cartasRepartidas.remove(carta);
    }

    public void mostrarCartasRestantes() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
