package dominio;

public class Prenda {
	private TipoPrenda tipo;
	private Material material;
	private Color colorPrincipal;
	private Color colorSecundario;
	private Trama trama;
	private Double maxTemperaturaAdecuada;
	private Double minTemperaturaAdecuada;
	
	
	public Prenda(TipoPrenda tipo, Material material, Color colorPrincipal, Color colorSecundario, Trama trama, Double maxTemperaturaAdecuada, Double minTemperaturaAdecuada) {
		this.tipo = tipo;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
		this.trama = trama;
		this.maxTemperaturaAdecuada = maxTemperaturaAdecuada;
		this.minTemperaturaAdecuada = minTemperaturaAdecuada;
	}
	
	public Categoria categoria() {
		return tipo.categoria();
	}
	
	public TipoPrenda getTipoPrenda() {
		return this.tipo;
	}
	
	public Material getMaterial() {
		return this.material;
	}
	
	public Trama getTrama() {
		return this.trama;
	}
	
	public Double getMaxTemperaturaAdecuada() {
		return this.maxTemperaturaAdecuada;
	}
	
	public Double getMinTemperaturaAdecuada() {
		return this.minTemperaturaAdecuada;
	}
}
