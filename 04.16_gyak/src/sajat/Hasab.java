package sajat;

public abstract class Hasab {
	private double magassag;

	public Hasab(double magassag) {
		super();
		this.magassag = magassag;
	}

	public double getMagassag() {
		return magassag;
	}
	
	public abstract double getAlapterulet();
	
	public double getTerfogat() {
		return getAlapterulet() * magassag;
	}
	
	public boolean NagyobbTerfogatuMint(Hasab masik) {
		return getTerfogat() > masik.getTerfogat();
	}
	
}
