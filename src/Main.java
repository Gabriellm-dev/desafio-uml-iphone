import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Iphone iphone = new Iphone();

        int opc;
        System.out.println("----------------------------------\n"
                + "Seja bem vindo ao menu do IPHONE.\n"
                + "----------------------------------\n"
                + "Opções do menu.\n"
                + " 1 - Telefone.\n"
                + " 2 - Músicas.\n"
                + " 3 - Navegador.\n"
                + " 0 - Desligar.\n"
                + "----------------------------------");


        opc = sc.nextInt();

        switch (opc) {
            case 0:
                System.out.println("Foi otimo ter você por aqui, até a próxima - Desligando...");
                return;

            case 1:
                AparelhoTelefonico telefonico = iphone;

                System.out.println("O que você deseja fazer ?\n"
                        + " 1 - Ligar.\n"
                        + " 2 - Atender.\n"
                        + " 3 - Iniciar Correio de Voz.\n"
                        + "----------------------------------");
                int opcTelefone = sc.nextInt();
                if (opcTelefone == 1) {
                    telefonico.ligar();
                } else if (opcTelefone == 2) {
                    telefonico.atender();
                } else if (opcTelefone == 3) {
                    telefonico.iniciarCorreioVoz();
                }
                break;
            case 2:
                ReprodutorMusical musicas = iphone;

                System.out.println("O que você deseja fazer ?\n"
                        + " 1 - Tocar.\n"
                        + " 2 - Pausar.\n"
                        + " 3 - Selecionar Musica.\n"
                        + "----------------------------------");
                int opcMusica = sc.nextInt();
                if (opcMusica == 1) {
                    musicas.tocar();
                } else if (opcMusica == 2) {
                    musicas.pausar();
                } else if (opcMusica == 3) {
                    musicas.selecionarMusica();
                }
            break;
            case 3:
                NavegadorInternet navegadorInternet = iphone;

                System.out.println("O que você deseja fazer ?\n"
                        + " 1 - Exibir Pagina.\n"
                        + " 2 - Adicionar nova Aba.\n"
                        + " 3 - atualizarPagina.\n"
                        + "----------------------------------");
                int opcNavegador = sc.nextInt();
                if (opcNavegador == 1) {
                    navegadorInternet.exibirPagina();
                } else if (opcNavegador == 2){
                    navegadorInternet.adicionarNovaAba();
                }else if (opcNavegador == 3) {
                    navegadorInternet.atualizarPagina();
                }
                break;

            default:
                System.out.println("Opção errada, selecione entre 0 e 3");
        }
        sc.close();
    }
}
