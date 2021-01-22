package Ejerciciodeemails;

public class FiltroT extends Filtro {
	private String titulo;

	public FiltroT(String t) {
		titulo = t;
	}

	public boolean cumple(Email o) {
		return titulo.equals(o.getTitulo());
	}
}