import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();
        
        // Generar un valor aleatorio entre 1 y 13 (1 es A, 11 es J, 12 es Q, 13 es K)
        int valorAleatorio = random.nextInt(13) + 1; // +1 para que sea de 1 a 13
        
        // Generar un palo aleatorio
        Carta.Palo[] palos = Carta.Palo.values(); // Obtener todos los palos
        Carta.Palo paloAleatorio = palos[random.nextInt(palos.length)]; // Elegir un palo aleatorio
        

        // Crear una carta para visualizar
        Carta carta1 = new Carta(valorAleatorio, paloAleatorio); 

        Visualizador.carta(carta1, new Posicion(20, 40)); // Despliega la carta en la posición (20, 40)

        System.out.println(carta1);
    }
}
