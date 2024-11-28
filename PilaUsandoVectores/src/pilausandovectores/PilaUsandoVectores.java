/* 
Integrantes

Daniel Estiben Medina Tobar
Camilo Andrés Villegas Flor

Corporación Universitaria Unicomfacauca.
Ing. de sistemas-Diurno

 */
package pilausandovectores;

import java.util.Scanner;

/*Diseñar una pila usando vectores como se realizo la cola, 
el tamaño de la pila es dado por el usuario, 
créense un menú que permita hacer cada uno de los métodos mencionados a continuación, 
los datos son ingresados por teclado. lo pueden hacer en parejas, recuerden que aparte de esto tienen que entender como funciona GitHub
y subir el proyecto a su propio repositorio, para que lo tengan presente, para subir un proyecto a github se hace por medios de comandos,
el día de entrega les hago hacer un commit así q deben saber, además les pregunto por algo del código a cada pareja. 


 -Método apilar o insertar
 -Método para desapilar
 -Método para obtener el Tope de la pila
 -Método para mostrar los elementos de esa pila
 -Método para verificar si la pila esta vacía
 -Método para verificar si la pila esta llena
 -Método para obtener el tamaño de la pila
 -Método para vaciar la pila.*/
public class PilaUsandoVectores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la pila: ");
        int size = scanner.nextInt();
        Pila pila = new Pila(size);
        int opcion;
        do {
            System.out.println("\n--- Menú de la Pila ---");
            System.out.println("1. Apilar elemento");
            System.out.println("2. Desapilar elemento");
            System.out.println("3. Obtener tope de la pila");
            System.out.println("4. Mostrar elementos de la pila");
            System.out.println("5. Verificar si la pila está vacía");
            System.out.println("6. Verificar si la pila está llena");
            System.out.println("7. Obtener tamaño de la pila");
            System.out.println("8. Vaciar pila");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a apilar: ");
                    int elemento = scanner.nextInt();
                    pila.apilar(elemento);
                    break;
                case 2:
                    pila.desapilar();
                    break;
                case 3:
                    System.out.println("El tope de la pila es: " + pila.obtenerTope());
                    break;
                case 4:
                    pila.mostrarElementos();
                    break;
                case 5:
                    System.out.println("¿La pila está vacía? " + pila.estaVacia());
                    break;
                case 6:
                    System.out.println("¿La pila está llena? " + pila.estaLlena());
                    break;
                case 7:
                    System.out.println("Tamaño de la pila: " + pila.obtenerTamano());
                    break;
                case 8:
                    pila.vaciarPila();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
        } while (opcion != 9);
    }
}
