package Rettangolo;

public class Rettangolo 
{
	private float base;
	private float altezza;
	
	public Rettangolo(float base, float altezza)
	{
		this.base = base;
		this.altezza = altezza;
	}
	
	public void ridimensiona(float base, float altezza)
	{
		this.base = base;
		this.altezza = altezza;
	}
	
	public float perimetro()
	{
		return (base+altezza)*2;
	}
	
	public float area()
	{
		return base*altezza;
	}
}
