package Interruttore;
import Lampadina.Lampadina;

public class Interruttore 
{
	private Lampadina lampadina;
	
	
	public Interruttore(Lampadina lampadina)
	{
		this.lampadina = lampadina;
	}
	
	public void click()
	{
		this.lampadina.click();
	}
	
	public Lampadina getL()
	{
		return this.lampadina;
	}
}
