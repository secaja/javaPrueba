import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(contarVocalesConsonantes("Hola mi nombre es Sebastian Cadavid y soy desarrollador junior"));

    }
    public static Map<String, Integer> contarVocalesConsonantes(String cadena) {
        Map<String, Integer> contadores = new HashMap<>();
        contadores.put("vocales", 0);
        contadores.put("consonantes", 0);

        String cadenaMinuscula = cadena.toLowerCase();

        for (char letra : cadenaMinuscula.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadores.put("vocales", contadores.get("vocales") + 1);
            } else if (letra != ' ') {
                contadores.put("consonantes", contadores.get("consonantes") + 1);
            }
        }

        return contadores;
    }
}