
public class piertek {
	
	public static void main(String[] args) 
	{
		double pi= 1;
		int darab= 1000 / 2;
		for (int i = 1; i <= darab; i++) 
		{
			pi=pi *2.0 *i / (2*i-1);
			pi=pi *2.0 *i / (2*i+1);
			
		}
		System.out.println("Wallis-formula:" +pi);
		System.out.println("pi / 2 erteke:" + pi);
		System.out.println("pi: "+pi *2);
		
		//Leibniz
		
		pi = 0;
		darab = darab*4;
		int elojel = 1;
		
		for (int i = 1; i <=darab ; i= i+2) 
		{
			pi= pi + elojel *1.0 / i;
			elojel = elojel * -1;
		}
		
		System.out.println("Leibniz-fele sor");
		System.out.println("pi / 2 erteke:" + pi*2);
		System.out.println("pi: "+pi *4);
		
		//Faktorialis
		
		int szam=1;
		for (int i = 0; i < 10; i++) 
		{
			szam= szam*
		}
	}

}
