package Ejerciciodeemails;

import java.time.LocalDate;

public class FiltroDate extends Filtro {
	private LocalDate fecha;

	public FiltroDate(LocalDate f) {
		fecha = f;
	}

	public boolean cumple(Email o) {
		return fecha.isEqual(o.getFecha());
	}
}