package parcial.src.main.java.org.example.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class AdiviNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numAlea = random.nextInt(50) + 1;
        int inten = 0;
        int intenUser;

        do {
            System.out.print("Intente adivinar el numero: ");
            intenUser = scanner.nextInt();
            inten++;

            if (intenUser < numAlea) {
                System.out.println("El numero es mayor.");
            } else if (intenUser > numAlea) {
                System.out.println("El numero es menor.");
            }
        } while (intenUser != numAlea);

        System.out.println("adivinaste el numero " + numAlea + " en " + inten + " intentos.");
    }
}
