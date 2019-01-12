package DoppioUnoDellaltro;

import java.util.concurrent.ThreadLocalRandom;

public class Main 
{
	public static void main(String[] args) 
	{
		int [] array = new int [10];
		
		for (int i = 0; i<array.length; i++) 
		{
			array[i] = ThreadLocalRandom.current().nextInt(10,99);
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0, indice = 0; indice<array.length && i<array.length; i++)
		{

			if ((array[indice] == array[i]*2) || (array[i] == array[indice]*2))
			{
				System.out.println("\nDoppio uno dell'altro    " + array[indice] + "    " + array[i]);
				break;
			}
			else if(indice < array.length - 1 && i == array.length-1)
			{
				indice++;
				i = 0;
			}
			else if(indice == array.length-1 && i == array.length-1)
			{
				System.out.println("\nNO");
			}
		}
	}
}
