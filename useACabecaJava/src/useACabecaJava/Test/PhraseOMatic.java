package useACabecaJava.Test;

public class PhraseOMatic {

	public static void main(String[] args) {

		String[] wordListOne = { "processo,", "ponto m�ximo,", "solu��o,", "arquitetura,", "habilita��o no n�cleo,",
				"estrat�gia,", "mindshare,", "portal,", "espa�o,", "vis�o,", "paradigma,", "miss�o," };

		String[] wordListTwo = { "habilitado,", "adesivo,", "valor agregado,", "orientado,", "central,", "distribu�do,",
				"agrupado,", "solidificado,", "independente da m�quina,", "posicionado,", "em rede,", "dedicado,",
				"alavancado,", "alinhado,", "destinado,", "compartilhado,", "cooperativo,", "acelerado," };

		String[] wordListThree = { "24/7.", "v�rias camadas.", " 30 mil p�s.", " B-to-B.", "todos ganham.",
				"front-end.", "baseado na web.", "difundido.", "inteligente.", "6-sigma.", "caminho cr�tico.",
				"din�mico." };

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
