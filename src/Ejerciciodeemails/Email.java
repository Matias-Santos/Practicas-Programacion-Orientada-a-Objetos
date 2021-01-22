package Ejerciciodeemails;

import java.time.LocalDate;
import java.util.ArrayList;

public class Email extends SistemaEmails {
	private String titulo;
	private LocalDate fecha;
	private String emisor;
	private String texto;

	public Email(String titulo, LocalDate fecha, String emisor, String texto) {
		this.titulo = titulo;
		this.fecha = fecha;
		this.emisor = emisor;
		this.texto = texto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public ArrayList<SistemaEmails> find(Filtro f) {
		ArrayList<SistemaEmails> aux = new ArrayList<SistemaEmails>();
		if (f.cumple(this))
			aux.add(this);
		return aux;
	}
}