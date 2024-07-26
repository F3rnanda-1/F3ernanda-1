import java.util.Scanner;

public class ReemplazarCaracter {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = teclado.nextLine();

        System.out.print("Ingresa el caracter que deseas reemplazar: ");
        char caracterOriginal = teclado.next().charAt(0);

        System.out.print("Ingresa el nuevo caracter: ");
        char caracterNuevo = teclado.next().charAt(0);

        String resultado = texto.replace(caracterOriginal, caracterNuevo);

        System.out.println("Resultado despues del reemplazo: " + resultado);
    }
}