package Ejerciciodeemails;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Email a = new Email("Titulo", LocalDate.now(), "Emisor", "Texto");
		Email b = new Email("Tienes 20 nuevas notificaciones", LocalDate.of(2019, 10, 3), "Facebook", "Matias, Pepe subio una nueva foto!");
		Email c = new Email("Promociones impresionantes!!", LocalDate.of(2019, 10, 1),"Mercado Libre","Matias mira todos los descuentos que hay en nuestra pagina!!");
		Carpeta root = new Carpeta();
		Carpeta mailsGenerales = new Carpeta();
		Carpeta mailsDeRedes = new Carpeta();
		Carpeta mailsDeJuegos = new Carpeta();
		Filtro f = new FiltroT("Tienes 20 nuevas notificaciones");
		
		//SistemEmails root = new Carpeta();
		//((Carpeta)root).add(mailsGenerales);
		
		System.out.println(f.cumple(b));
		mailsGenerales.add(a);
		mailsDeRedes.add(b);
		mailsDeJuegos.add(c);
		root.add(mailsGenerales);
		root.add(mailsDeRedes);
		root.add(mailsDeJuegos);
		System.out.println(root.find(f));	
	}
}