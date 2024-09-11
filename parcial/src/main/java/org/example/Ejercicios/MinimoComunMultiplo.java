package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class MinimoComunMultiplo {
    public static int calcularMCD(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;

        }

        return a;
    }

    public static int calcularMCM(int a, int b) {

        return Math.abs(a * b) / calcularMCD(a, b);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("segundo número: ");
        int num2 = scanner.nextInt();

        int miniComuMulti = calcularMCM(num1, num2);


        System.out.println("El minimo comun multiplo de " + num1 + " y " + num2 + " es: " + miniComuMulti);

        scanner.close();

    }
}
