public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical{

    @Override
    public void ligar(String Numero) {
        System.out.println("CHAMANDO...");
    }

    @Override
    public void atender() {
        System.out.println("EM CHAMADA..");
    }

    @Override
    public void iniciarCorreiroDeVoz() {
        System.out.println("MENSAGEM DE VOZ");
    }

    @Override
    public void exibirPagina(String Url) {
        System.out.println("SITE:"+Url);
    }

    @Override
    public void adiconarNovaAba() {
        System.out.println("+");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO...");
    }

    @Override
    public void tocar(String Nome) {
        System.out.println("TOCANDO USICA:"+Nome);
    }

    @Override
    public void pausar() {
        System.out.println();
    }

    @Override
    public void selecionarMusiaca(String Nome) {
        System.out.println("SELECIONAR:"+Nome);
    }
}
