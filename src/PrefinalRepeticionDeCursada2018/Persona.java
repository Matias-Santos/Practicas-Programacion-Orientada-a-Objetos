package PrefinalRepeticionDeCursada2018;

import java.time.*;

public class Persona {

	private String nombre;
	private LocalDate fechaNac;
	private double nroDoc;
	
	public Persona(String nombre, LocalDate fechaNac, double nroDoc) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.nroDoc = nroDoc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public double getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(double nroDoc) {
		this.nroDoc = nroDoc;
	}
}
