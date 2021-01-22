package juegodedados;

public class Dado {

	private int cara;
	final private int cantCaras=6;
	
	public int getCara() {
		return this.cara;
	}
	public void setCara(int cara) {
		this.cara=cara;
	}
	public int roll() {
		this.cara= (int)(Math.random()*cantCaras) + 1;
		return this.getCara();
	}
}