package utilidades;

public enum Ciudad {
	BUENOS_AIRES("Buenos Aires, Argentina");
	
	private String nombre;
	
	private Ciudad(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
