package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class SumarPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");

        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los números pares entre 1 y " + n + " es: " +suma);
    }
}
