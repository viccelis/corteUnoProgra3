package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class SerieAritmetica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de terminos:");
        int n = scanner.nextInt();

        System.out.print("Ingrese el primer término:");
        int a = scanner.nextInt();

        System.out.print("Ingrese la diferencia común:");
        int d = scanner.nextInt();

        long suma = (long) n * (2 * a + (n - 1) * d) / 2;

        System.out.println("La suma de los primeros " + n + " términos es: " + suma);

        scanner.close();
    }
}
