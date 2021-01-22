package PrefinalRepeticionDeCursada2018;

import java.time.*;

public abstract class Transaccion {
	protected double monto;
	protected LocalDate fecha;
	protected boolean hecho;
	protected boolean deshecho;
	protected abstract boolean cumple();
	public abstract boolean hacer();
	public abstract boolean deshacer();
}
