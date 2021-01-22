package PrefinalRepeticionDeCursada2018;

import java.util.*;

public class SistemaBancario {

	protected ArrayList<Cliente> clientes;
	
	public SistemaBancario() {
		this.clientes = new ArrayList<Cliente>();
	}
	public boolean addCliente(Cliente c) {
		if (!this.clientes.contains(c))
		{
			this.clientes.add(c);
			return true;
		}
		return false;
	}
	public boolean addCuenta(Cliente c, Cuenta cu) {
		int aux = this.clientes.indexOf(c);
		if (aux != -1)
		{
			Cliente caux = this.clientes.get(aux);
			caux.addCuenta(cu);
			return true;
		}
		return false;
	}
	public boolean addTransaccion(Cliente c, Cuenta cu, Transaccion t) {
		int aux = this.clientes.indexOf(c);
		if (aux != -1)
		{
			Cliente caux = this.clientes.get(aux);
			caux.addTransaccion(cu,t);
			return true;
		}
		return false;
	}
}
