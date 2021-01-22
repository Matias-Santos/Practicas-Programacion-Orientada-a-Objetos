package PrefinalRepeticionDeCursada2018;

import java.time.*;

public class TransaccionDeposito extends Transaccion {

	private Cuenta cuenta1;
	
	public TransaccionDeposito(Cuenta cuenta1, double monto,LocalDate fecha) {
			this.cuenta1 = cuenta1;
			this.monto = monto;
			this.fecha = fecha;
			hecho = false;
			deshecho = false;
	}
	protected boolean cumple() {
		return true;
	}
	public boolean hacer() {
		if((!hecho) && cumple())
		{
			cuenta1.setFondo(cuenta1.getFondo() + monto);
			hecho = true;
			return true;
		}
		return false;
	}
	public boolean deshacer() {
		if(!deshecho)
		{
			cuenta1.setFondo(cuenta1.getFondo() - monto);
			deshecho = true;
			return true;
		}
		return false;
	}
}
