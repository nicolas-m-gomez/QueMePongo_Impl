package exceptiones;

public class ValorFueraDeRangoException extends RuntimeException {
	public ValorFueraDeRangoException(String mensaje) {
		super(mensaje);
	}
}
