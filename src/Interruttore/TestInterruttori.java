package Interruttore;

import java.util.Scanner;
import Lampadina.Lampadina;

public class TestInterruttori 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il numero delle volte che puoi accendere e spegnere la lampadina prima che si rompa");
		
		int i = 0;
		int qualita = sc.nextInt();
		Lampadina l = new Lampadina(qualita);
		
		Interruttore i1 = new Interruttore(l);
		Interruttore i2 = new Interruttore(l);
		
		
		while(i<qualita*2)
		{
			System.out.println("Inserisci 0 per usare il primo interruttore\nInserisci qualsiasi altro numero per usare il secondo interruttore");
			if(sc.nextInt() == 0)
			{
				i1.click();
				System.out.println("Primo interruttore: " + i1.getL().stato());
			}
			else
			{
				i2.click();
				System.out.println("Secondo interruttore: " + i2.getL().stato());
			}
			i++;
		}
		
		sc.close();		
	}
}
