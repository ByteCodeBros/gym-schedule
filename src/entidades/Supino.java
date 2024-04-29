package entidades;

public class Supino extends Atividades{

    public Supino( String data, int duracao) {
        super(data, duracao);
        this.gastoCalorico = duracao*7;
    }

    public String toString() {
        return " Supino ( " + super.toString() + " )";
    }
}
