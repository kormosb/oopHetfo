package proba;

import harmadik.SzinesPont;
import java.awt.Color;
import sajat.ISzinezheto;
import harmadik.Toll;

public class TesztProba {

	public static void main(String[] args) {
		ISzinezheto szinespont = new SzinesPont(Color.BLUE);
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		setDefaultSzin(szinespont);
		System.out.println(szinespont);
		
		
		
		ISzinezheto toll = new Toll ("toll", "Parker", 2000, Color.CYAN);
		
		
		System.out.println(toll.toString());
		toll.setSzin(Color.ORANGE);
		System.out.println(toll);
		setDefaultSzin(toll);
		System.out.println(toll);
		System.out.println(((Toll)toll).markaEgyenlo((Toll)toll));
		
	}
	public static void setDefaultSzin(ISzinezheto objektum) {
		objektum.setSzin(objektum.alapertelmezettSzin);
		
	}
	

	
	
	
	
	
	

}