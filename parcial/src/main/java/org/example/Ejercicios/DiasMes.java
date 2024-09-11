package parcial.src.main.java.org.example.Ejercicios;
import java.util.Scanner;

public class DiasMes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca el mes (1-12): ");

        int mes = scanner.nextInt();

        System.out.print("Por favor, introduzca el año: ");

        int año = scanner.nextInt();

        int dias;

        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    dias = 29; // Año bisiesto
                } else {
                    dias = 28;
                }
                break;
            default:
                throw new IllegalArgumentException("Mes inválido: " + mes);
        }

        System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");

        scanner.close();
    }
}
