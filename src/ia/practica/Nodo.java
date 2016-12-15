package ia.practica;

public class Nodo {
	
	private Nodo padre;
	private Estacion e;
	double f, g, h;
	
	public Nodo(Estacion e) {
		this.e = e;
		this.f = 0;
		this.g = 0;
		this.h = 0;
	}
	
	public Nodo(Estacion e, Nodo padre) {
		this.e = e;
		this.padre = padre;
		this.f = 0;
		this.g = 0;
		this.h = 0;
	}
	
	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	
	public Estacion getEstacion() {
		return e;
	}
	
	public boolean equals(Nodo n) {
		return (e.equals(n.e));
	}

	public Nodo getPadre() {
		return padre;
	}

	public void setPadre(Nodo padre) {
		this.padre = padre;
	}
	
	public boolean hasPadre() {
		return padre != null;
	}
	
	public String toString() {
		return e.toString();
	}

}
