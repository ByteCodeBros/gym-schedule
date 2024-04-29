package entidades;

public class Esteira extends Atividades{

    public Esteira( String data, int duracao) {
        super(data, duracao);
        this.gastoCalorico = duracao*12;
    }

    public String toString() {
        return " Esteira ( " + super.toString() + " )";
    }
}