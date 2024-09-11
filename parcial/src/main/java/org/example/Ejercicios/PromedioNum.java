package parcial.src.main.java.org.example.Ejercicios;
import java.util.Scanner;

public class PromedioNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números: ");
        int n = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }
        double promedio = (double) suma / n;

        System.out.println("El promedio de los " + n + " números es: " + promedio);
        scanner.close();
    }
}
