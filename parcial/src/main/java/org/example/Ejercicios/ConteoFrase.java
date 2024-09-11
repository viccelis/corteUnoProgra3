package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class ConteoFrase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("escribe una frase:");

        String frase = scanner.nextLine();

        int nPala = 0;

        if (frase != null && !frase.isEmpty()) {
            String[] palabras = frase.trim().split("\\s+");
            nPala = palabras.length;
        }

        System.out.println("La frase tiene " + nPala + " palabras.");

        scanner.close();
    }
}
