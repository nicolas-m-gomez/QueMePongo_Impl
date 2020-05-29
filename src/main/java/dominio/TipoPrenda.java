package dominio;

import java.util.List;
import java.util.Arrays;

public enum TipoPrenda {
	ZAPATOS(Categoria.CALZADO, Arrays.asList(Material.CUERO)),
	ZAPATILLAS(Categoria.CALZADO, Arrays.asList(Material.CUERO, Material.JEAN, Material.LONA)),
	CAMISA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.JEAN, Material.ALGODON, Material.POLIESTER, Material.LANA)),
	REMERA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.ALGODON, Material.POLIESTER)),
	CHOMBA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.ALGODON, Material.POLIESTER, Material.PIQUE)),
	PANTALON(Categoria.PARTE_INFERIOR, Arrays.asList(Material.JEAN, Material.ALGODON, Material.POLIESTER, Material.ACETATO, Material.DE_VESTIR)),
	SHORT(Categoria.PARTE_INFERIOR, Arrays.asList(Material.ALGODON, Material.POLIESTER)),
	AROS(Categoria.ACCESORIO, Arrays.asList(Material.ACERO_QUIRURGICO)),
	PULSERA(Categoria.ACCESORIO, Arrays.asList(Material.ACERO_QUIRURGICO));
	
	private Categoria categoria;
	private List<Material> materialesAdecuados;
	//private List<CondicionClimatica> climasAdecuados;
	
	TipoPrenda(Categoria categoria, List<Material> materialesAdecuados){		
		this.categoria = categoria;
		this.materialesAdecuados = materialesAdecuados;
		//this.climasAdecuados = climasAdecuados;
	}
	
	public Categoria categoria() {
		return categoria;
	}
	
	public List<Material> materialesAdecuados(){
		return materialesAdecuados;
	}
}
