import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> conjunto_de_enteros = new HashSet<>();
        conjunto_de_enteros.add(11);
        conjunto_de_enteros.add(25);
        conjunto_de_enteros.add(555);
        if (conjunto_de_enteros.contains(25)){
            System.out.println("Esta!");
        } else {
            System.out.println("no estaaa");
        }
    }
}