import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro número")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo número")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o terceiro número")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o quarto número")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o quinto número")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o sexto número")));
		numeros.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o sétimo número")));

	}

}
