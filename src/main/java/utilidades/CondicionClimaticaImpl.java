package utilidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import servicios.AccuWeatherAPI;

public class CondicionClimaticaImpl implements CondicionClimatica{
	private List<Map<String, Object>> condicionesClimaticas;
	private Ciudad ciudad;
	
	private static int INTERVALO_HH_CONSULTAS = 3;
	
	public CondicionClimaticaImpl(Ciudad ciudad) {
		this.ciudad = ciudad;
		this.obtenerDatosApi();
	}
	
	@Override
	public Double obtenerTemperaturaActual() {
		UtilitarioFechas utilitarioFechas = new UtilitarioFechas();
		if(utilitarioFechas.diferenciaEnHHEntre(this.fechaUltimaConsulta(), LocalDateTime.now()) > this.INTERVALO_HH_CONSULTAS)
			this.obtenerDatosApi();
		return this.obtenerTemperaturaEnCelsius();
	}
	
	private void obtenerDatosApi() {
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		condicionesClimaticas = apiClima.getWeather(ciudad.getNombre());
	}
	
	private Double obtenerTemperaturaEnCelsius(){
		HashMap<String, Object> tempObjeto = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
		return (((double) tempObjeto.get("Value")) - 32) * 5/9; 
	}
	
	private LocalDateTime fechaUltimaConsulta() {
		UtilitarioFechas utilitarioFechas = new UtilitarioFechas();
		return utilitarioFechas.convertirAFecha((CharSequence) condicionesClimaticas.get(0).get("Datetime"), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
	}

}
