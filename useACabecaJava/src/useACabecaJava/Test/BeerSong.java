package useACabecaJava.Test;

public class BeerSong {
	public static void main(String[] args) {

		int beerNumber = 99;
		String word = "Bottles";

		while (beerNumber > 0) {
			if (beerNumber == 1) {
				word = "Bottle";

			}

			System.out.println(beerNumber + " " + word + " of beer on the wall");
			System.out.println(beerNumber + " " + word + " of beer.");
			System.out.println("Take one down!");
			System.out.println("Pass it around");

			beerNumber--;

			if (beerNumber == 0) {
				System.out.println("No more bottles of beer on the wall!!");
			}

		}
	}
}
