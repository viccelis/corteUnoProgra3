package parcial.src.main.java.org.example;

public class ContarVocales {
    import java.util.Scanner;

    public class ContarVocales {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escribe una palabra");
            String texto = scanner.nextLine();

            int contadorVocales = 0;

            texto = texto.toLowerCase();

            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);

                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    contadorVocales++;
                }
            }

            System.out.println("Número de vocales: " + contadorVocales);
            
            scanner.close();
        }
    }

}
