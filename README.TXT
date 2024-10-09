PROJECT TITLE: 
Práctica 7  Herencia

PURPOSE OF PROJECT: Diseñar software orientado a objetos clases mediante el reuso de código y la herencia, con actitud analítica y responsable.

VERSION or DATE: Version 3 (02/10/2024)

HOW TO START THIS PROJECT:

AUTHORS: Ana Chen Zhang

USER INSTRUCTIONS:
    Refactorizar el despliegue gráfico para las Cartas implementadas en la práctica #6 utilizando herencia.

ACTIVITIES:
    Entrar a su repositorio creado en la Práctica #5
        Asegurarse de estar en el branch main en su repositorio:
            git checkout main
        Crear un nuevo branch llamado practica7 y hacer checkout del nuevo branch.
            git checkout -b practica7 
            (el commando anterior es equivalente a primero crear el branch y después hacer el checkout)
    Ubicarse fuera de su repositorio para clonar de nuevo el repositorio base de la Práctica 6 de GitHub:
        git clone https://github.com/molguinuabc/labpoo20242-practica6
        Copiar las clases de este repositorio de GitHub en el branch practica7
    Crear una clase llamada Visualizador, la cual tendrá el siguiente método de clase:
            carta(Carta c, Posicion p)
    
    Este método debe desplegar una representación gráfica de la carta c en la posición p dadas como argumento, para lo cual tendrán que heredar nuevas clases a partir de las clases de despliegue gráfico del repositorio clonado. Es decir, no deberán modificar el código de las clases copiadas del repositorio de GitHub, todas las modificaciones tendrán que ser en las clases heredadas.

    Las nuevas clases heredades serán las siguientes:
        public class Cuadrado extends Square { }
        public class Circulo extends Circle { }
        public class Triangulo extends Triangle { }

    Adicionalmente tendrán que crear clases cuyos objetos representen los palos de la baraja y se puedan ubicar en cualquier coordenada x,y del canvas.
    
    Igual que en la Práctica #6 tendrán que usar la clase Posicion.

    La representación de las cartas se hará de la siguiente manera:
        La carta será un cuadrado con elementos representando el valor y palo.
        El valor de una carta será representado con pequeños círculos, tantos como sea el número que le corresponda a la carta.
        El palo será representado por las siguientes cuatro figuras:
    Probar la nueva clase agregando código al método main() que despliegue al menos una carta de cada palo.
    Crear una nueva versión en su branch practica7 (commit)
        git add .
        git commit -m “Práctica 7 implementada”
    Subir el nuevo branch a GitHub:
        git push origin practica7


DELIVERY:
    Entregar el enlace al repositorio de GitHub

EVALUATION CRITERIA
    Correcta implementación de las clases, atributos, constructores y métodos.
    Funcionalidad del programa.
    Estructura y organización del código.
    Legibilidad del código (indentación, nombrado de variables, comentarios y documentación).
    Uso adecuado de encapsulamiento, herencia y polimorfismo.
