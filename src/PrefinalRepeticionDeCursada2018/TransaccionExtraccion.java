package PrefinalRepeticionDeCursada2018;

import java.time.LocalDate;

public class TransaccionExtraccion extends Transaccion {
	
	private Cuenta cuenta1;
	
	public TransaccionExtraccion(Cuenta cuenta1, double monto,LocalDate fecha) {
		this.cuenta1 = cuenta1;
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
		if((!hecho) && cumple())
		{
			cuenta1.setFondo(cuenta1.getFondo() - monto);
			hecho = true;
			return true;
		}
		return false;
	}
	public boolean deshacer() {
		if(!deshecho)
		{
			cuenta1.setFondo(cuenta1.getFondo() + monto);
			deshecho = true;
			return true;
		}
		return false;
	}
}
