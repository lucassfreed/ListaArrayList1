
import java.util.ArrayList;

/**
 * @author Lucas Rodrigo
 */
public class Ex04 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(132);
        numeros.add(542);
        numeros.add(37);
        numeros.add(34);
        numeros.add(51);
        numeros.add(65);
        numeros.add(69);
        numeros.add(27);
        numeros.add(78);
        numeros.add(9);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        numeros.remove(3);
        System.out.println("");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("");
        numeros.remove(4);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println("");
        System.out.println("Quantidade de números que restaram na ArrayList: " + numeros.size());

    }

}
