import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro n�mero")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo n�mero")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o terceiro n�mero")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o quarto n�mero")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o quinto n�mero")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o sexto n�mero")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o s�timo n�mero")));

	}

}
