package juegodedados;

public class DadoCargado extends Dado{
	private final int ladoCargado=6;
	
	public int roll() {
		if (Math.random()< (0.5))
			setCara(ladoCargado);
		else
			super.roll();
		return getCara();
	}
}
  