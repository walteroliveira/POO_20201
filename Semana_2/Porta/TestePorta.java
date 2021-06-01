public class TestePorta {
	public static void main(String[] args) {

		Porta portaSala = new Porta();
    	portaSala.setNome("Porta da sala");
    	System.out.println(portaSala.fechar());
    	System.out.println(portaSala.fechar());
    	System.out.println(portaSala.abrir());
    	System.out.println(portaSala.abrir());

    	Porta portaCozinha = new Porta();
    	portaCozinha.setNome("Porta da cozinha");
	}
}