
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Lucas Rodrigo
 */
public class Ex06 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 1º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 2º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 3º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 4º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 5º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 6º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 7º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 8º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 9º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 10º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 11º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 12º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 13º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 14º número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Informe 15º número")));

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
