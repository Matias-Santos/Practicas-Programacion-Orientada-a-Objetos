package juegodedados;

public class Cubilete {

	private Dado dado1, dado2;
	
	public Cubilete() {
		dado1= new Dado();
		dado2= new DadoCargado();
	}
	public void roll() {
		this.dado1.roll();
		this.dado2.roll();
	}
	public int getValor() {
		return this.dado1.getCara() + this.dado2.getCara();
	}
}