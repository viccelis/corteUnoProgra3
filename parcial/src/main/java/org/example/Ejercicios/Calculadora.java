package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero:");
        int a = scanner.nextInt();

        System.out.print("Ingrese un numero :");
        int b = scanner.nextInt();

        System.out.print("Ingrese la operación deseada (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        realizaOpera(a, b, operacion);

        scanner.close();
    }

    public static void realizaOpera(int a, int b, char operacion) {
        double resultado;

        switch (operacion) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (b != 0) {
                    resultado = (double) a / b;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;

            default:
                System.out.println("Operación no válida.");
                break;
        }
    }
}
