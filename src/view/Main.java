package view;

import servico.Gerenciador;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Gerenciador gerenciador = new Gerenciador();
        System.out.println("\nBEM-VINDO AO GERENCIADOR DE ATIVIDADES FÍSICAS\n");

        boolean loopMain = true;
        while(loopMain) {
            System.out.println("\nEscolha uma das opções a seguir:\n");

            System.out.println(
                              "1-Cadastrar perfil do usuário;\n"
                            + "2-Fazer login;\n"
                            + "3-Adicionar atividade;\n"
                            + "4-Consultar resumo diário;\n"
                            + "5-Sair\n");

            Scanner entrada = new Scanner(System.in);
            int escolhaDoUsuario = entrada.nextInt();

            switch (escolhaDoUsuario) {
                case 1 -> gerenciador.cadastrarUsuario();
                case 2 -> gerenciador.fazerLogin();
                case 3 -> gerenciador.adicionarAtividade();
                case 4 -> gerenciador.resumoDiario();
                case 5 -> loopMain = false;
                default -> System.out.println("Insira um valor válido");
            }
        }
    }
}