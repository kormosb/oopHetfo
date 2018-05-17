package sajat.teszt;

import sajat.Henger;
import sajat.Teglatest;

public class Futtathato {

	public static void main(String[] args) {
		Henger henger = new Henger(1,2);
		
		System.out.println(henger);
		System.out.println(henger.getTerfogat());
		
		Teglatest teglatest = new Teglatest(3 ,4, 5);
		System.out.println(teglatest);
		System.out.println(teglatest.getTerfogat());
		
		
		if (teglatest.NagyobbTerfogatuMint(henger)) {
			System.out.println("A teglatest nagyobb terfogatu");
		} else {
			System.out.println("A henger nagyobb terfogatu, vagy egyenloek");
		}
		

	}

}
