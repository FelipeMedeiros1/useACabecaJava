package useACabecaJava.Test;

public class PhraseOMatic {

	public static void main(String[] args) {

		String[] wordListOne = { "processo,", "ponto máximo,", "solução,", "arquitetura,", "habilitação no núcleo,",
				"estratégia,", "mindshare,", "portal,", "espaço,", "visão,", "paradigma,", "missão," };

		String[] wordListTwo = { "habilitado,", "adesivo,", "valor agregado,", "orientado,", "central,", "distribuído,",
				"agrupado,", "solidificado,", "independente da máquina,", "posicionado,", "em rede,", "dedicado,",
				"alavancado,", "alinhado,", "destinado,", "compartilhado,", "cooperativo,", "acelerado," };

		String[] wordListThree = { "24/7.", "várias camadas.", " 30 mil pés.", " B-to-B.", "todos ganham.",
				"front-end.", "baseado na web.", "difundido.", "inteligente.", "6-sigma.", "caminho crítico.",
				"dinâmico." };

		int oneLenght = wordListOne.length;
		int twoLenght = wordListTwo.length;
		int threeLenght = wordListThree.length;

		int rand1 = (int) (Math.random() * oneLenght);
		int rand2 = (int) (Math.random() * twoLenght);
		int rand3 = (int) (Math.random() * threeLenght);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.println("Precisamos de " + phrase);
		// System.out.println("wordListOne: " + oneLenght);
		// System.out.println("wordListTwo: " + twoLenght);
		// System.out.println("wordListThree: " + threeLenght);

	}

}
