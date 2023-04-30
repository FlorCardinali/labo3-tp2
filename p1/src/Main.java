import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    ArrayList<String> lista_nombres = new ArrayList<>();
    lista_nombres.add("Pepito");
    lista_nombres.add("Menganito");
    lista_nombres.add("Cuchuflito");
    lista_nombres.add("pantufla");
    lista_nombres.add("Alpargata");
    lista_nombres.add("rigoberto");
    lista_nombres.add("Palito");
    lista_nombres.add("Clavito");
    lista_nombres.add("Rocky");
    lista_nombres.add("mor");
    /*control de mayusculas*/
    List<String> en_mayuscula = new ArrayList<>(lista_nombres
            .stream()
            .map(String::toUpperCase)
            .toList());

    Collections.sort(en_mayuscula);
    for (String nombre : en_mayuscula)
        System.out.println(nombre);
    }
}
