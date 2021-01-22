package practica2ej1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Persona p;
		p = new Persona(40020179, "Matias", "Santos", LocalDate.of(1997, 6, 12));
		p.setSexo("Masculino");
		p.setPeso(78.5);
		p.setAltura(1.65);
		System.out.println(p.toString());
		if (p.cumpleanios())
			System.out.println(p.getNombre() + " cumple años hoy");
		else 
			System.out.println(p.getNombre() + " no cumple años hoy");
	}
}
