package harmadik;

import java.awt.Color;

import masik.Pont;
import sajat.ISzinezheto;

public class SzinesPont extends Pont implements ISzinezheto {

	private Color szin;
	
	
	public SzinesPont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}
	
	public SzinesPont(Color szin) {
		super(0, 0);
		this.szin = szin;
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
	}

	@Override
	public String toString() {
		return "SzinesPont [szin=" + szin + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
