package Libro;

public class Vocabolario extends Libro
{
	private int numDefinizioni;
	
	public Vocabolario(int numPagine, int numDefinizioni) 
	{
		super(numPagine);
		this.numDefinizioni = numDefinizioni;
	}
	
	public void definitionMessage()
	{
		System.out.println("Numero pagine: " + super.getNumPagine() + "\nNumero definizioni: " + numDefinizioni + "\nNumero definizioni medio per pagine: " + (numDefinizioni/super.getNumPagine()));
	}
}
