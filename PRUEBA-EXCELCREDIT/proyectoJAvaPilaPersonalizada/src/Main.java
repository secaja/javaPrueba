public class Main {
    public static void main(String[] args) {
        MiPila pila = new MiPila(5);

        System.out.println("Pila vacía: " + pila.isEmpty());
        System.out.println("Tamaño de la pila: " + pila.size());

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Pila vacía: " + pila.isEmpty());
        System.out.println("Tamaño de la pila: " + pila.size());

        int elemento = pila.pop();
        System.out.println("Elemento eliminado: " + elemento);
        System.out.println("Tamaño de la pila: " + pila.size());

        elemento = pila.pop();
        System.out.println("Elemento eliminado: " + elemento);
        System.out.println("Tamaño de la pila: " + pila.size());
    }
}
