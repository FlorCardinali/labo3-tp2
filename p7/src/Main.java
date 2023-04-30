import java.util.SortedMap;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Julieta", 25);
        mapa.put("Nova", 3);
        mapa.put("Sabrina la bruja adolecente", 15);
        mapa.put("Fernanda", 50);
        mapa.put("Manuela", 40);

        for (String clave : mapa.keySet()) {
            System.out.println(clave + " -> " + mapa.get(clave));
        }
    }
}