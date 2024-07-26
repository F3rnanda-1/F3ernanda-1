import java.util.Scanner;

public class VerificarPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numero = teclado.nextInt();

        boolean esPrimo = esNumeroPrimo(numero);

        if (esPrimo) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }

    public static boolean esNumeroPrimo(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
}