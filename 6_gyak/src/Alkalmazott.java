
public class Alkalmazott {
	private String nev;
	private int kor;
	private long fizetes;
	private static int nyugdijkorhatar = 65;
	
	public Alkalmazott(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
		
		public Alkalmazott(String nev, int kor) {
			this.nev = nev;
			this.kor = kor;
			this.fizetes = kor * 10000;
	}
		
		public int hanyEvVanMegNyugdijig() {
			return nyugdijkorhatar - kor;
		}

		@Override
		public String toString() {
			return "Alkalmazott [nev=" + nev 
					+ ", kor=" + kor 
					+ ", fizetes="+ fizetes 
					+ ", hanyEvVanMegNyugdijig()="
					+ hanyEvVanMegNyugdijig() + "]";
		}
		
		//csak a random miatt
		public static int getNyugdijkorhatar() {
			return nyugdijkorhatar;
		}

		public static void setNyugdijkorhatar(int nyugdijkorhatar) {
			Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
		}
		
		public static Alkalmazott tobbEveVanHatraNyugdijig(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
			if(elsoAlkalmazott.hanyEvVanMegNyugdijig()> masodikAlkalmazott.hanyEvVanMegNyugdijig())
				return elsoAlkalmazott;
			else{
				return masodikAlkalmazott;
			}
		}
		
		
	
}
