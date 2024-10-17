package programas;

import java.util.Scanner;
public class ejercicio_propuesto2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        double[] ingresos = new double[n];
        double suma = 0;
        double ingresoMayor = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso económico de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            suma += ingresos[i];
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }

        double promedio = suma / n;
        System.out.println("El ingreso promedio es: " + promedio);
        System.out.println("El mayor ingreso es: " + ingresoMayor);
    }
}