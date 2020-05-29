package utilidades;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class UtilitarioFechas {
	public UtilitarioFechas() {}
	
	public LocalDateTime convertirAFecha(CharSequence cadena, DateTimeFormatter formato) {
		return LocalDateTime.parse(cadena, formato);
	}
	
	public Double diferenciaEnHHEntre(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		return (double) ((fechaFin.toEpochSecond(ZoneOffset.UTC) / 3600) - (fechaInicio.toEpochSecond(ZoneOffset.UTC) / 3600));
	}
}
