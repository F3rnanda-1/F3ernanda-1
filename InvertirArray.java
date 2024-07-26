import java.util.Scanner;

public class InvertirArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("Array invertido:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}