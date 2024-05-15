import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    Scanner sc = new Scanner(System.in);

    @Override
    public void ligar() {
        System.out.println("Ligando ...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para o correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina ...");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina ...");

    }


    @Override
    public void tocar() {
        System.out.println("Tocando uma musica bem legal ...");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando uma musica...");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma musica especial...");

    }
}
