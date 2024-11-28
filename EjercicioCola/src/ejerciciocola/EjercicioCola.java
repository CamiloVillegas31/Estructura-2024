/* 
Integrantes

Daniel Estiben Medina Tobar
Camilo Andrés Villegas Flor

Corporación Universitaria Unicomfacauca.
Ing. de sistemas-Diurno

 */
package ejerciciocola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EjercicioCola {

    /*Simula un sistema de atención al cliente en una tienda. Los clientes llegan en un orden
determinado y se les coloca en una cola para ser atendidos. El sistema debe
gestionar las siguientes acciones:


Registrar clientes que llegan para ser
atendidos (agregar a la cola).
Atender clientes uno por uno en el orden en
que llegaron (eliminar de la cola).
Mostrar el siguiente cliente que va a ser atendido sin
eliminarlo de la cola.
Mostrar cuántos clientes quedan
en la cola.
Vaciar la cola después de que todos los
clientes hayan sido atendidos.
Imprimir la cola en cualquier momento para
ver quiénes están esperando.

Requisitos:


Utiliza una cola (Queue<String>) para almacenar los nombres
de los clientes.
Debes implementar los
comandos add(), poll(), peek(), size(), y isEmpty().*/
    public static void main(String[] args) {

        Queue<String> colaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSistema de Atención al Cliente");
            System.out.println("1. Registrar cliente (Agregar a la cola)");
            System.out.println("2. Atender cliente (Eliminar de la cola)");
            System.out.println("3. Mostrar siguiente cliente (Peek)");
            System.out.println("4. Mostrar cantidad de clientes en la cola");
            System.out.println("5. Vaciar la cola");
            System.out.println("6. Imprimir la cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    colaClientes.add(cliente);
                    System.out.println("Cliente registrado: " + cliente);
                    break;

                case 2:
                    if (!colaClientes.isEmpty()) {
                        System.out.println("Atendiendo al cliente: " + colaClientes.poll());
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;

                case 3:
                    if (!colaClientes.isEmpty()) {
                        System.out.println("El siguiente cliente es: " + colaClientes.peek());
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 4:
                    System.out.println("Total de clientes en la cola: " + colaClientes.size());
                    break;
                case 5:
                    colaClientes.clear();
                    System.out.println("La cola ha vaciado.");
                    break;
                case 6:
                    if (!colaClientes.isEmpty()) {
                        System.out.println("Clientes en la cola: " + colaClientes);
                    } else {
                        System.out.println("No hay clientes en la cola, paga sin chambear... Siuuu");
                    }
                    break;
                case 0:
                    System.out.println("Adiosito. ¡Gracias!");
                    break;
                default:
                    System.out.println("¡Error! ¡Intente nuevamente!");
            }
        } while (opcion != 0);
    }

}
