package utilidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

public class TestUtilitarioFechas {
	UtilitarioFechas utilitarioFechas;
	LocalDateTime fechaTest;
	LocalDateTime fechaInicio;
	LocalDateTime fechaFin;
	String fechaAParsear;
	
	@Before
	public void init() {
		utilitarioFechas = new UtilitarioFechas();
		fechaAParsear = "2019-05-03T01:00:00-03:00";
		fechaTest = LocalDateTime.of(2019, 05, 03, 01, 00);
		fechaInicio = LocalDateTime.of(2020, 05, 29, 01, 00);
		fechaFin = LocalDateTime.of(2020, 05, 29, 06, 00);
	}
	
	@Test
	public void TestFechaUltimaConsulta() {
		assertEquals(fechaTest, utilitarioFechas.convertirAFecha(fechaAParsear, DateTimeFormatter.ISO_OFFSET_DATE_TIME));
	}
	
	@Test
	public void TestDiferenciaEnHHEntreFechas() {
		assertEquals(Double.valueOf(5), utilitarioFechas.diferenciaEnHHEntre(fechaInicio, fechaFin));
	}
	
	@Test(expected = NullPointerException.class)
	public void TestDiffEnHHEntreFechasConFechaNula() {
		assertEquals(Double.valueOf(5), utilitarioFechas.diferenciaEnHHEntre(null, fechaFin));
	}
}
