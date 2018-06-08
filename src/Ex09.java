import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex09 {
	
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
		
		ArrayList<Integer> numeros2 = new ArrayList<>();
		
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro número")));
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo número")));
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o terceiro número")));
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o quarto número")));
		numeros2.add(Integer.parseInt(JOptionPane
				.showInputDialog("Informe o quinto número")));
		
		int quantidadeNumerosIguais = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == numeros2.get(i)) {
				quantidadeNumerosIguais++;
			}
		}
		
		if (quantidadeNumerosIguais == 7) {
			System.out.println("Todos os elementos do primeiro ArrayList, estão contidos no segundo ArrayList!");
		}
		
	}

}
