import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author Lucas Rodrigo
 */
public class Ex07 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add(JOptionPane.showInputDialog("Informe 1º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 2º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 3º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 4º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 5º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 6º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 7º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 8º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 9º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 10º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 11º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 12º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 13º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 14º nome"));
		nomes.add(JOptionPane.showInputDialog("Informe 15º nome"));

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
		System.out.println("Quantidade de pessoas que têm o nome Paulo: " + quantidadeDePaulos);
		System.out.println("Quantidade de pessoas que têm o nome Ana: " + quantidadeDeAnas);
		System.out.println("Quantidade de pessoas que têm a primeira letra do nome começando com uma vogal: " + quantidadeDePessoasVogais);

	}

}
