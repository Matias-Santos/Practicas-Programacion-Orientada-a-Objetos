package juegodedados;

public class Jugador {

	private int puntos;
	private String nombre;
	
	public Jugador(String n) {
		this.nombre=n;
	}
	public int getPuntos() {
		return this.puntos;
	}
	public void setPuntos(int p) {
		this.puntos=p;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public void addPuntos() {
		this.puntos++;
	}
	public int tomarTurno(Cubilete cub) {
		cub.roll();
		return  cub.getValor();
	}
	public Jugador ganador(Jugador j1) {
		if ((this.puntos) < (j1.getPuntos()))
			return j1;
		else
			if ((this.puntos) > (j1.getPuntos()))
				return this;
			else
				return new Jugador("empate");
	}
}