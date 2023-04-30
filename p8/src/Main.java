
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String texto = "yo yo te juro que que no no soy tarta tarta tarta tartamudo";

        String[] palabras = texto.split(" ");

        Map<String, Integer> contador = new HashMap<>();

        for (String i : palabras) {
            if (contador.containsKey(i)) {
                contador.put(i, contador.get(i) + 1);
            } else {
                contador.put(i, 1);
            }
        }

        System.out.println(contador);
    }
}