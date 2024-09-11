package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class SumaParesImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumaPar = 0;
        int sumaImp = 0;
        int n;

        System.out.println("Introduce numeros:");

        while (true) {
            n = scanner.nextInt();
            if (n < 0) {
                break;
            }
            if (n % 2 == 0) {
                sumaPar += n;
            } else {
                sumaImp += n;
            }
        }

        System.out.println("La suma de los pares es: " + sumaPar);

        System.out.println("La suma de los impares es: " + sumaImp);

        scanner.close();
    }
}
