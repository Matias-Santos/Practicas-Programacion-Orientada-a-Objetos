package practica3ej2;

public class Cuadrilatero extends Poligono{

	private Punto p1,p2,p3,p4;
	
	public Cuadrilatero(Punto p1, Punto p2, Punto p3, Punto p4) {
		//Puntos ingresados en sentido horario, comenzando con el de menor valor en y
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public Punto getP3() {
		return p3;
	}
	public void setP3(Punto p3) {
		this.p3 = p3;
	}
	public Punto getP4() {
		return p4;
	}
	public void setP4(Punto p4) {
		this.p4 = p4;
	}
}
