package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class NumMagic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero: ");

        int n = scanner.nextInt();
        int suma = n;

        while (suma >= 10) {
            int temp = suma;
            suma = 0;
            while (temp != 0) {
                suma += temp % 10;
                temp /= 10;
            }
        }

        if (suma == 1) {
            System.out.println("El número " + n + " es un número mágico.");

        }
        else {
            System.out.println("El número " + n + " no es un número mágico.");

        }

        scanner.close();
    }
}
