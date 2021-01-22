package practica1ej1;

public class Persona {

	private String nombre;
	private int telefono;
	private String mail;
	
	public Persona(String nombre, int telefono, String mail) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.mail = mail;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (mail == null) {
			if (other.getMail() != null)
				return false;
		} else if (!mail.equals(other.getMail()))
			return false;
		if (nombre == null) {
			if (other.getNombre() != null)
				return false;
		} else if (!nombre.equals(other.getNombre()))
			return false;
		if (telefono != other.getTelefono())
			return false;
		return true;
	}
}
