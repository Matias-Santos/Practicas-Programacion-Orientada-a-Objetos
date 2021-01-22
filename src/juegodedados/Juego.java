package juegodedados;

public class Juego {

	private Jugador j1, j2;
	private int cantturnos=0;
	private Cubilete cub;
	
	public Juego(Jugador jug1, Jugador jug2) {
		j1=jug1;
		j2=jug2;
		cub= new Cubilete();
	}
	public int getCantTurnos() {
		return cantturnos;
	}
	public void setCantTurnos(int cantTurnos) {
		this.cantturnos = cantTurnos;
	}
	public String Jugar() {
		for(int i=0; i<this.cantturnos; i++){
			if (j1.tomarTurno(cub) < j2.tomarTurno(cub))
				j2.addPuntos();
			else 
				j1.addPuntos();
		}
		return (String)(j1.ganador(j2)).getNombre();
	}
	
}
