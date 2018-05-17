package polinom;

import java.util.Scanner;

import matematika.Polinom;

public class Teszt {
	
	public static void fvTablazat(Polinom polinom) {
		System.out.println(polinom + "Fv.tablazata");
		System.out.println("x\ty");
		
		for (double i = 0; i <= 1; i= i+0.1) {
			System.out.println(i + "\t");
			System.out.println(polinom.szamol(i));
		}
		
	}
	public static void main(String[] args) {
		LinearisPolinom polinom = new LinearisPolinom(2,-3);
		System.out.println(polinom);
		
		int polinomokDarabszama = 2;
		LinearisPolinom [] polinomok = new LinearisPolinom [polinomokDarabszama];
		
		Scanner beolvasas = new Scanner(System.in);
		
		for (int i = 0; i < polinomok.length; i++) {
			System.out.println("Kérem a(z) " + (i + 1)
					+ ".polinom elso egyutthatojat!");
			System.out.println("a=");
			double a = beolvasas.nextDouble();
			beolvasas.nextLine();
			
			System.out.println("Kérem a(z) " + (i + 1)
					+ ".polinom masodik egyutthatojat!");
			System.out.println("b=");
			double b = beolvasas.nextDouble();
			beolvasas.nextLine();
			polinomok[i]= new LinearisPolinom(a, b);
			
			
		}
		for (LinearisPolinom linearisPolinom : polinomok) {
			System.out.println(linearisPolinom);
		}
		
		fvTablazat(polinomok[polinomok.length - 1]);
		
		beolvasas.close();
	}

}
