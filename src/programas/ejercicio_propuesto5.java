package programas;

import java.util.Scanner;

public class ejercicio_propuesto5 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar los arreglos a, b y c
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10]; // El arreglo c será el doble de tamaño que a y b

        // Llenar el arreglo a
        System.out.println("Ingrese 5 números para el arreglo a:");
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        // Llenar el arreglo b
        System.out.println("Ingrese 5 números para el arreglo b:");
        for (int i = 0; i < 5; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = scanner.nextInt();
        }

        // Intercalar los valores de a y b en el arreglo c
        int indiceC = 0;
        for (int i = 0; i < 5; i++) {
            c[indiceC++] = a[i]; // Asigna el valor de a[i] al arreglo c
            c[indiceC++] = b[i]; // Asigna el valor de b[i] al arreglo c
        }

        // Mostrar el arreglo c intercalado
        System.out.println("Arreglo intercalado c:");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
