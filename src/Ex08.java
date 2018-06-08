import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {

		ArrayList<Double> salarios = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			salarios.add(Double.parseDouble(JOptionPane
					.showInputDialog("Informe o " + (i + 1) + " salário")));
		}
		
		for (int i = 0; i < salarios.size(); i++) {
			System.out.println(salarios.get(i) + "\n");
		}
		
		double media = 0;
		double soma = 0;
		int quantidadeSalariosPares = 0;
		int quantidadeSalariosImpares = 0;
		
		for (int i = 0; i < salarios.size(); i++) {
			soma = (soma + salarios.get(i));
			
			if ((i % 2) == 0) {
				quantidadeSalariosPares++;
			} else {
				quantidadeSalariosImpares++;
			}
		}
		
		media = soma / salarios.size();
		
		System.out.println("\nMédia dos salários: " + media);
		System.out.println("\nSoma dos salários: " + soma);
		System.out.println("\nSoma dos salários que estão armazenados em posições pares: " + quantidadeSalariosPares);
		System.out.println("\nSoma dos salários que estão armazenados em posições ímpares: " + quantidadeSalariosImpares);
		System.out.println("\nQuantidade de salários que estão armazenados: " + salarios.size());
		
	}

}
