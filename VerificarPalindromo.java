import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = teclado.nextLine();

        if (esPalindromo(texto)) {
            System.out.println("Es un palindromo.");
        } else {
            System.out.println("No es un palindromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        
        cadena = cadena.replaceAll("\\s", "").toLowerCase();

        int izquierda = 0;
        int derecha = cadena.length() - 1;

        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}