package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");

        int n = scanner.nextInt();

        int nOrigi = n;

        int nDigi = String.valueOf(n).length();

        int suma = 0;

        while (n > 0) {
            int digito = n % 10;
            suma += (int) Math.pow(digito, nDigi);
            n /= 10;
        }

        if (suma == nOrigi) {
            System.out.println(nOrigi + " es un número Armstrong.");
        } else {
            System.out.println(nOrigi + " no es un número Armstrong.");
        }

        scanner.close();
    }
}
