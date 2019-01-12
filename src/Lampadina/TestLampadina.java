package Lampadina;

import java.util.Scanner;

public class TestLampadina 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Lampadina l = new Lampadina(5);
		int i = 0;
		
		System.out.println("Inserisci il numero delle volte che puoi accendere e spegnere la lampadina prima che si rompa");
		int qualita = sc.nextInt();
		
		while(i<qualita*2)
		{
			System.out.println("Inserisci 0 per accendere o spegnere\nInserisci qualsiasi altro numero per vedere lo stato della lampadina");
			if(sc.nextInt() == 0)
			{
				l.click();
			}
			else
			{
				System.out.println(l.stato());
			}
			i++;
		}
		
		sc.close();
	}
}
