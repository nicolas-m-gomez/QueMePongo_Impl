package dominio;

public class SastreJohnson extends Sastre {

	@Override
	public Prenda fabricarParteSuperior() {
		Borrador borrador = new Borrador(TipoPrenda.CAMISA);
		borrador.cargarColorPrimario(Color.BLANCO);
		borrador.cargarMaterial(Material.ALGODON);
		return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarParteInferior() {
		Borrador borrador = new Borrador(TipoPrenda.PANTALON);
		borrador.cargarColorPrimario(Color.NEGRO);
		borrador.cargarMaterial(Material.DE_VESTIR);
		return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarCalzado() {
		Borrador borrador = new Borrador(TipoPrenda.ZAPATOS);
		borrador.cargarColorPrimario(Color.NEGRO);
		borrador.cargarMaterial(Material.CUERO);
		return borrador.crearPrenda();
	}
}
