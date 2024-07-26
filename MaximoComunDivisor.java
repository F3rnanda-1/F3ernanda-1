import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer numero entero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingresa el segundo numero entero: ");
        int num2 = teclado.nextInt();

        int mcd = calcularMCD(num1, num2);

        System.out.println("El maximo comun divisor de " + num1 + " y " + num2 + " es: " + mcd);
    }
    
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}