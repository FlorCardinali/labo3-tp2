import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> Libros = new HashMap<>();
        Libros.put("Cien años de soeldad", "Gabriel Garcia Marques");
        Libros.put("12 cuentos peregrinos", "Gabriel Garcia Marques");
        Libros.put("El otoño del patriarca", "Gabriel Garcia Marques");
        Libros.put("Lastima que estaba muerto", "Margarita Mainé");
        Libros.put("El gato negro", "Edgar Allan Poe");
        Libros.put("El cuervo", "Edgar Allan Poe");
        Libros.put("La mascara de la mierte roja", "Edgar Allan Poe");
        Libros.put("Matilda", "Roald Dahl");
        Libros.put("Las brujas", "Roald Dahl");

        for (Map.Entry<String,String> entrada: Libros.entrySet()) {
            if (entrada.getValue().equals("Gabriel Garcia Marques")){
                System.out.println(entrada.getKey());
            }
        }
    }
}