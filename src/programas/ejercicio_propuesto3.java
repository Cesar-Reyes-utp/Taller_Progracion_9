package programas;

import java.util.Scanner;
public class ejercicio_propuesto3 {
  
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        double[] compras = new double[n];
        double suma = 0;
        double compraMayor = 0;
        double compraMenor = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            suma += compras[i];
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }

        double promedio = suma / n;
        System.out.println("El total de compras es: " + suma);
        System.out.println("El promedio de compras es: " + promedio);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);
    }
}