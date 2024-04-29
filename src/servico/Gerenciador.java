package servico;

import entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    private Usuario usuarioLogado;
    private ArrayList<Usuario> usuarios;

    public Gerenciador() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe a altura (em centímetros): ");
        int altura = entrada.nextInt();

        System.out.println("Informe o peso (em quilogramas): ");
        float peso = entrada.nextFloat();

        System.out.println("Informe o percentual de gordura: ");
        float percentualDeGordura = entrada.nextFloat();

        Usuario usuario = new Usuario(nome, percentualDeGordura, altura, peso);
        this.usuarios.add(usuario);

        System.out.println("\nUsuário cadastrado com sucesso!\n"+usuario);
    }

    public void adicionarAtividade(){
        Scanner entrada = new Scanner(System.in);
        if (usuarios.isEmpty() || usuarioLogado == null) {
            System.out.println("Não há usuário logado");
        } else {
            System.out.println("""
                    Informe a atividade:
                    1.Bicicleta;
                    2.Esteira;
                    3.Supino;
                    4.Leg Press;
                    5.Prancha;
                    6.Barra Fixa;
                    """);

            int atividade = entrada.nextInt();
            System.out.println("Informe a data do exercício (formato DD/MM/AAAA): ");
            String data = entrada.next();
            System.out.println("Informe a duração do exercício (em minutos): ");
            int duracao = entrada.nextInt();

            switch (atividade) {
                case 1 -> {
                    Bicicleta bicicleta = new Bicicleta(data, duracao);
                    this.usuarioLogado.adicionarAtividade(bicicleta);
                }
                case 2 -> {
                    Esteira esteira = new Esteira(data, duracao);
                    this.usuarioLogado.adicionarAtividade(esteira);
                }
                case 3 -> {
                    Supino supino = new Supino(data, duracao);
                    this.usuarioLogado.adicionarAtividade(supino);
                }
                case 4 -> {
                    LegPress legpress = new LegPress(data, duracao);
                    this.usuarioLogado.adicionarAtividade(legpress);
                }
                case 5 -> {
                    Prancha prancha = new Prancha(data, duracao);
                    this.usuarioLogado.adicionarAtividade(prancha);
                }
                case 6 -> {
                    BarraFixa barrafixa = new BarraFixa(data, duracao);
                    this.usuarioLogado.adicionarAtividade(barrafixa);
                }
            }
        }
    }

    public void resumoDiario() {
        if (usuarios.isEmpty() || usuarioLogado == null) {
            System.out.println("Não há usuário logado");
        } else {
            boolean existeExercicio = false;
            int duracaoTotal = 0;
            int gastoCaloricoTotal = 0;

            System.out.println("Informe a data (formato DD/MM/AAAA):\n");
            Scanner entrada = new Scanner(System.in);


            String data = entrada.next();

            for (Atividades exercicio : this.usuarioLogado.getAtividades()) {
                if (exercicio.getData().equals(data)) {
                    existeExercicio = true;
                    break;
                }
            }

            System.out.println("Exercícios do dia: ");

            for (Atividades exercicio : this.usuarioLogado.getAtividades()) {
                if (exercicio.getData().equals(data)) {
                    gastoCaloricoTotal += exercicio.getGastoCalorico();
                    duracaoTotal += exercicio.getDuracao();
                    System.out.println(exercicio.toString());
                }
            }

            if (existeExercicio) {
                System.out.println("Resumo: \n Duração Total: " + duracaoTotal + " minutos" + "\n Gasto Calórico Total: " + gastoCaloricoTotal + " calorias\n");
            } else {
                System.out.println("Não foram praticados exercícios nesse dia\n");
            }
        }
    }

    public void fazerLogin(){
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados");
        } else {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe o usuario: ");
            int i = 1;
            for (Usuario usuario : this.usuarios) {
                System.out.println(i + "º " + usuario.toString());
                i++;
            }
            int resposta = entrada.nextInt();
            Usuario usuarioEscolhido = usuarios.get(resposta - 1);
            this.usuarioLogado = usuarioEscolhido;
        }
    }
}