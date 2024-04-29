package entidades;

public class Prancha extends Atividades{

    public Prancha( String data, int duracao) {
        super(data, duracao);
        this.gastoCalorico = duracao*3;
    }


    public String toString() {
        return " Prancha ( " + super.toString() + " )";
    }
}
