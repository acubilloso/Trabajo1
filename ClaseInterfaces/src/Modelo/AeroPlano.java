package Modelo;

public class AeroPlano extends Vehiculo implements Volador {

	
	
	private int altura = 10;
	private int peso = 80;
	protected int alt = 7;
	
	
	public AeroPlano()
	{
		super.tipo = "Aereo";
		super.pasajeros = 6;
	}
	public String despegar() {
		// TODO Auto-generated method stub
		return "necesito 1km o mas para hacerlo";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "el aterrizaje depende del conductor, a veces no es muy bueno o a veces es con una montaña";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "la altura es de "+ altura + " metros en un vuelo comercial y eso que peso " + peso +" toneladas más pasajeros";
	}
	@Override
	public String pasajeros() {
		// TODO Auto-generated method stub
		return "la maxima cantidad de pasajeron es " + super.pasajeros;
	}
	
	public String tipos()
	{
		return "el tipo es " + super.tipo;
	}
	
	public String  imprimir()
	{
		return "Para despegar " + despegar()+ "\n" + aterrizar() + "\n" + volar() + "\n" + tipos();
		
	}  
	

}
