package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");

        int n = scanner.nextInt();

        long fac = 1;

        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }

        System.out.println(fac + "es el factorial de" + n);

        scanner.close();
    }
}
