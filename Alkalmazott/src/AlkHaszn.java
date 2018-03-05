import java.util.Random;


public class AlkHaszn {

	public static void main(String[] args) {
		Random veletlenszam = new Random();
		Alkalmazott alkalmazott = new Alkalmazott();
		//alkalmazott.nev = "Kormos Balazs";
		//alkalmazott.fizetes = 10;
		alkalmazott.setNev("Kormos Balazs");
		alkalmazott.setFizetes(15);
		System.out.println(alkalmazott.getFizetes());
		System.out.println(alkalmazott.getNev());
		
		
		System.out.println(alkalmazott.toString());
		alkalmazott.fizetestNovel(5);
		System.out.println(alkalmazott);
		System.out.println(alkalmazott.fizetesIntervallumokKozott(10, 40));
		System.out.println(alkalmazott.fizetendoAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setNev("Kiss Klaudia");
		alkalmazott2.setFizetes(80);
		
		System.out.println(alkalmazott.nagyobbfizetesuMint(alkalmazott2));
		System.out.println(alkalmazott2.nagyobbfizetesuMint(alkalmazott));
		
		Alkalmazott [] alkalmazottak = new Alkalmazott [5];
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes(veletlenszam.nextInt(50)+1);
			System.out.println(alkalmazottak[i]);
		}
		
		
	}

}
