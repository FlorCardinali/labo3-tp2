import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<String, Integer>();
        edades.put("Pedro",27);
        edades.put("Pablo",33);
        edades.put("Perla",15);
        edades.put("Pancho",85);
        edades.put("Pepito",5);
        edades.put("Patricia",38);

        for (HashMap.Entry<String, Integer> entrada : edades.entrySet()) {
            String clave = entrada.getKey();
            Integer valor = entrada.getValue();
            System.out.println(clave + " : " + valor);
        }
    }
}