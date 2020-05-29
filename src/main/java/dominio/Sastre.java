package dominio;

public abstract class Sastre {
	public Uniforme fabricarUniforme() {
		return new Uniforme(this.fabricarParteSuperior(), this.fabricarParteInferior() , this.fabricarCalzado());
	}
	
	public abstract Prenda fabricarParteSuperior();
	public abstract Prenda fabricarParteInferior();
	public abstract Prenda fabricarCalzado();
}
