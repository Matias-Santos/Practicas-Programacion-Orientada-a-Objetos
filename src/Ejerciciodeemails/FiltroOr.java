package Ejerciciodeemails;

public class FiltroOr extends FiltroConOperador {
	public FiltroOr(Filtro f1, Filtro f2) {
		super(f1, f2);
	}

	public boolean cumple(Email o) {
		return (f1.cumple(o) || f2.cumple(o));
	}
}