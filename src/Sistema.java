public class Sistema {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone 14", "Preto");
        System.out.println('\n');

        System.out.println("Seu aparelho é um: " + iphone.getModelo() + "\nna cor: " + iphone.getCor() );
        System.out.println('\n');

        // Testando o Reprodutor Musical
        iphone.tocar();
        iphone.selecionarMusica("Shape of You");
        iphone.pausar();
        System.out.println('\n');

        // Testando o Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println('\n');

        // Testando o Navegador Internet
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println('\n');

    }
}
