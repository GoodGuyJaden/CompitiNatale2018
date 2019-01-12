package Rettangolo;

public class TestRettangolo 
{
	
	public static void main(String[] args) 
	{
		Rettangolo r1 = new Rettangolo(12, (float)7.5);
		Rettangolo r2 = new Rettangolo((float)9.5, (float)6.4);
		Rettangolo r3 = new Rettangolo((float)24.7, (float)12.4);
		
		System.out.println("Primo rettangolo perimetro e area: " + r1.perimetro() +"   " + r1.area());
		System.out.println("Secondo rettangolo perimetro e area: " + r2.perimetro() +"   " + r2.area());
		System.out.println("Terzo rettangolo perimetro e area: " + r3.perimetro() +"   " + r3.area());
		System.out.println("\nModifico base e altezza del primo rettangolo");
		r1.ridimensiona((float)2.8, (float)7.1);
		System.out.println("Ristampo\n");
		System.out.println("Primo rettangolo perimetro e area modificati: " + r1.perimetro() +"   " + r1.area());
	}
}
