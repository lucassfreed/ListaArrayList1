
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Lucas Rodrigo
 */
public class Ex06 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 1� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 2� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 3� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 4� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 5� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 6� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 7� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 8� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 9� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 10� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 11� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 12� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 13� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 14� n�mero")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 15� n�mero")));

        System.out.println(numeros.get(0) 
                + " " + numeros.get(1) 
                + " " + numeros.get(2) 
                + " " + numeros.get(3) 
                + " " + numeros.get(4) 
                + " " + numeros.get(5) 
                + " " + numeros.get(6) 
                + " " + numeros.get(7) 
                + " " + numeros.get(8) 
                + " " + numeros.get(9) 
                + " " + numeros.get(10) 
                + " " + numeros.get(11) 
                + " " + numeros.get(12) 
                + " " + numeros.get(13) 
                + " " + +numeros.get(14)
        );

    }

}
