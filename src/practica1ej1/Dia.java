package practica1ej1;

import java.util.ArrayList;
import java.util.Collections;

public class Dia {
	
	private ArrayList <Reunion> listaReuniones;
	
	public Dia() {
		listaReuniones = new ArrayList<Reunion>();
		Collections.sort(listaReuniones);
	}
	public boolean addReunion(Reunion r) {
		boolean sepuede=true;
		int i=0;
		while ((i < listaReuniones.size()) && (r.getInicio().compareTo(listaReuniones.get(i).getInicio()) < 0))
		{
			if (listaReuniones.get(i).superpuestos(r))
			sepuede=false;
			i++;
		}
		/*
		for (Reunion aux: listaReuniones)
			if (aux.superpuestos(r))
				sepuede=false;
		*/
		if (sepuede) 
		{
			this.listaReuniones.add(r);
			Collections.sort(listaReuniones);
			return true;
		}
		else 
			return false;
	}
}