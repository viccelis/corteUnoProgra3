package parcial.src.main.java.org.example.Ejercicios;
    import java.util.Scanner;

    public class ContarVocales {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escribe una palabra");
            String texto = scanner.nextLine();

            int contadorVocales = 0;

            texto = texto.toLowerCase();

            for (int i = 0; i < texto.length(); i++) {
                char letra = texto.charAt(i);

                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contadorVocales++;
                }
            }

            System.out.println("hay " + contadorVocales + "vocales");

            scanner.close();
        }
    }

