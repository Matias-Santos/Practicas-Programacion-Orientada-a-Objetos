package ParcialZoologico;

import java.util.*;

public class Jaula {
	Hashtable<String,Object> Att;
		
	public boolean setAtt(String att, Object o) {
		boolean aux=false;
		if (Att.containsKey((att.toLowerCase()))) {
			Att.remove((att.toLowerCase()));
			aux=true;
		}
		Att.put((att.toLowerCase()), o);
		return aux;
	}
	public Object getAtt(String att) {
		return Att.get((att.toLowerCase()));
	}
	public Enumeration<String> getKeys() {
		return Att.keys();
	}
	public boolean equals(Jaula obj) {
		boolean aux = true;
		Enumeration<String> atributos = getKeys();
		for (Enumeration<String> aux2 : atributos)
	}
}
