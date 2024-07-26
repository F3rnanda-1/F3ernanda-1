import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los numeros es: " + suma);
    }
}
