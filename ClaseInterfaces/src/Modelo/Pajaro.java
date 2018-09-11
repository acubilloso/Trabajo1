package Modelo;

public class Pajaro  extends Animal implements Volador{

	private String DetallesNido;
	
	
	public Pajaro()
	{
		DetallesNido = "lo que usualmente usamos es palos y periodico o desechos :´(";
	}
	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "yo como alpiste si soy domesticado sino lo que encuentre";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "inicio a mover mis alas 100 veces por 10 segundos ";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "pongo mis patas y no rompo nada, a veces aruño";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "a veces migro a lugares muy lejanos";
	}
	
	
	public String construirNido()
	{
		return DetallesNido;
		
	}
	
	public String ponerHuevos()
	{
		return "normalmente ponemos 4 o 5 huevos";
	}
	
	
	public String imprimir4()
	{
		return "Para despegar " + despegar()+ "\n	al aterrizar " + aterrizar() + "\n	" + volar() + "\n	" + "al constuir el nido " + construirNido()+ "\n	" + ponerHuevos();
		
	}

	
}
