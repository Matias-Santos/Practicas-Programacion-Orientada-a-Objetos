package practica2ej1;

import java.time.LocalDate;

public class Persona{

	private int dni;
	private LocalDate fechaNac = LocalDate.of(2001,01,01);
	private String sexo = "Femenino";
	private String nombre = "N";
	private String apellido = "N";
	private double peso = 1;
	private double altura = 1;
	private final double minimo = 18.5;
	private final double maximo = 25;

	public Persona(int dni) {
		this.dni = dni;
	}
	public Persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(int dni, String nombre, String apellido, LocalDate fechaNac) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
	}
	public double indiceDeMasaCorporal() {
		return (this.peso/(this.altura*this.altura));
	}
	public int getDni() {
		return dni;
	}
	public String getFechaNac() {
		return fechaNac.toString();
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", fechaNac=" + fechaNac + ", sexo=" + sexo + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", peso=" + peso + ", altura=" + altura + "]";
	}
	public boolean enForma() {
		double aux=indiceDeMasaCorporal();
		if ( (minimo <= aux) && (aux <= maximo) )
			return true;
		else 
			return false;
	} 
	public boolean cumpleanios() {
		LocalDate now = LocalDate.now();  
		if (this.fechaNac.equals(now))
			return true;
		else
			return false;
	}
}
