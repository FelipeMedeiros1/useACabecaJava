package useACabecaJava.Test;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class PesquisaCandidato {

	static Integer qtdPessoas = 0;

	public static void main(String[] args) {

		Integer opcao;
		Integer ze = 0;
		Integer rita = 0;
		Integer nulo = 0;

		qtdPessoas = Integer.parseInt(JOptionPane.showInputDialog("Escolha a quantidade de participantes:"));

		for (int i = 0; i < qtdPessoas; i++) {

			String opcaoStr = JOptionPane.showInputDialog("Opção: 1 = Zé da Farmácia.     Opção: 2 =  Rita da Padaria");

			if (!opcaoStr.isEmpty() && opcaoStr.matches("[0-9]+")) {
				opcao = Integer.parseInt(opcaoStr);

			} else {
				opcao = 3;
			}

			switch (opcao) {
			case 1:
				ze++;
				break;
			case 2:
				rita++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Seu voto foi anulado !!!    Digite a opção 1 ou 2.");
				nulo++;
			}
		}

		JOptionPane.showMessageDialog(null, "Total de participantes = " + qtdPessoas);

		JOptionPane.showMessageDialog(null,
				"Zé da Farmácia obteve " + percentual(ze) + "%  da pesquisa com " + ze + " votos");

		JOptionPane.showMessageDialog(null,
				"  Rita da Padaria obteve " + percentual(rita) + "%  da pesquisa com " + rita + " votos");

		JOptionPane.showMessageDialog(null, "  Votos nulos foram " + percentual(nulo) + "%  com " + nulo + " votos");

	}

	private static String percentual(double candidato) {
		return new DecimalFormat("#0.00").format(((candidato / qtdPessoas) * 100));
	}
}
