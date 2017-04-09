package proyecto;


import net.datastructures.NodePositionList;
import net.datastructures.SortedListAdaptablePriorityQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Algoritmo {
    private ArrayList<String> recorrido;
    private int idOrigen, iDestino, idPadre;
    private Metro metro;
    private SortedListAdaptablePriorityQueue<Double,Nodo> listaAbierta;
    private NodePositionList<Nodo> listaCerrada;
    private HashMap<Integer,Estacion> listaEstaciones;
    private HashMap<Integer,Peso>listaPesos;
    private int idActual;
    private final int VELOCIDAD = 1000; // 59 2/2 kph;
    private double tiempoRecorrido;
    private double g;

    private String error;


    public Algoritmo(){
        recorrido= new ArrayList<String>();
        metro=new Metro();
        tiempoRecorrido=0;
        listaAbierta=new SortedListAdaptablePriorityQueue<Double,Nodo>();
        listaCerrada=new NodePositionList<Nodo>();
        listaEstaciones=metro.getListaEstaciones();
        listaPesos=metro.getListaPesos();
        error="";
        g=0;
    }

    public void aEstrella(int idOrigen, int idDestino){
        Nodo origen = new Nodo(0,costeAereo(idOrigen,idDestino),idOrigen,-1);
        listaAbierta.insert(origen.costeTotal(), origen);
        boolean condicionSalida = false;
        while (!listaAbierta.isEmpty() && !condicionSalida){
            Nodo actual = listaAbierta.min().getValue();
            //listaCerrada.addLast(actual);
            if (actual.getIdActual()==idDestino){
                //recorrido.add(metro.getListaEstaciones().get(origen.getIdActual()).getNombreEstacion());
                condicionSalida=true;
            }

            ArrayList<Integer> hijos= obtenerHijos(actual.getIdActual());
            idPadre=actual.getIdActual();

            Nodo padre = actual;

            for (int i =0; i<hijos.size();i++){
                int idHijo= hijos.get(i);
                if (obtenerG(idHijo,i)==0){
                    continue;
                }
                if (idHijo==idDestino){
                    listaCerrada.addLast(listaAbierta.min().getValue());
                    listaAbierta.removeMin();
                    condicionSalida=true;
                }
                Nodo hijo = new Nodo(padre.getCosteTerrestre()+obtenerG(idHijo,i),costeAereo(idHijo,idDestino),idHijo,idPadre);

                if (estaEnAbierta(hijo)){
                    listaAbierta.insert(hijo.costeTotal(), hijo);
                }
                if (estaEnCerrada(hijo)){
                    listaCerrada.addLast(hijo);
                }

            }
            listaCerrada.addLast(listaAbierta.min().getValue());
            listaAbierta.removeMin();
        }
    }

    public Double recorrer(int origen, int destino) {
        metro = new Metro();
        Nodo auxiliar;
        int estacionActual = origen;
        auxiliar = new Nodo(0, costeAereo(origen, destino), origen, -1);
        listaAbierta.insert(auxiliar.getCosteAereo(), auxiliar); // -1 por ser raiz
        estacionActual = origen;
        boolean condicion = true;
        while ((estacionActual != destino)&&condicion){
            ArrayList<Integer> hijos= obtenerHijos(estacionActual);
            int idPadre= estacionActual;
            for (int i = 0; i < hijos.size(); i++) { // Buscamos los hijos del primero de la lista abierta
             estacionActual= hijos.get(i);

                if ((hijos.get(i) > 0) && Analizar(estacionActual)) {
                    auxiliar = new Nodo((obtenerG(idPadre,i) + listaAbierta.min().getValue().getCosteTerrestre()), costeAereo(estacionActual, destino), estacionActual, idPadre);
                    if(buscarAbierta(auxiliar.costeTotal(), i)){
                        listaAbierta.insert(auxiliar.costeTotal(),
                                auxiliar);
                    }
                    if(buscarCerrada(auxiliar)){
                        listaCerrada.addLast(auxiliar);
                    }
                }
            }
            // Introducimos LA CAJA en la lista cerrada
            listaCerrada.addLast(listaAbierta.min().getValue());
            listaAbierta.removeMin(); // La borramos
            if (listaAbierta.isEmpty()){
                condicion=false;
            }
            estacionActual = listaAbierta.min().getValue().getIdActual(); // Y tal
        }
        //return listaAbierta.min().getKey();
        return listaAbierta.min().getKey();
    }

    public boolean buscarAbierta(double a, int i){
        boolean resultado = true;
        SortedListAdaptablePriorityQueue<Double, Nodo> aux = new SortedListAdaptablePriorityQueue<Double, Nodo>();

        while(!listaAbierta.isEmpty()&&listaAbierta.min().getValue().getIdActual()!=i){
            aux.insert(listaAbierta.min().getKey(), listaAbierta.min().getValue());
            listaAbierta.removeMin();
        }
        if(!listaAbierta.isEmpty()){
            if(listaAbierta.min().getKey() > a){
                listaAbierta.removeMin();
            }
            else
                resultado = false;
        }
        while(!aux.isEmpty()){
            listaAbierta.insert(aux.min().getKey(), aux.min().getValue());
            aux.removeMin();
        }
        return resultado;
    }

    public boolean buscarCerrada(Nodo nodo){
        boolean resultado = true;
        NodePositionList<Nodo> aux = new NodePositionList<Nodo>();

        while(!listaCerrada.isEmpty() &&listaCerrada.last().element().getIdActual()!= nodo.getIdActual()) {
            aux.addLast(listaCerrada.last().element());
            listaCerrada.remove(listaCerrada.last());
        }
        if(!listaCerrada.isEmpty()){
            if(listaCerrada.last().element().costeTotal() > nodo.costeTotal()){
                listaCerrada.remove(listaCerrada.last());
            }
            else
                resultado = false;
        }
        while(!aux.isEmpty()){
            listaCerrada.addLast(aux.last().element());
            aux.remove(aux.last());
        }
        return resultado;
    }


    public boolean estaEnAbierta(Nodo nodo){
        boolean resultado = true;
        SortedListAdaptablePriorityQueue<Double, Nodo> aux = new SortedListAdaptablePriorityQueue<Double, Nodo>();

        while(!listaAbierta.isEmpty()&&listaAbierta.min().getValue().getIdActual()!=nodo.getIdActual()){
            aux.insert(listaAbierta.min().getKey(), listaAbierta.min().getValue());
            listaAbierta.removeMin();
        }
        if(!listaAbierta.isEmpty()){
            if(listaAbierta.min().getKey() > nodo.costeTotal()){
                listaAbierta.removeMin();
            }
            else
                resultado = false;
        }
        while(!aux.isEmpty()){
            listaAbierta.insert(aux.min().getKey(), aux.min().getValue());
            aux.removeMin();
        }
        return resultado;
    }


    public boolean estaEnCerrada(Nodo nodo){
        boolean resultado=false;
        NodePositionList<Nodo> listaAuxiliar=new NodePositionList<Nodo>();
        while (!listaCerrada.isEmpty()){
            listaAuxiliar.addLast(listaCerrada.last().element());
            listaCerrada.remove(listaCerrada.last());
        }
        while (!listaAuxiliar.isEmpty()){

            if (listaAuxiliar.last().element().getIdActual()==nodo.getIdActual()){
                if(listaAuxiliar.last().element().costeTotal()>nodo.costeTotal()) {
                    resultado = true;
                }
            }
           listaCerrada.addLast(listaAuxiliar.last().element());
            listaAuxiliar.remove(listaAuxiliar.last());

        }
        return resultado;
    }

    public double costeAereo(int idOrigen, int idDestino){
        double resultado=0;

        double latitudOrigen = listaEstaciones.get(idOrigen).getCoordenada().deegreToDecimalLat();
        double latitudDestino = listaEstaciones.get(idDestino).getCoordenada().deegreToDecimalLat();
        double longitudOrigen = listaEstaciones.get(idOrigen).getCoordenada().deegreToDecimalLon();
        double longitudDestino = listaEstaciones.get(idDestino).getCoordenada().deegreToDecimalLon();

        double R = 6372800, fi1 = Math.toRadians(latitudOrigen), fi2 = Math.toRadians(latitudDestino);
        double deltaFi = Math.toRadians(latitudDestino - latitudOrigen);
        double deltaLambda = Math.toRadians(longitudDestino - longitudOrigen);

        double ca =  2 * Math.asin(Math.sqrt(Math.pow(Math.sin(deltaFi/2),2) + Math.pow(Math.sin(deltaLambda/2),2) * Math.cos(fi1) * Math.cos(fi2)));
        resultado= R * ca;
        resultado=resultado/VELOCIDAD;
        return resultado;
    }
    public ArrayList<Integer> obtenerHijos (int id){
        ArrayList<Integer> arrayId=new ArrayList<>();
        arrayId=metro.obternerHijos(id);
        return arrayId;

    }

//    public double relacion(int idPadre, int idHijo){
//        double resultado=0;
//        if((idPadre-idHijo == -1)||(idPadre-idHijo == 1)){
//            if (idHijo%2==0){
//                resultado=2;
//            }else
//                resultado=1;
//        }else{
//            resultado= metro.TRANSBORDO; //Se ha realizado un transbordo!
//        }
//        return resultado;
//    }
    public int obtenerG(int id, int posicion){
        Metro m = new Metro();

        int resultado = 0;
        switch (posicion){
            case 0:
                resultado=m.getListaPesos().get(id).getPeso1();
                break;
            case 1:
                resultado=listaPesos.get(id).getPeso2();
                break;
            case 2:
                resultado=listaPesos.get(id).getPeso3();
                break;
            case 3:
                resultado=listaPesos.get(id).getPeso4();
                break;
            case 4:
                resultado=listaPesos.get(id).getPeso5();
                break;
            case 5:
                resultado=listaPesos.get(id).getPeso6();
                break;

        }
        return resultado;
    }

    public void borrarOcurrenciasAbierta(Nodo n){
        SortedListAdaptablePriorityQueue<Double,Nodo> aux = new SortedListAdaptablePriorityQueue<Double,Nodo>();
        Nodo nodo_aux = null;
        while (!listaAbierta.isEmpty()){
            aux.insert(listaAbierta.min().getKey(),listaAbierta.min().getValue());
            listaAbierta.removeMin();
        }
        while (!aux.isEmpty()){
            nodo_aux=aux.min().getValue();
            if (nodo_aux.getIdActual()==n.getIdActual()){
                aux.removeMin();
                continue;
            }else {
                listaAbierta.insert(nodo_aux.costeTotal(),nodo_aux);
                aux.removeMin();
            }
        }

    }
    public void borrarOcurrenciasCerrada(Nodo n){

        NodePositionList<Nodo> aux = new NodePositionList<Nodo>();
        Nodo nodo_aux = null;
        while (!listaCerrada.isEmpty()){
           nodo_aux= listaCerrada.last().element();
            aux.addLast(nodo_aux);
            listaCerrada.remove(listaCerrada.last());
        }
        while (!aux.isEmpty()){
            nodo_aux=aux.last().element();
            if (nodo_aux.getIdActual()==n.getIdActual()){
                aux.remove(aux.last());
                continue;
            }else {
                listaCerrada.addLast(nodo_aux);
                aux.remove(aux.last());
            }
        }

    }
    public boolean necesarioAnalizar(int i) {
        boolean res = true;
        if (!listaCerrada.isEmpty()) {
            Iterator<Nodo> it = listaCerrada.iterator();
            while (it.hasNext()) {
                if (it.next().getIdActual() == i) {
                    res = false;
                }
            }
        }
        return res;
    }

    public NodePositionList<Nodo> getListaCerrada() {
        return listaCerrada;
    }
    public boolean Analizar(int i) {
        boolean res = true;
        if (!listaCerrada.isEmpty()) {
            Iterator<Nodo> it = listaCerrada.iterator();
            while (it.hasNext()) {
                if (it.next().getIdActual() == i) {
                    res = false;
                }
            }
        }
        return res;
    }
}
