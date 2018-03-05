
public class Alkalmazott {
	private String nev;
	private long fizetes;
	
	public void fizetestNovel(long ertek) {
		fizetes = fizetes + ertek;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nevparameter) {
		this.nev = nevparameter;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

	@Override
	public String toString() {
		return "Alkalmazott neve: " + nev + ", fizetese:" + fizetes + " Ft";
	}
	
	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar && fizetes <= felsohatar;
	}
	
	public long fizetendoAdo() {
		return (long) (fizetes * 0.16);
	}
	
	public boolean nagyobbfizetesuMint(Alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	
	
	
}
