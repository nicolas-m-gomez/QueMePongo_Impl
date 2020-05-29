package dominio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utilidades.Ciudad;
import utilidades.CondicionClimatica;
import utilidades.CondicionClimaticaImpl;

public class Asesor {
	List<Prenda> parteSuperior;
	List<Prenda> parteInferior;
	List<Prenda> calzado;
	List<Prenda> accesorios;
	
	public Asesor(List<Prenda> parteSuperior, List<Prenda> parteInferior, List<Prenda> calzado, List<Prenda> accesorios) {
		this.parteSuperior = parteSuperior;
		this.parteInferior = parteInferior;
		this.calzado = calzado;
		this.accesorios = accesorios;
	}
	
	public Atuendo sugerirAtuendo() {
		return new Atuendo(
			Arrays.asList(this.elegirPrendaSegunTemperatura(parteSuperior)), 
			Arrays.asList(this.elegirPrendaSegunTemperatura(parteInferior)), 
			Arrays.asList(this.elegirPrendaSegunTemperatura(calzado)), 
			Arrays.asList(this.elegirPrendaSegunTemperatura(accesorios))
		);
	}
	
	private Prenda elegirPrendaSegunTemperatura(List<Prenda> prendas) {
		CondicionClimatica condicionClimatica = new CondicionClimaticaImpl(Ciudad.BUENOS_AIRES);
		Double temperatura = condicionClimatica.obtenerTemperaturaActual();
		return prendas.stream().filter(p->p.getMinTemperaturaAdecuada() < temperatura && p.getMaxTemperaturaAdecuada() > temperatura).collect(Collectors.toList()).get(0);
	}
}