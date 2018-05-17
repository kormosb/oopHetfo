import java.util.Random;
import java.util.Scanner;


public class AlkalmazottHasznalo {
	
	public static void main(String[] args) {
		Scanner beolvasas = new Scanner(System.in);
		int meret;
		System.out.println("Kerem az alkalmazottak szamat: ");
		System.out.println("meret=");
		meret = beolvasas.nextInt();
		Alkalmazott alkalmazottak [] = new Alkalmazott[meret];
		
		Random veletlenszam = new Random();
		
		int nyugdijkorhatar = Alkalmazott.getNyugdijkorhatar();
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott("XY" + (i+1), 64+ veletlenszam.nextInt(nyugdijkorhatar -63 ));
			
			System.out.println(alkalmazottak[i]);
		}
		
		Alkalmazott.setNyugdijkorhatar(70);
		System.out.println("korhataremeles");
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}

		
		System.out.println("5 evnel kevesebb");
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			if(alkalmazott.hanyEvVanMegNyugdijig()<=5)
				System.out.println(alkalmazott);
		}
		
		
		
		beolvasas.close();
	}
}

