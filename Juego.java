/**
 * @author Ana Chen Zhang
 * @version 18/09/2024
 */

import java.util.*;
public class Juego {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar nombres de los jugadores
            System.out.print("Ingrese el nombre del primer jugador: ");
            String nombreJugador1 = scanner.nextLine();
            System.out.print("Ingrese el nombre del segundo jugador: ");
            String nombreJugador2 = scanner.nextLine();

            // Crear jugadores con los nombres ingresados
            Jugador jugador1 = new Jugador(nombreJugador1);
            Jugador jugador2 = new Jugador(nombreJugador2);

            // Cambiar nombre
            jugador1.nombre = "Pedro";
            

            // Crear un mazo de cartas y barajar
            Mazo mazo = new Mazo();
            mazo.barajar();

            // Repartir cartas a los jugadores
            jugador1.recibirCartas(mazo.repartir(5));
            jugador2.recibirCartas(mazo.repartir(5));

            // Mostrar las cartas de los jugadores
            System.out.println(jugador1);
            System.out.println(jugador2);

            // Mostrar cartas restantes en el mazo
            System.out.println("Cartas restantes en el mazo:");
            mazo.mostrarCartasRestantes();

            // Ejemplo de regreso de cartas (suponemos que el jugador1 regresa la primera carta de su mano)
            if (!jugador1.getMano().isEmpty()) {
                Carta cartaRegresada = jugador1.getMano().get(0);
                jugador1.regresarCarta(cartaRegresada);
                mazo.regresarCarta(cartaRegresada);
            }

            // Mostrar cartas restantes en el mazo después de regresar algunas
            System.out.println("Cartas restantes en el mazo después de regresar:");
            mazo.mostrarCartasRestantes();

            // Mostrar las cartas que el jugador1 ha regresado
            System.out.println(jugador1.getNombre() + " ha regresado las siguientes cartas:");
            for (Carta carta : jugador1.getCartasRegresadas()) {
                System.out.println(carta);
            }
        } // El scanner se cerrará automáticamente al salir del bloque try

        // Crear una carta para visualizar
        Carta carta1 = new Carta(1, Carta.Palo.Corazones); // Por ejemplo, As de Corazones

        // Visualizar la carta en la posición (20, 40)
        Visualizador.carta(carta1, new Posicion(20, 40));
    }
}
