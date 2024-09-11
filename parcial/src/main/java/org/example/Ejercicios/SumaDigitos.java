package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class SumaDigitos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese número:");

        int n = scanner.nextInt();

        int suma = sumaDigitos(n);

        System.out.println("La suma de " + n + " es: " + suma);

        scanner.close();
    }

    public static int sumaDigitos(int n) {

        n = Math.abs(n);
        int suma = 0;

        while (n > 0) {
            int digito = n % 10;
            suma += digito;
            n /= 10;
        }

        return suma;
    }
}
