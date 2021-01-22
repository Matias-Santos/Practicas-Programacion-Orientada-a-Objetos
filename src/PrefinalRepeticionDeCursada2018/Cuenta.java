package PrefinalRepeticionDeCursada2018;

import java.util.*;
public class Cuenta {

	private double fondo;
	private double nroCuenta;
	private double fondoDescubierto;
	private double porcentaje;
	private ArrayList<Transaccion> transacciones;
	
	public Cuenta(double fondo, double nroCuenta, double fondoDescubierto, double porcentaje) {
		this.fondo = fondo;
		this.nroCuenta = nroCuenta;
		this.fondoDescubierto = fondoDescubierto;
		this.porcentaje = porcentaje;
		this.transacciones = new ArrayList<Transaccion>();
	}
	public double getFondo() {
		return fondo;
	}
	public void setFondo(double fondo) {
		this.fondo = fondo;
	}
	public double getFondoDescubierto() {
		return fondoDescubierto;
	}
	public void setFondoDescubierto(double fondoDescubierto) {
		this.fondoDescubierto = fondoDescubierto;
	}
	public double getNroCuenta() {
		return nroCuenta;
	}
	public ArrayList<Transaccion> getTransaccioneso() {
		return this.transacciones;
	}
	public void monthyInc() {
		this.fondo *= this.porcentaje;
	}
	public boolean addTransaccion(Transaccion t) {
		if (t.hacer())
		{
			this.transacciones.add(t);
			return true;
		}
		return false;
	}
}
