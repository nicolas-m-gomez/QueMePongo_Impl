package dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBorrador {
	Borrador borrador;
	Material material;
	Color colorPrincipal;
	Prenda prenda;
	
	@Before
	public void init() {
		borrador = new Borrador(TipoPrenda.CAMISA);
		material = Material.ALGODON;
		colorPrincipal = new Color(0,0,0);
	}
	
	@Test
	public void testPrendaTramaLisaDefault() {
		borrador.cargarMaterial(material);
		borrador.cargarColorPrimario(colorPrincipal);
		prenda = borrador.crearPrenda();
		assertEquals(prenda.getTrama(), Trama.LISA);
	}
}
