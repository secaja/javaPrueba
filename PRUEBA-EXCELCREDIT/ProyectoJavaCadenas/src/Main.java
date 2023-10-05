import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto.
        System.out.print("Ingrese una cadena de texto: ");
        String input = scanner.nextLine(); // Leer la cadena ingresada por el usuario.

        try {
            // Llamar a la función contarVocalesConsonantes con la cadena de entrada y obtener el resultado.
            Map<String, Integer> resultado = contarVocalesConsonantes(input);

            // Mostrar el número de vocales y consonantes en la cadena.
            System.out.println("Número de vocales: " + resultado.get("vocales"));
            System.out.println("Número de consonantes: " + resultado.get("consonantes"));
        } catch (InputVacioException e) {
            // Manejar la excepción si la cadena de entrada está vacía.
            System.out.println("Error: La cadena de entrada está vacía.");
        }

        // Cerrar el objeto Scanner para liberar recursos.
        scanner.close();
    }

    public static Map<String, Integer> contarVocalesConsonantes(String cadena) throws InputVacioException {
        if (cadena.isEmpty()) {
            // Lanzar una excepción personalizada si la cadena de entrada está vacía.
            throw new InputVacioException("La cadena de entrada está vacía.");
        }

        // Inicializar map para contar el número de vocales y consonantes.
        Map<String, Integer> contadores = new HashMap<>();
        contadores.put("vocales", 0);
        contadores.put("consonantes", 0);

        // Convertir la cadena a minúsculas para facilitar la comparación.
        String cadenaMinuscula = cadena.toLowerCase();

        // Iterar a través de cada carácter en la cadena.
        for (char letra : cadenaMinuscula.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                // Incrementar el contador de vocales si el carácter es una vocal.
                contadores.put("vocales", contadores.get("vocales") + 1);
            } else if (letra != ' ') {
                // Incrementar el contador de consonantes si el carácter no es un espacio.
                contadores.put("consonantes", contadores.get("consonantes") + 1);
            }
        }

        // Devolver el map con los contadores de vocales y consonantes.
        return contadores;
    }
}

class InputVacioException extends Exception {
    public InputVacioException(String mensaje) {
        super(mensaje);
    }
}
