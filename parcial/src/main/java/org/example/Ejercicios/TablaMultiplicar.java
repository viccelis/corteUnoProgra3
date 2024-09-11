package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número ");
        int n = scanner.nextInt();

        generarTablaDeMultiplicar(n);

        scanner.close();
    }

    public static void generarTablaDeMultiplicar(int n) {
        System.out.println("Tabla de multiplicar del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
