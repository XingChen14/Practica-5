import java.awt.*;

public class Visualizador {
    public static void carta(Carta c, Posicion p) {
        // Verificar que la carta no sea nula
        if (c == null) {
            System.out.println("Carta no válida.");
            return;
        }
        
        Canvas canvas = Canvas.getCanvas();
        
        // Dibujar el rectángulo (solo el borde)
        int rectX = p.X;
        int rectY = p.Y;
        int rectWidth = 100;
        int rectHeight = 150;

        // Dibuja el borde del rectángulo
        canvas.draw(new Object(), "lightGray", new Rectangle(rectX, rectY, rectWidth, rectHeight));

        // Determinar el color de los círculos según el palo
        Color circleColor;
        int cantidadCirculos = c.getValor();

        circleColor = switch (c.getPalo()) {
            case Corazones -> Color.RED;
            case Diamantes -> Color.BLUE;
            case Treboles -> Color.GREEN;
            case Picas -> Color.BLACK;
            default -> Color.BLACK;
        }; // Por si acaso

        // Dibujar los círculos dentro del rectángulo
        for (int i = 0; i < cantidadCirculos; i++) {
            // Calcular la posición de cada círculo
            int circleX = rectX + 10 + (i % 3) * 25; // Espaciado horizontal
            int circleY = rectY + 10 + (i / 3) * 25; // Espaciado vertical
            
            // Crear el círculo y dibujarlo
            Circle circle = new Circle();
            circle.changeColor(getColorName(circleColor));
            circle.changeSize(20); // Diámetro de 20
            circle.changePosition(circleX, circleY); // Método que necesitarás agregar a Circle
            circle.makeVisible(); // Hacer visible el círculo
        }

        // Escribir el nombre de la carta debajo del rectángulo
        String cartaTexto = "" + c; 
        int textX = rectX + 10; // Posición X del texto
        int textY = rectY + rectHeight + 20; // Posición Y debajo del rectángulo (20 píxeles de separación)
        canvas.drawString(cartaTexto, textX, textY); // Dibuja el texto en el canvas
    }

    private static String getColorName(Color color) {
        if (color.equals(Color.RED)) {
            return "red";
        } else if (color.equals(Color.BLUE)) {
            return "blue";
        } else if (color.equals(Color.GREEN)) {
            return "green";
        } else if (color.equals(Color.BLACK)) {
            return "black";
        }
        return "black"; // Por defecto
    }
}
