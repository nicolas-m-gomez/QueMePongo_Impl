package dominio;

import exceptiones.ValorFueraDeRangoException;

public class Color {
	private int red;
	private int green;
	private int blue;
	
	static Color VERDE = new Color(0, 128, 0); 
	static Color ROJO = new Color(128, 0, 0);
	static Color AZUL = new Color(0, 0, 128);
	static Color GRIS = new Color(128, 128, 128);
	static Color BLANCO = new Color(255, 255, 255);
	static Color NEGRO = new Color(0, 0, 0);
	
	public Color(int red, int green, int blue) {
		this.esValido(red);
		this.esValido(green);
		this.esValido(blue);
		
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	private void esValido(int valor) {
		if(valor<0 || valor>255)
			throw new ValorFueraDeRangoException("Parametro fuera de rango. Debe estar entre 0 y 255 ");
	}
}
