
public class piertek {
	
	public static void main(String[] args) 
	{
		double pi= 1;
		int darab= 1000 / 2;
		for (int i = 1; i < darab; i++) 
		{
			pi=pi *2.0 *i / (2*i-1);
			pi=pi *2.0 *i / (2*i+1);
			
		}
		
		System.out.println("Wallis-formula:" +pi);
		System.out.println("pi / 2 erteke:" + pi);
		System.out.println("pi: "+pi *2);
		System.out.println("Leibniz:");
	}

}
