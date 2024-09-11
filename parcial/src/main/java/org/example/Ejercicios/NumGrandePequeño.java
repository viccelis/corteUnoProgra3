package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class NumGrandePequeño {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int n;

        System.out.print("Introduce un numero:");
        n = scanner.nextInt();
        if (n != 0) {
            max = n;
            min = n;
        }

        while (n != 0) {
            System.out.print("Introduce un numero:");
            n = scanner.nextInt();
            if (n != 0) {
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            }
        }

        if (max == 0 && min == 0) {
            System.out.println("No se ingresaron números.");
        } else {
            System.out.println("El numero más grande: " + max);
            System.out.println("El numero más pequeño: " + min);
        }

        scanner.close();
    }
}
