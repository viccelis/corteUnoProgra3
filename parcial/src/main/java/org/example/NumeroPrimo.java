package parcial.src.main.java.org.example;

public class NumeroPrimo {
    public static void main(String[] args) {
        int n = 29;
        boolean esPrimo = esNumeroPrimo(n);

        if (esPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }
    }

    public static boolean esNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
}
}
}
