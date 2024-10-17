package programas;

import java.util.Scanner;
public class ejercicio_propuesto4 {
  
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];

        // Ingresar los nombres
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Buscar un nombre
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("La persona " + nombreBuscado + " existe en la posición " + i + " del arreglo.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("La persona " + nombreBuscado + " no existe en el arreglo.");
        }
    }
}