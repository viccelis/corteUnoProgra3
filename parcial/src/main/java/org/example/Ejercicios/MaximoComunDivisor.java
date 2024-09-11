package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class MaximoComunDivisor {

    public static int maxiComunDivi(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el otro número: ");
        int num2 = scanner.nextInt();

        int comundivi = maxiComunDivi(num1, num2);

        System.out.println("El maximo comun divisor de " + num1 + " y " + num2 + " es: " + comundivi);

        scanner.close();

    }
}
