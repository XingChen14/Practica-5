public class Circulo extends Circle{
    private boolean visible = false; // Estado de visibilidad del círculo
    private int xPosition;
    private int yPosition;

    public void changePosition(int x, int y) {
        borrarCirculo(); // Borra el círculo en la posición anterior
        xPosition = x; // Establece la nueva posición
        yPosition = y; // Establece la nueva posición
        if (visible) {
            makeVisible(); // Redibuja el círculo en la nueva posición
        }
    }

    // Implementación del método para borrar el círculo
    private void borrarCirculo() {
        if (visible) { // Solo borrar si el círculo es visible
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this); // Borra la referencia de este objeto (Circle)
        }
    }

    // Sobrescribir el método makeVisible para controlar la visibilidad
    @Override
    public void makeVisible() {
        visible = true; // Actualizar el estado de visibilidad
        super.makeVisible(); // Llamar al método original de Circle
    }

    // Sobrescribir el método makeInvisible para controlar la visibilidad
    @Override
    public void makeInvisible() {
        visible = false; // Actualizar el estado de visibilidad
        super.makeInvisible(); // Llamar al método original de Circle
    }

    
}