package dominio;

import java.util.Objects;

public class Borrador {
	private TipoPrenda tipo;
	private Material material;
	private Color colorPrincipal;
	private Color colorSecundario;
	private Trama trama;
	
	public Borrador(TipoPrenda tipo) {
		this.tipo = Objects.requireNonNull(tipo, "Debe especificarse el tipo de prenda a crearse");
	}
		
	public void cargarMaterial(Material material) {
		Objects.requireNonNull(material);
		this.tipoPrendaConsistenteCon(material);
		this.material = material;
	}
	
	public void cargarColorPrimario(Color colorPrincipal) {
		Objects.requireNonNull(colorPrincipal);
		this.colorPrincipal = colorPrincipal;
	}
	
	public void cargarColorSecundario(Color colorSecundario) {
		Objects.requireNonNull(colorSecundario);
		this.colorSecundario = colorSecundario;
	}
	
	public void cargarTrama(Trama trama) {
		this.trama = trama;
	}
	
	public Prenda crearPrenda() {
		Objects.requireNonNull(material);
		Objects.requireNonNull(colorPrincipal);
		this.trama = (Objects.isNull(this.trama)) ? Trama.LISA : this.trama;
		return new Prenda(tipo, material, colorPrincipal, colorSecundario, trama, null, null);
	}
	
	private Boolean tipoPrendaConsistenteCon(Material material) {		
		return tipo.materialesAdecuados().stream().anyMatch(m -> m.equals(material));
	}
	
	
}
