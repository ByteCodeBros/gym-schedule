package entidades;

public abstract class Atividades {
    protected String data;
    protected int duracao;
    protected int gastoCalorico;

    public Atividades(String data, int duracao) {
        this.data = data;
        this.duracao = duracao;
    }

    public String getData() {
        return data;
    }

    public int getGastoCalorico() {
        return gastoCalorico;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return  "Data: " + data +
                ", Duracao: " + duracao + " min" +
                ", Gasto calorico: " + gastoCalorico + " cal";
    }
}
