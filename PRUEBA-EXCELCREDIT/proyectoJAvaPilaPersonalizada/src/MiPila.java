public class MiPila {
    private int[] pila;
    private int tope;

    public MiPila(int capacidad) {
        pila = new int[capacidad];
        tope = -1;
    }

    public void push(int elemento) {
        if (tope < pila.length - 1) {
            tope++;
            pila[tope] = elemento;
        } else {
            System.out.println("Error: La pila está llena.");
        }
    }

    public int pop() {
        if (tope >= 0) {
            int elemento = pila[tope];
            tope--;
            return elemento;
        } else {
            System.out.println("Error: La pila está vacía.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public int size() {
        return tope + 1;
    }
}
