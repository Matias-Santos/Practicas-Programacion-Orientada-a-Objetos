package practica1ej1;

import java.util.ArrayList;

public class Reunion implements Comparable<Reunion> {
	
	private ArrayList <Persona> listaAsistentes;
	private String inicio;
	private String fin;
	private String tema;
	
	public Reunion(String inicio, String fin, String tema) {
		this.inicio = inicio;
		this.fin = fin;
		this.tema = tema;
		this.listaAsistentes = new ArrayList<Persona>();
	}
	public Reunion(String inicio, String fin, ArrayList<Persona> listaAsistentes) {
		this.inicio = inicio;
		this.fin = fin;
		this.listaAsistentes = listaAsistentes;
	}
	public ArrayList<Persona> getListaAsistentes() {
		return listaAsistentes;
	}
	public String getInicio() {
		return inicio;
	}
	public String getFin() {
		return fin;
	}
	public String getTema() {
		return tema;
	}
	public boolean agregarAsistente(Persona asistente) {
		if (!(listaAsistentes.contains(asistente)))
		{
			listaAsistentes.add(asistente);
			return true;
		}
		else
			return false;
	}
	public ArrayList<Persona> getAsistentes() {
		return listaAsistentes;
	}
	public boolean superpuestos(Reunion o) {
		if ((o.getInicio().compareTo(this.inicio) <= 0) && (this.inicio.compareTo(o.getFin()) <= 0))
			return true;
		else
			if (((o.getInicio().compareTo(this.fin)) <= 0) && ((this.fin.compareTo(o.getFin())) <= 0))
				return true;
			else
				return false;
	}
	@Override
	public int compareTo(Reunion o) {
		return (this.inicio.compareTo(o.getInicio()));
	}
	
}
