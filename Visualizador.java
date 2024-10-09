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
        canvas.draw(new Object(), "yellow", new Rectangle(rectX, rectY, rectWidth, rectHeight));

        // Determinar el color de los círculos según el palo
        Color circleColor;
        int cantidadCirculos = c.getValor();

        circleColor = switch (c.getPalo()) {
            case Corazones -> Color.RED;
            case Diamantes -> Color.BLUE;
            case Treboles -> Color.GREEN;
            case Picas -> Color.BLACK;
            default -> Color.BLACK;
        }; 

        // Ajustar tamaño del círculo
        int circleDiameter = 20; // Diámetro de los círculos

        // Ajuste de espaciado
        int maxCirculosPorFila = Math.min(cantidadCirculos, 5); // No más de 5 círculos por fila
        int espaciadoHorizontal = (rectWidth - (maxCirculosPorFila * circleDiameter)) / (maxCirculosPorFila + 1);
        int filasNecesarias = (int) Math.ceil((double) cantidadCirculos / maxCirculosPorFila);
        int espaciadoVertical = (rectHeight - (filasNecesarias * circleDiameter)) / (filasNecesarias + 1);

        // Dibujar los círculos dentro del rectángulo
        for (int i = 0; i < cantidadCirculos; i++) {
            // Calcular la posición de cada círculo
            int circleX = rectX + espaciadoHorizontal + (i % maxCirculosPorFila) * (circleDiameter + espaciadoHorizontal); 
            int circleY = rectY + espaciadoVertical + (i / maxCirculosPorFila) * (circleDiameter + espaciadoVertical);

            // Crear el círculo y dibujarlo
            Circulo circle = new Circulo();
            circle.changeColor(getColorName(circleColor));
            circle.changeSize(10); // Diámetro de 10
            circle.changePosition(circleX, circleY); // Método que necesitarás agregar a Circle
            circle.makeVisible(); // Hacer visible el círculo
        }

        // Dibujar el símbolo del palo debajo de los círculos
        drawSymbol(canvas, c.getPalo(), rectX, rectY + rectHeight + 10); // Posición debajo del rectángulo

    }

    private static void drawSymbol(Canvas canvas, Carta.Palo palo, int x, int y) {
        int size = 20; // Tamaño básico de las formas
        int espaciado = 5; // Espaciado entre las formas

        switch (palo) {
            case Corazones, Treboles -> {
                Color color = (palo == Carta.Palo.Corazones) ? Color.RED : Color.BLACK;
                // Dibujar los tres cuadrados en forma de pirámide
                canvas.draw(new Object(), getColorName(color), new Rectangle(x, y, size, size)); // Superior
                canvas.draw(new Object(), getColorName(color), new Rectangle(x - (size / 2 + espaciado), y + size + espaciado, size, size)); // Inferior izquierdo
                canvas.draw(new Object(), getColorName(color), new Rectangle(x + (size / 2 + espaciado), y + size + espaciado, size, size)); // Inferior derecho
            }

            case Diamantes, Picas -> {
                Color triangleColor = (palo == Carta.Palo.Diamantes) ? Color.RED : Color.BLACK;
                // Dibujar los tres triángulos en forma de pirámide
                drawTriangle(canvas, x, y, size, triangleColor); // Superior
                drawTriangle(canvas, x - (size / 2 + espaciado), y + size + espaciado, size, triangleColor); // Inferior izquierdo
                drawTriangle(canvas, x + (size / 2 + espaciado), y + size + espaciado, size, triangleColor); // Inferior derecho
            }
        }
    }

    private static void drawTriangle(Canvas canvas, int x, int y, int size, Color color) {
        // Dibujar triángulo (podrías crear una lógica similar a la del círculo)
        int[] xPoints = {x, x - size / 2, x + size / 2};
        int[] yPoints = {y, y + size, y + size};
        Polygon triangle = new Polygon(xPoints, yPoints, 3);
        canvas.draw(new Object(), getColorName(color), triangle);
    }

    private static String getColorName(Color color) {
        if (color.equals(Color.RED)) {
            return "red";
        } else if (color.equals(Color.BLACK)) {
            return "black";
        }
        return "black"; // Por defecto
    }
}
