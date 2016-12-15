package ia.practica;

import java.util.List;
import java.util.LinkedList;

public class Metro {
	
	private final int V; // Vertix
	private int E; // Edges
	private List<Estacion> estaciones;
	
	// Cada posición del array corresponde a cada estacion
	// que contiene un Set con las estaciones a las que está conectada
	private List<Estacion>[] grafo;
	

	@SuppressWarnings("unchecked")
	public Metro(int V) {

		this.V = V;
		this.E = -1;
		this.grafo = (List<Estacion>[]) new List<?>[V];
		for (int i = 0; i < V; i++) 
			grafo[i] = new LinkedList<Estacion>();
		
		estaciones = new LinkedList<Estacion>();

	}
	
	public void addVecinos(Estacion e,Estacion[] vecinos) {
		estaciones.add(e);
		for (int i = 0; i < vecinos.length; i++) {
			grafo[e.getId()].add(vecinos[i]);
		}
		E++;
	}
	
	// Devuelve el grado de la estación
	public int grado(Estacion e){
		return grafo[e.getId()].size();
	}
	
	public List<Estacion> getVecinos(int id) {
		return grafo[id];
	}

	public int getV() {
		return V;
	}

	public int getE() {
		return E;
	}
	
	public Estacion getEstacion(int index) {
		return estaciones.get(index);
	}

}
