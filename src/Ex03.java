
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * @author Lucas Rodrigo
 */
public class Ex03 {

    public static void main(String[] args) {
        
        ArrayList<Character> letras = new ArrayList<>();
        
        letras.add(JOptionPane.showInputDialog("Informe a 1ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 2ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 3ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 4ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 5ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 6ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 7ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 8ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 9ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 10ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 11ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 12ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 13ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 14ª letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 15ª letra").charAt(0));
        
        System.out.println(letras.get(0));
        System.out.println(letras.get(1));
        System.out.println(letras.get(2));
        System.out.println(letras.get(3));
        System.out.println(letras.get(4));
        System.out.println(letras.get(5));
        System.out.println(letras.get(6));
        System.out.println(letras.get(7));
        System.out.println(letras.get(8));
        System.out.println(letras.get(9));
        System.out.println(letras.get(10));
        System.out.println(letras.get(11));
        System.out.println(letras.get(12));
        System.out.println(letras.get(13));
        System.out.println(letras.get(14));
        
    }

}
