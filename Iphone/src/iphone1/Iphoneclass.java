package iphone1;

public class Iphoneclass implements ReprodutorMusical, AparelhoTelefonico, Navegador {
	
	public void tocar() {
		System.out.println("Tocando musica...");
	}
	public void pausar() {
		System.out.println("Música pausada.");
	}
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música" + musica);
	}
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página..." + url);
		
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador");
		
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
		
	}
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para" + numero);
		
	}
	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
		
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz...");
		
	}
	
	public static void main(String[] args) {
		Iphoneclass meuIphone = new Iphoneclass();
		
		meuIphone.selecionarMusica(" Fica tudo bem - One direction");
		meuIphone.tocar();
		meuIphone.pausar();
		meuIphone.ligar(" 12345678");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		meuIphone.exibirPagina("http://www.exemplo.com");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
		
	}
}
