package juegodedados;

public class Main {

	public static void main(String[] args) {
		Juego play;
		Jugador j1;
		Jugador j2;
		j1 = new Jugador("Pepe");
		j2 = new Jugador("Lucia");
		play = new Juego(j1,j2);
		play.setCantTurnos(10);
		System.out.println("El ganador del juego es " + play.Jugar());
	}
}
