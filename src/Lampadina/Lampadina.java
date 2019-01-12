package Lampadina;

public class Lampadina 
{
	private enum Stato {
		accesa,
		spenta,
		rotta
	}
	
	private Stato stato;
	private int qualita;
	private int conta = 0;
	
	public Lampadina(int qualita)
	{
		this.qualita = qualita;
		this.stato = Stato.spenta;
	}
	
	public String stato()
	{
		return this.stato.toString();
	}
	
	public void click()
	{
		if(conta++ < qualita)
		{
			if (this.stato == Stato.accesa) this.stato = Stato.spenta;
			
			else this.stato = Stato.accesa;
		}
		else
		{
			this.stato = Stato.rotta;
		}
		
		//System.out.println(this.stato);
		
	}
}
