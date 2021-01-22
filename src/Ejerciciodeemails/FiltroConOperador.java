package Ejerciciodeemails;

public abstract class FiltroConOperador extends Filtro {
	protected Filtro f1;
	protected Filtro f2;

	public FiltroConOperador(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	public abstract boolean cumple(Email o);
}
