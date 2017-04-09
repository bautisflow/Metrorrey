package proyecto;

public class Peso {
    private int peso1,peso2,peso3,peso4,peso5,peso6;

    public Peso (int peso1, int peso2, int peso3, int peso4, int peso5, int peso6){
        this.peso1=peso1;
        this.peso2=peso2;
        this.peso3=peso3;
        this.peso4=peso4;
        this.peso5=peso5;
        this.peso6=peso6;

    }

    public int getPeso1() {
        return peso1;
    }

    public int getPeso2() {
        return peso2;
    }

    public int getPeso3() {
        return peso3;
    }

    public int getPeso4() {
        return peso4;
    }

    public int getPeso5() {
        return peso5;
    }

    public int getPeso6() {
        return peso6;
    }

    public void asignarPesos(int peso0, int peso1, int peso2, int peso3, int peso4, int peso5){
        this.peso1=peso0;
        this.peso2=peso1;
        this.peso3=peso2;
        this.peso4=peso3;
        this.peso5=peso4;
        this.peso6=peso5;
    }
}
