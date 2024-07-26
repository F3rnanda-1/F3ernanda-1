import java.util.Scanner;

public class ConvertirAMayusculas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa palabras o cadenas de texto (presiona Enter despues de cada una):");

        while (true) {
            String entrada = teclado.nextLine();
            
            if (entrada.trim().isEmpty()) {
                System.out.println("Hasta luego");
                break;
            }

            String mayusculas = entrada.toUpperCase();
            System.out.println("Texto en mayusculas: " + mayusculas);
        }
    }