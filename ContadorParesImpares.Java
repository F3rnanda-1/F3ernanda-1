import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
    }
}