package Libro;

public class Libro 
{
	private int numPagine;
	
	public Libro(int numPagine) 
	{
		this.numPagine = numPagine;
	}
	
	public void pageMessage()
	{
		System.out.println(numPagine);
	}
	
	public int getNumPagine() 
	{
		return numPagine;
	}
}
