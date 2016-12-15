package ia.practica;

import java.util.LinkedList;
import java.util.List;

public class Algoritmo {
	
	private List<Nodo> Abierta;
	private List<Nodo> Cerrada;
	private Metro metro;
	private int lineaActual;
	private static final int TRANSBORDO = 300;
	
	public Algoritmo(Metro metro) {
		Abierta = new LinkedList<Nodo>();
		Cerrada = new LinkedList<Nodo>();
		this.metro = metro;
	}
	
	public List<Estacion> AestrellaConT(Estacion origen, Estacion destino) {
		// Si el origen y el destino son el mismo
		if (origen.equals(destino)) return getRuta(new Nodo(origen));
		// Establecemos la linea actual 
		if (origen.sizeLineas() == 1) lineaActual = origen.getLineas()[0]; // si origen solo tiene una linea partimos de esa
		else { // Si no, vemos si origen y destino tienen una línea en común
			for (int lo : origen.getLineas())
				for (int ld : origen.getLineas())
					if (lo == ld) lineaActual = lo;
			// Si la linea actual sigue siendo null
			if (lineaActual == 0) lineaActual = origen.getLineas()[0]; // cogemos cualquiera
 		}
		
		// añadimos el nodo origen a la lista abierta
		Abierta.add(new Nodo(origen));
		
		// mientras que la lista abierta no este vacia
		while(!Abierta.isEmpty()) {
			// Lista donde se almacenan nodos hijos
			List<Nodo> hijos = new LinkedList<Nodo>();
			// Nodo auxiliar
			Nodo aux = null;
			// buscamos el nodo con menor f en la lista abierta
			for(Nodo n : Abierta)
				if (aux == null || n.getF() < aux.getF())
					aux = n;
			// Sacar el nodo de la lista abierta
			Abierta.remove(Abierta.indexOf(aux));
			// Actualizamos la linea en la que nos encontramos
			if (aux.getEstacion().sizeLineas()== 1) lineaActual = aux.getEstacion().getLineas()[0];
			// Generamos sus nodos hijos y ponemos que su nodo padre es q
			// Los guardamos en la lista hijos
			for (Estacion e : metro.getVecinos(aux.getEstacion().getId())) 
				hijos.add(new Nodo(e, aux));
			
			// Para cada hijo
			for (Nodo n : hijos) {

				// Actualizamos g, h y f de cada nodo hijo
				// Si hay transbordo lo sumamos
				if (n.getEstacion().sizeLineas() == 1 && n.getEstacion().getLineas()[0] != lineaActual)
					n.setG(aux.getG() + aux.getEstacion().distancia(n.getEstacion()) + TRANSBORDO );
				else n.setG(aux.getG() + aux.getEstacion().distancia(n.getEstacion()));
				n.setH(n.getEstacion().distancia(destino));
				n.setF(n.getG() + n.getH());
				
				// si el nodo es el destino, se para la búsqueda
				if (n.getEstacion().equals(destino))
					return getRuta(n);
				
				// Si ya hay un nodo en la lista abierta igual pero con f menor no hacemos nada
				if (Abierta.contains(n) && Abierta.get(Abierta.indexOf(n)).getF() < n.getF())
					;
				//  EOC si ya hay un nodo en la lista cerrada con f menor no hacemos nada
				else if (Cerrada.contains(n) && Cerrada.get(Cerrada.indexOf(n)).getF() < n.getF())
					;
				// EOC añadimos el nodo a la lista abierta
				else Abierta.add(n);
			}
			// Añadimos el nodo a la lista cerrada
			Cerrada.add(aux);
			
		}
		return new LinkedList<Estacion>(); // Lista vacia
	}

	public List<Estacion> AestrellaSinT(Estacion origen, Estacion destino) {
		// Si el origen y el destino son el mismo
		if (origen.equals(destino)) return getRuta(new Nodo(origen));
		// añadimos el nodo origen a la lista abierta
		Abierta.add(new Nodo(origen));
		
		// mientras que la lista abierta no este vacia
		while(!Abierta.isEmpty()) {
			// Lista donde se almacenan nodos hijos
			List<Nodo> hijos = new LinkedList<Nodo>();
			// Nodo auxiliar
			Nodo aux = null;
			// buscamos el nodo con menor f en la lista abierta
			for(Nodo n : Abierta)
				if (aux == null || n.getF() < aux.getF())
					aux = n;
			// Sacar el nodo de la lista abierta
			Abierta.remove(Abierta.indexOf(aux));
			// Generamos sus nodos hijos y ponemos que su nodo padre es q
			// Los guardamos en la lista hijos
			for (Estacion e : metro.getVecinos(aux.getEstacion().getId())) 
				hijos.add(new Nodo(e, aux));
			
			// Para cada hijo
			for (Nodo n : hijos) {

				// actualizamos g, h y f de cada nodo hijo
				n.setG(aux.getG() + aux.getEstacion().distancia(n.getEstacion()));
				n.setH(n.getEstacion().distancia(destino));
				n.setF(n.getG() + n.getH());
				
				// si el nodo es el destino, se para la búsqueda
				if (n.getEstacion().equals(destino))
					return getRuta(n);
				
				// Si ya hay un nodo en la lista abierta igual pero con f menor no hacemos nada
				if (Abierta.contains(n) && Abierta.get(Abierta.indexOf(n)).getF() < n.getF())
					;
				//  EOC si ya hay un nodo en la lista cerrada con f menor no hacemos nada
				else if (Cerrada.contains(n) && Cerrada.get(Cerrada.indexOf(n)).getF() < n.getF())
					;
				// EOC añadimos el nodo a la lista abierta
				else Abierta.add(n);
			}
			// Añadimos el nodo a la lista cerrada
			Cerrada.add(aux);
			
		}
		return new LinkedList<Estacion>(); // Lista vacia
	}
	
	private List<Estacion> getRuta(Nodo n) {
		LinkedList<Estacion> ruta = new LinkedList<Estacion>();
		Nodo nodo = n;
		while (nodo.hasPadre()) {
			ruta.addFirst(nodo.getEstacion());
			nodo = nodo.getPadre();
		}
		ruta.addFirst(nodo.getEstacion());
		return ruta;
	}

}
