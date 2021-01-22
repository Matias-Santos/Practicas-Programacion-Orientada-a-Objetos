package Ejerciciodeemails;

public class FiltroE extends Filtro {
	private String emisor;

	public FiltroE(String e) {
		emisor = e;
	}

	public boolean cumple(Email o) {
		return emisor.equals(o.getEmisor());
	}
}