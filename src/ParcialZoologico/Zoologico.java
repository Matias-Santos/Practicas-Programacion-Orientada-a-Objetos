package ParcialZoologico;

import java.util.*;

public class Zoologico {
	ArrayList<Jaula> jaulas;
	
	public Zoologico() {
		this.jaulas = new ArrayList<Jaula>();
	}
	public boolean addJaula(Jaula j) {
		if(this.jaulas.contains(j))
			return false;
		else
			this.jaulas.add(j);
		return true;
	}
	public ArrayList<Animal> buscarAnimalesPorAltura(float x) {
		ArrayList<Animal> aux = new ArrayList<Animal>();
		for (Jaula j : jaulas)
			if (((float)((((Animal)(j.getAtt("animal"))).getAtt("altura")))) > x)
				aux.add((Animal)(j.getAtt("animal")));
		return aux;
	}
}
