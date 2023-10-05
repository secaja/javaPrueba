import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Ingrese un número para calcular su factorial: ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break; // Sale del bucle si la entrada es un número válido.
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpia la entrada incorrecta antes de continuar.
            }
        }

        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);

        scanner.close(); // Cierra el scanner cuando ya no se necesita.
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
