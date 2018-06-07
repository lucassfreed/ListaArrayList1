import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author Lucas Rodrigo
 */
public class Ex07 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add(JOptionPane.showInputDialog("Informe 1� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 2� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 3� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 4� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 5� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 6� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 7� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 8� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 9� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 10� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 11� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 12� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 13� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 14� nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 15� nome"));

		String nomeMaior = "";
		String nomeMenor = Integer.MAX_VALUE + "";
		int quantidadeDePaulos = 0;
		int quantidadeDeAnas = 0;
		int quantidadeDePessoasVogais = 0;

		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).length() > nomeMaior.length()) {
				nomeMaior = nomes.get(i);
			} else if (nomes.get(i).length() < nomeMenor.length()) {
				nomeMenor = nomes.get(i);
			}

			switch (nomes.get(i)) {
			case "Paulo":
				quantidadeDePaulos++;
				break;
			case "Ana":
				quantidadeDeAnas++;
				break;
			}

			if (nomes.get(i).toUpperCase().charAt(0) == 'A' || nomes.get(i).toUpperCase().charAt(0) == 'E'
					|| nomes.get(i).toUpperCase().charAt(0) == 'I' || nomes.get(i).toUpperCase().charAt(0) == 'O'
					|| nomes.get(i).toUpperCase().charAt(0) == 'U') {
				quantidadeDePessoasVogais++;
			}

		}
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("Nome com maior nome: " + nomeMaior);
		System.out.println("Nome com menor nome: " + nomeMenor);
		System.out.println("Quantidade de pessoas que t�m o nome Paulo: " + quantidadeDePaulos);
		System.out.println("Quantidade de pessoas que t�m o nome Ana: " + quantidadeDeAnas);
		System.out.println("Quantidade de pessoas que t�m a primeira letra do nome come�ando com uma vogal: " + quantidadeDePessoasVogais);

	}

}
