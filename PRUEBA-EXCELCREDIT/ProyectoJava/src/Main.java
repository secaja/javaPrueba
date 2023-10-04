public class Main {
    public static void main(String[] args) {
        int numero = 5;
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);

    }
    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}