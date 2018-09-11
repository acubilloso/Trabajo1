package Modelo;

public class Superman extends Kryptonita implements Volador {
	
	
	
	
	
	private int velocidad  =400;
	
	
	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "con cuidado no rompo nada";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "al aterrizar destruyo todo a mi al rededor";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "yo puedo volar a "+ this.velocidad +" mph";
	}

	@Override
	public String debilidad() {
		// TODO Auto-generated method stub
		return "mi debilidad es ese diamante " + super.color ;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "soy superman no necesito eso";
	}
	
	public String pararBalas()
	{
		return "mi cuerpo soporta todo";
	}
	
	public String imprimir6()
	{
		return "Al despegar " + despegar()+ " \n	" + aterrizar() + "\n	" + volar() + "\n	pero " + debilidad() + "\n	no como " + comer() + "\n aun así " + pararBalas();
		
		
	}
	
}
