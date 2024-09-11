package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class FInobicci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Secuencia de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        scanner.close();
    }
}
