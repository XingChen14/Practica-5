PROJECT TITLE: 
Práctica 6  Cohesión y Métodos de clase

PURPOSE OF PROJECT: Diseñar software orientado a objetos clases mediante el reuso de código, la asignación de responsabilidades específicas y diseño de clases de ayuda con métodos de clase, con actitud analítica y responsable.

VERSION or DATE: Version 2 (25/09/2024)

HOW TO START THIS PROJECT:

AUTHORS: Ana Chen Zhang

USER INSTRUCTIONS:
Desarrollar un programa en Java que simule el manejo de un mazo de cartas para un juego. El programa debe permitir las siguientes operaciones:
    Implementar un mecanismo de despliegue gráfico para las Cartas implementadas en la práctica #5 utilizando código de terceros y diseñando métodos de clase.

ACTIVITIES:
    Clonar el repositorio base de la Práctica 6 de GitHub:
        git clone https://github.com/molguinuabc/labpoo20242-practica6
    Probar el código compilando y ejecutando la clase Main.
    Ubicarse en su repositorio creado en la práctica anterior (Práctica #5)
        Crear un nuevo branch llamado practica6 y hacer checkout del nuevo branch.
        Copiar las clases del repositorio clonado en este nuevo branch
    Crear una clase llamada Visualizador, la cual tendrá el siguiente método de clase:
            carta(Carta c, Posicion p)
        Este método debe desplegar una representación gráfica de la carta c en la posición p dadas como argumento, para lo cual tendrán que utilizar las clases de despliegue gráfico del repositorio clonado.
        Lo anterior implica que también tendrán que implementar una clase llamada Posicion.
        La clase Carta será la misma que ya programaron en la práctica anterior. 
    Probar la nueva clase agregando código al método main(), por ejemplo:
        Visualizador.carta(carta1, new Posicion(20,40));
    Crear una nueva versión en su branch practica6 (commit)
    Subir el nuevo branch a GitHub:
        git push origin practica6


CONSIDERATIONS:
  
DELIVERY:
    Entregar el enlace al repositorio de GitHub

EVALUATION CRITERIA
    Correcta implementación de las clases, atributos, constructores y métodos.
    Funcionalidad del programa.
    Estructura y organización del código.
    Legibilidad del código (indentación, nombrado de variables, comentarios y documentación).
    Uso adecuado de encapsulamiento, herencia y polimorfismo.
