package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class ContadorPosiNega {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int posi = 0;
        int nega = 0;
        int n;

        do {
            System.out.print("Introduce un numero:");

            n = scanner.nextInt();

            if (n > 0) {
                posi++;
            } else if (n < 0) {
                nega++;
            }
        } while (n != 0);

        System.out.println("Numeros positivos: " + posi);
        System.out.println("Numeros negativos: " + nega);

        scanner.close();
    }
}
