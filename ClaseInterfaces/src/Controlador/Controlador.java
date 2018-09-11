package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	
	
	private Mundo m;
	private Interfaz gui;
	
	
	public Controlador()
	{
		m = new Mundo();
		gui = new Interfaz();
		mostrarDatos();
	}
	
	
	public void mostrarDatos()
	{
		String aereoplano = m.air.imprimir();
		String superman = m.sup.imprimir6();
		String hidro = m.hd.imprimir2();
		String plumas = m.p.imprimir4();
		String helicop = m.heli.imprimir7();
		
		
		gui.darAeroPlano(aereoplano);
		gui.darHidroAvion(hidro);
		gui.darPajaro(plumas);
		gui.darhelicoptero(helicop);
		gui.darSuperman(superman);
	}
}
