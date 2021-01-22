package ParcialZoologico;

import java.util.*;
public class Animal {
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
	public boolean equals(Animal obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (Att == null) {
			if (other.Att != null)
				return false;
		} else if (!Att.equals(other.Att))
			return false;
		return true;
	}
}
