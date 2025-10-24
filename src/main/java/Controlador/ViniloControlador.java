package Controlador;
import java.util.Scanner;
import Modelo.Vinilo;
public class ViniloControlador {
    private static final Scanner scanner = new Scanner(System.in);
    public static void agregarVinilo(){
        String artista = "";
        String nombre = "";
        String ano = "";
        System.out.println("Ingresa el nombre del artista o banda:");
        artista = scanner.nextLine();
        System.out.println("Ingresa el nombre del disco:");
        nombre = scanner.nextLine();
        System.out.println("Ingresa el año de publicación:");
        ano = scanner.nextLine();
        new Vinilo(artista,nombre,ano);
    }

}

