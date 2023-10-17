public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String link) {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página adicionada");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar(String musica) {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada");
    }
}
