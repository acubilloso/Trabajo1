package Modelo;

public class HidroAvion extends AeroPlano{

	private String color = "Amarilloo";
	
	
	
	public String altura() {
		return "Yo puedo volar a una altura de " + super.alt;
		
	}
	
	public String pintura()
	{
		return " En algunas ocasiones me pintan de " + this.color;
	}
	
	
	public String imprimir2()
	{
		return altura()+"\n"+ pintura();
	}
	
}
