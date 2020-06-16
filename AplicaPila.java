package CPila;

import java.util.Scanner;

public class AplicaPila {

    static Scanner teclado = new Scanner(System.in);
    public static CPila Pila;

    public static void main(String[] args) {
        MenuPila();

    }

    static void crearPila() {
        int tam;
        System.out.println("Ingrese tamaño de la pila: ");

        tam = teclado.nextInt();
        Pila = new CPila(tam);
        System.out.println("Pila creada....\n");
    }

    public static void MenuPila() {
        int Opcion;
        do {
            System.out.println("----------------------");
            System.out.println("\tMenu de opciones: ");
            System.out.println("----------------------");
            System.out.println("[1] Crear Pila");
            System.out.println("----------------------");
            System.out.println("[2] Ingresar datos - [Apilar]");
            System.out.println("[3] Mostrar datos de la pila: ");
            System.out.println("[4] Eliminar datos- [desapilar]");
            System.out.println("[5] Comprovar si la pila no tiene elementos: ");
            System.out.println("[6] Comprovar si la pila tiene elementos: ");
            System.out.println("[7] Quitar todos sus elementos de la pila: ");
            System.out.println("[8] obten el elemento cima pila: ");
            System.out.println("[9] tamaño de pila elementos maximos: ");
            System.out.println("----------------------");
            System.out.println("[0] salir");

            System.out.println("\nImgrese una opcion: ");
            Opcion = teclado.nextInt();
            switch (Opcion) {
                case 1:
                    crearPila();
                    break;

                case 2:
                    Pila.InsertarPila();
                    break;

                case 3:
                    Pila.mostrarPila();
                    System.out.println("");
                    break;

                case 4:
                    Pila.EliminarPila();
                    System.out.println("");
                    break;

                case 5:
                    Pila.PilaVacia();
                    break;

                case 6:
                    Pila.PilaLlena();
                    break;

                case 7:
                    Pila.vaciarPila();
                    System.out.println("");
                    break;

                case 8:
                    Pila.cimaPila();
                    break;

                case 9:
                    Pila.Tamañopila();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema....");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ingrese opcion correcta: ");
                    System.out.println("\n");
            }
        } while (Opcion != 0);
    }
}
