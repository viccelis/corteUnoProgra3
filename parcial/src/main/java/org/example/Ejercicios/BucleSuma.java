package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class BucleSuma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        int n;

        do {
            System.out.print("Introduce un numero:");
            n = (int) scanner.nextDouble();
            suma += n;
        } while (n != 0);

        System.out.println("La suma de los numeros es: " + suma);

        scanner.close();
    }
}
