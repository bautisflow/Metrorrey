package proyecto;


import java.util.ArrayList;

public class Estacion {

    private int idEstacion, linea, numeroDeLineas;
    private String nombreEstacion,latitud,longitud;
    private boolean[] lineasPertenece;
    private boolean tieneTransbordo;
    private Coordenada coordenada;
    private ArrayList<Integer> pesosHijos;

    public Estacion (int id, String nombreEstacion, int linea, int numeroDeLineas, boolean tieneTransbordo,boolean[] lineasQuePertence ,String latitud,String longitud){
        this.idEstacion=id;
        this.nombreEstacion=nombreEstacion;
        this.linea=linea;
        this.numeroDeLineas=numeroDeLineas;
        this.tieneTransbordo=tieneTransbordo;
        this.lineasPertenece=lineasQuePertence;
        this.latitud=latitud;
        this.longitud=longitud;
        this.coordenada=new Coordenada(latitud,longitud);

    }

    public ArrayList<Integer> getPesosHijos() {
        return pesosHijos;
    }

    public void setPesosHijos(ArrayList<Integer> pesosHijos) {
        this.pesosHijos = pesosHijos;
    }

    public int getIdEstacion() {
        return idEstacion;
    }

    public int getLinea() {
        return linea;
    }

    public int getNumeroDeLineas() {
        return numeroDeLineas;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public boolean[] getLineasPertenece() {
        return lineasPertenece;
    }

    public boolean isTieneTransbordo() {
        return tieneTransbordo;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setTieneTransbordo(boolean tieneTransbordo) {
        this.tieneTransbordo = tieneTransbordo;
    }

    public void setLineasPertenece(boolean[] lineasPertenece) {
        this.lineasPertenece = lineasPertenece;
    }

    public void setNumeroDeLineas(int numeroDeLineas) {
        this.numeroDeLineas = numeroDeLineas;
    }
}
