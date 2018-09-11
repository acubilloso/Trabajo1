package Vista;

import javax.swing.JOptionPane;

public class Interfaz {

	
	
	public Interfaz()
	{
		
	}
	
	
	public void darSuperman(String superman)
	{
		JOptionPane.showMessageDialog(null, superman, "SUPERMAN", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void darAeroPlano ( String airplane)
	{
		JOptionPane.showMessageDialog(null, airplane, "AEROPLANO", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void darhelicoptero(String heli)
	{
		JOptionPane.showMessageDialog(null, heli, "HELICOPTERO", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void darHidroAvion(String hidro)
	{
		JOptionPane.showMessageDialog(null, hidro, "HIDRO AVION", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void darPajaro(String plumas) {
		JOptionPane.showMessageDialog(null, plumas, "PAJARO", JOptionPane.INFORMATION_MESSAGE);

	}
	

}
