package entidades;

public class Bicicleta extends Atividades{

    public Bicicleta( String data, int duracao) {
        super(data, duracao);
        this.gastoCalorico = duracao*5;
    }

    public String toString() {
        return " Bicicleta ( " + super.toString() + " )";
    }
}