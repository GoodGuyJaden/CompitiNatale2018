package StampaZigZag;

public class Main 
{
	public static void main(String[] args) 
	{
		int [] array = new int [10];
		
		for (int i = 0;i<array.length;i++)
		{
			array[i] = (int)(Math.random()*89+10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0, j = array.length-1; i<j; i++, j--)
		{
			System.out.print(array[i] + " " + array[j] + " ");
		}
	}
}
