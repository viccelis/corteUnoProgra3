package parcial.src.main.java.org.example.Ejercicios;

import java.util.Scanner;

public class OrdenTresNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce número 1:");
        int a = scanner.nextInt();
        System.out.print("Introduce número 2:");
        int b = scanner.nextInt();
        System.out.print("Introduce número 3:");
        int c = scanner.nextInt();

        int menor, medio, mayor;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
        }

        System.out.println(menor + ", " + medio + ", " + mayor);

        scanner.close();
    }
}
