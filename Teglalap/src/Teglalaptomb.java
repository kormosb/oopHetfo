
public class Teglalaptomb {
	
	public static void main(String[] args) {
		int meret = 10;
		Teglalap teglalaptomb [] = new Teglalap[meret];
		
		for (int i = 0; i < teglalaptomb.length; i++) {
			teglalaptomb[i] = new Teglalap((int)(Math.random()* 9)+2 , (int)(Math.random()* 9)+2) ;
			System.out.println(teglalaptomb[i]);
		}
		
		int min_index=0;
		
		for (int i = 1; i < teglalaptomb.length; i++) {
			if(teglalaptomb[min_index].teruletNagyobbMint(teglalaptomb[i]))
					min_index=i;
		}
		System.out.println(teglalaptomb[min_index]);
	}

}
