package entidades;

import java.util.ArrayList;

public class Usuario {
    private ArrayList<Atividades> atividades;

    private String nome;
    private float percentualDeGordura;
    private float alturaCentimetros;
    private float pesoKg;

    public Usuario(String nome, float percentualDeGordura, float alturaCentimetros, float pesoKg) {
        this.atividades = new ArrayList<>();
        this.nome = nome;
        this.percentualDeGordura = percentualDeGordura;
        this.alturaCentimetros = alturaCentimetros;
        this.pesoKg = pesoKg;
    }

    public ArrayList<Atividades> getAtividades() {
        return atividades;
    }

    public void adicionarAtividade(Atividades atividade){
        this.atividades.add(atividade);
    }

    @Override
    public String toString() {
        return "Usuário - " + nome + " (" +
                " Percentual de gordura: " + percentualDeGordura + "%"+
                ", Altura: " + alturaCentimetros + " cm" +
                ", Peso: " + pesoKg + " kg )";
    }
}
