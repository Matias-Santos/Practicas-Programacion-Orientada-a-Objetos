package PrefinalRepeticionDeCursada2018;

import java.util.*;

public class Cliente {
	
	private Persona p;
	private ArrayList<Cuenta> cuentas;
	
	public Cliente(Persona p) {
		this.p = p;
		this.cuentas = new ArrayList<Cuenta>();
	}
	public Persona getPersona() {
		return p;
	}
	public boolean addCuenta(Cuenta c) {
		if (!this.cuentas.contains(c))
		{
			this.cuentas.add(c);
			return true;
		}
		return false;
	}
	public boolean addTransaccion(Cuenta cu, Transaccion t) {
		int aux = this.cuentas.indexOf(cu);
		if (aux != -1)
		{
			Cuenta caux = this.cuentas.get(aux);
			caux.addTransaccion(t);
			return true;
		}
		return false;
	}
}
