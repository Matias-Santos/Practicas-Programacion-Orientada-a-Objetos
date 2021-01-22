package PrefinalRepeticionDeCursada2018;

import java.time.LocalDate;

public class TransaccionTransferencia extends Transaccion {
	
	private Cuenta cuenta1;
	private Cuenta cuenta2;
	
	public TransaccionTransferencia(Cuenta cuenta1, Cuenta cuenta2, double monto,LocalDate fecha) {
		this.cuenta1 = cuenta1;
		this.cuenta2 = cuenta2;
		this.monto = monto;
		this.fecha = fecha;
		hecho = false;
		deshecho = false;
	}
	protected boolean cumple() {
		if (cuenta1.getFondo() + cuenta1.getFondoDescubierto() >= monto)
			return true;
		return false;
	}
	public boolean hacer() {
		if ((!hecho) && cumple())
		{
			cuenta1.setFondo(cuenta1.getFondo() - monto);
			cuenta2.setFondo(cuenta2.getFondo() + monto);
			hecho = true;
			return true;
		}
		return false;
	}
	public boolean deshacer() {
		if (!deshecho)
		{
			cuenta1.setFondo(cuenta1.getFondo() + monto);
			cuenta2.setFondo(cuenta2.getFondo() - monto);
			deshecho = true;
			return true;
		}
		return false;
	}
}
