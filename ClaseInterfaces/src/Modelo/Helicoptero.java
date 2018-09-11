
package Modelo;

public class Helicoptero extends AeroPlano{

	private String color;
	
	
	public Helicoptero()
	{
		super.alt = 4;
		super.pasajeros = 5;
		this.color = "verde camuflado";
	}
	
	
	
	public String altura()
	{
		return "La altura maxima es " + super.alt;
		
	}
	
	public String pasajer()
	{
		return "El numero de pasajeros es " + super.pasajeros;
	}
	
	
	public String colo()
	{
		return "Mi color es " + this.color;
	}
	
	
	public String imprimir7()
	{
		return altura()+ "\n" + pasajer() +"\n" + colo();
	}
}
