package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String texto = scanner.nextLine();

        texto = texto.toLowerCase();
        String invertido= "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println(invertido);
        if (invertido.equals(texto)){
            System.out.println("La palabra es un palindromo");
        }
        else{
            System.out.println("La palabra no es un palindromo");
        }

        scanner.close();
    }
}
