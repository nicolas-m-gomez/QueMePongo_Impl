package dominio;

import java.util.List;

public class Atuendo {
	List<Prenda> parteSuperior;
	List<Prenda> parteInferior;
	List<Prenda> calzado;
	List<Prenda> accesorios;
	
	public Atuendo(List<Prenda> parteSuperior, List<Prenda> parteInferior, List<Prenda> calzado, List<Prenda> accesorios) {
		this.parteSuperior = parteSuperior;
		this.parteInferior = parteInferior;
		this.calzado = calzado;
		this.accesorios = accesorios;
	}
	
}
