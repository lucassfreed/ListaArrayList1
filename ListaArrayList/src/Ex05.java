
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Lucas Rodrigo
 */
public class Ex05 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(JOptionPane.showInputDialog("Informe o primeiro nome"));
        nomes.add(JOptionPane.showInputDialog("Informe o segundo nome"));
        nomes.add(JOptionPane.showInputDialog("Informe o terceiro nome"));
        nomes.add(JOptionPane.showInputDialog("Informe o quarto nome"));

        String outroNome = JOptionPane.showInputDialog("Informe o quinto nome");

        if (nomes.get(0) == outroNome 
                || nomes.get(1) == outroNome 
                || nomes.get(2) == outroNome 
                || nomes.get(3) == outroNome) {
            System.out.println("O número está contido no ArrayList.");
        } else {
            System.out.println("O número não está contido no ArrayList.");
        }
    }

}
