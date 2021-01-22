package practica1ej1;

public class Main {

	public static void main(String[] args) {
		Reunion r1 = new Reunion("13:00", "15:00", "Programacion orientada a objetos");
		Reunion r2 = new Reunion("8:30", "11:30", "Probabilidades y Estadistica");
		int aux = (r1.compareTo(r2));
		// Si aux es mayor a 0, r1 esta antes que r2, si es menor esta despues, y sino,
		// estan en el mismo horario
		if (aux > 0)
			System.out.println("La reunion 1 comienza primero");
		else if (aux < 0)
			System.out.println("La reunion 2 comienza primero");
		else
			System.out.println("Ambas reuniones comienzan al mismo tiempo");
	}
}
