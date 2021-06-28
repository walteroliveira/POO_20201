import navegador.*;

public class TesteNavegador {
	public static void main(String[] args){
		Navegador n1 = new Navegador(5);
		AbaBuscador aba1 = n1.abrirAba(1, "Buscador_A");
		AbaRedeSocial aba2 = n1.abrirAba(2, "RedeSocial_A");
		aba1.buscar("Programacao");
		aba2.postar("Post_1");
		n1.fecharAba(aba1);
		String abas = n1.getAbas();
	}
}