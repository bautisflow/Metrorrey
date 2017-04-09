package pruebas;

import net.datastructures.NodePositionList;
import proyecto.Algoritmo;
import proyecto.Estacion;
import proyecto.Metro;
import proyecto.Nodo;

import java.util.Iterator;

/**
 * Created by Jesus on 12/12/15.
 */
public class main {
    public static void main (String [] args){
        Metro m =new Metro();
        Estacion auxiliar = null;


        Algoritmo algoritmo = new Algoritmo();
        algoritmo.aEstrella(95,108);
        NodePositionList<Nodo> valor= algoritmo.getListaCerrada();
            Iterator<Nodo> it = algoritmo.getListaCerrada().iterator();
            while (it.hasNext()){
                System.out.println(m.getListaEstaciones().get(it.next().getIdActual()).getNombreEstacion());
            }


    }
}
