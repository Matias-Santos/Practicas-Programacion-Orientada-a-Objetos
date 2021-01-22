package Ejerciciodeemails;

public class FiltroAnd extends FiltroConOperador {
	public FiltroAnd(Filtro f1, Filtro f2) {
		super(f1, f2);
	}

	public boolean cumple(Email o) {
		return (f1.cumple(o) && f2.cumple(o));
	}
}