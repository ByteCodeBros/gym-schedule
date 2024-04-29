package entidades;

public class BarraFixa extends Atividades{

    public BarraFixa( String data, int duracao) {
        super(data, duracao);
        this.gastoCalorico = duracao*10;
    }

    public String toString() {
        return " Barra fixa ( " + super.toString() + " )";
    }
}
