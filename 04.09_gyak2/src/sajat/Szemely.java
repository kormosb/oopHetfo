package sajat;

public class Szemely {
	
	private String nev;
	private int kor;
	
	public Szemely(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
	}

	public String getNev() {
		return nev;
	}

	public int getKor() {
		return kor;
	}

	@Override
	public String toString() {
		return "Szemely [nev=" + nev + ", kor=" + kor + "]";
	}

	public boolean eletkorNagyobbE(Szemely masik) {
		return getKor() > masik.getKor();
		
	}
	
}
