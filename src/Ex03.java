
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * @author Lucas Rodrigo
 */
public class Ex03 {

    public static void main(String[] args) {
        
        ArrayList<Character> letras = new ArrayList<>();
        
        letras.add(JOptionPane.showInputDialog("Informe a 1� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 2� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 3� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 4� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 5� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 6� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 7� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 8� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 9� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 10� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 11� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 12� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 13� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 14� letra").charAt(0));
        letras.add(JOptionPane.showInputDialog("Informe a 15� letra").charAt(0));
        
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
