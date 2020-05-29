package dominio;

public class SastreSanJuan extends Sastre {

	@Override
	public Prenda fabricarParteSuperior() {
		Borrador borrador = new Borrador(TipoPrenda.CHOMBA);
		borrador.cargarColorPrimario(Color.VERDE);
		borrador.cargarMaterial(Material.PIQUE);
		return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarParteInferior() {
		Borrador borrador = new Borrador(TipoPrenda.PANTALON);
		borrador.cargarColorPrimario(Color.GRIS);
		borrador.cargarMaterial(Material.ACETATO);
		return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarCalzado() {
		Borrador borrador = new Borrador(TipoPrenda.ZAPATILLAS);
		borrador.cargarColorPrimario(Color.BLANCO);
		borrador.cargarMaterial(Material.LONA);
		return borrador.crearPrenda();
	}
}
