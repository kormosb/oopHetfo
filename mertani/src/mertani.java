import java.util.Scanner;
public class mertani {

	public static void main(String[] args) 
	{
		double [] tomb = new double[10];
		Scanner bemenet = new Scanner(System.in);
		
		for (int i = 0; i < tomb.length; i++) 
		{
			System.out.println("Kérem a szamot :");
			tomb[i] = bemenet.nextDouble();
		}
	}

}
