PROJECT TITLE: 
Práctica 5  Visibilidad de atributos, métodos y colecciones

PURPOSE OF PROJECT: Diseñar y desarrollar aplicaciones utilizando los principios fundamentales de la Programación Orientada a Objetos en Java. Esto incluye la capacidad de definir clases y objetos que modelen entidades del mundo real, utilizando constructores para inicializar objetos y encapsulando datos a través de atributos y métodos, implementando operaciones básicas sobre los objetos, promoviendo la reutilización del código y la organización estructurada de programas, con actitud reflexiva.

VERSION or DATE: Version 1 (18/09/2024)

HOW TO START THIS PROJECT:

AUTHORS: Ana Chen Zhang

USER INSTRUCTIONS:
Desarrollar un programa en Java que simule el manejo de un mazo de cartas para un juego. El programa debe permitir las siguientes operaciones:
    Crear un mazo de 52 cartas (4 palos, 13 valores)
    Barajar el mazo.
    Repartir un número determinado de cartas a cada uno de los jugadores.
    Gestionar el mazo (cartas no repartidas, cartas regresadas al mazo).

ACTIVITIES:
    Creación de la clase "Carta":
        Definir el constructor e inicializar los atributos valor y tipo.
        Implementar un método para regresar la representación en cadena de la información de la carta (valor y tipo).
    Creación de la clase "Mazo":
        Definir el constructor en el que se inicializarán las cartas.
        Implementar métodos para restablecer el mazo a su configuración inicial y para barajar el mazo.
        Agregar un método para repartir cartas, tomando en cuenta el número de cartas por jugador y la existencia de diferentes tipos de cartas.
        Implementar un método para gestionar la pila de cartas no repartidas, permitiendo agregar y quitar cartas de la pila.
    Creación de la clase "Jugador":
        Implementar un método para asignar cartas y para deshacerse de cartas .
        Implementar un método para regresar una cadena con la información del jugador (nombre e información de sus cartas).
        El atributo nombre podrá ser accesado directamente para su modificación por cualquier otra clase.
    Creación de la clase “Juego”:
        Esta clase tendrá el método main()
        Probar el programa creando un mazo de cartas, barajando, repartiendo las cartas a los jugadores, y gestionando la pila de cartas no repartidas (regresar cartas al mazo y desplegar el estado del mazo).
    
CONSIDERATIONS:
    Utilizar enum para los palos de la baraja.
    Utilizar valores numéricos para las operaciones con las cartas J, Q, K y A pero usar su representación con letras para el despliegue 
    Aplicar convenciones de nombres en Java (CamelCase y PascalCase).
    Generar código legible para mejorar el mantenimiento.
    Verificar el funcionamiento correcto del programa mediante pruebas exhaustivas.

DELIVERY:
    El programa debe ser entregado en un repositorio de GitHub

EVALUATION CRITERIA
    Correcta implementación de las clases, atributos, constructores y métodos.
    Funcionalidad del programa.
    Estructura y organización del código.
    Legibilidad del código (indentación, nombrado de variables, comentarios y documentación).
    Uso adecuado de encapsulamiento, herencia y polimorfismo.
