import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex09 {
	
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
		
		ArrayList<Integer> numeros2 = new ArrayList<>();
		
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro n�mero")));
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo n�mero")));
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o terceiro n�mero")));
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o quarto n�mero")));
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o quinto n�mero")));
		
		int quantidadeNumerosIguais = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == numeros2.get(i)) {
				quantidadeNumerosIguais++;
			}
		}
		
		if (quantidadeNumerosIguais == 7) {
			System.out.println("Todos os elementos do primeiro ArrayList, est�o contidos no segundo ArrayList!");
		}
		
	}

}
