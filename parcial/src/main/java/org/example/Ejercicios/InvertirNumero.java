package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");

        int n = scanner.nextInt();
        int nInvertido = invertirNumero(n);
        System.out.println("Número invertido: " + nInvertido);
        int nuevo = 1548%10;
        System.out.println(nuevo);
    }

    public static int invertirNumero(int n) {
        int nInvertido = 0;
        while (n != 0) {
            int digito = n % 10;
            nInvertido = nInvertido * 10 + digito;
            n /= 10;
        }
        return nInvertido;


    }
}
