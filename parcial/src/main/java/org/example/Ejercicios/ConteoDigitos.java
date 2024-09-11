package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class ConteoDigitos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("introduzca un número:");

        int n = scanner.nextInt();
        int nDigi = 0;
        int num = n;

        do {
            num /= 10;
            nDigi++;
        } while (num != 0);

        System.out.println("El número " + n + " tiene " + nDigi + " dígitos.");

        scanner.close();
    }
}
