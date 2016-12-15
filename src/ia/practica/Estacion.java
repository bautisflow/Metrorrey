package ia.practica;

public class Estacion {
	
	private int id;
	private String nombre;
	private boolean abierta;
	private Coordenada coordenada;
	private int lineas[];
	
	public Estacion(int id, String nombre, boolean abierta, double lat, double lon, int[] lineas) {
		this.id = id;
		this.nombre = nombre;
		this.coordenada = new Coordenada(lat, lon);
		this.lineas = lineas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	public boolean equals(Estacion e) {
		return nombre.equals(e.nombre);
	}
	
	public String toString() {
		return nombre;
	}
	
	public double distancia(Estacion e) {
		return coordenada.distancia(e.coordenada);
	}
	
	public int sizeLineas() {
		return lineas.length;
	}

	public int[] getLineas() {
		return lineas;
	}
	
}
