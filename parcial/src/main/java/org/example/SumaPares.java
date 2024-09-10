import java.util.Scanner;

public class SumarPares {
    public static void main(String[] args) {
        int n = 0;
        int suma = 0;

        Scanner = scanner new scanner(System.in);

        int n = scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares entre 1 y " + n + " es: " + suma);
}
}