package entidades;

public class LegPress extends Atividades{

    public LegPress( String data, int duracao) {
        super(data, duracao);
        this.gastoCalorico = duracao*8;
    }

    public String toString() {
        return " Leg press ( " + super.toString() + " )";
    }
}
