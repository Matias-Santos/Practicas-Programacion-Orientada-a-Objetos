package Ejerciciodeemails;

import java.util.ArrayList;

public class Carpeta extends SistemaEmails {

	private ArrayList<SistemaEmails> l;
	
	public Carpeta() {
		l = new ArrayList<SistemaEmails>();
	}
	
	public ArrayList<SistemaEmails> add(SistemaEmails s) {
		l.add(s);
		return l;
	}

	public ArrayList<SistemaEmails> find(Filtro f) {
		ArrayList<SistemaEmails> aux = new ArrayList<SistemaEmails>();
		for (SistemaEmails c : l)
			aux.addAll(c.find(f));
		return aux;
	}
}