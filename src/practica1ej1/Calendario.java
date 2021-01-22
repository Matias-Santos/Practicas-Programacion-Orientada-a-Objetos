package practica1ej1;

public class Calendario {

	private Dia arregloDias[];
	
	public Calendario(int cantDias)
	{
		this.arregloDias= new Dia[cantDias];
	}
	public boolean addReunion(int dia, Reunion r)
	{
		if (arregloDias[dia].addReunion(r))
			return true;
		else
			return false;
	}
}