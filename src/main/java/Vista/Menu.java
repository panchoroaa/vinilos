package Vista;
import Controlador.ColeccionControlador;
import Modelo.Coleccion;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    }
    /**
     * Ejecuta el menú principal del programa y gestiona la interacción con el usuario.
     */
    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un número válido.");
                scanner.nextLine();
            }
            opcion = scanner.nextInt();
            scanner.nextLine();
            ejecutarOpcion(opcion);
        } while (opcion !=6);
    }

    /**
     * Muestra el menú principal con las opciones disponibles.
     */
    private static void mostrarOpciones() {
        System.out.println("\n--- Menú Colección Vinilos ---");
        System.out.println("1. Ver Colección.");
        System.out.println("2. Agregar Vinilos.");
        System.out.println("3. Buscar Vinilos.");
        System.out.println("4. Reportar espacio en la colección.");
        System.out.println("5. Salir");
    }
    /**
     * Ejecuta la acción correspondiente según la opción seleccionada.
     * @param opcion Opción ingresada por el usuario.
     */
    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                ColeccionControlador.agregarVinilo();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println();
                break;
            case 5:
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }
}
