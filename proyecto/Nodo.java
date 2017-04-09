package proyecto;


public class Nodo {
    private double costeTerrestre,costeAereo;
    private int idActual, idPadre;

    public Nodo(double g, double h, int idActual, int idPadre){
        this.costeTerrestre=g;
        this.costeAereo=h;
        this.idActual=idActual;
        this.idPadre=idPadre;

    }

    public double getCosteTerrestre() {
        return costeTerrestre;
    }

    public double getCosteAereo() {
        return costeAereo;
    }

    public int getIdActual() {
        return idActual;
    }

    public int getIdPadre() {
        return idPadre;
    }
    public double costeTotal(){
        return costeAereo+costeTerrestre;

    }
}
