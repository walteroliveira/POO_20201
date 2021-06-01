public class TesteOperacoesStrings{
	public static void main(String[] args){
		OperacoesStrings texto = new OperacoesStrings();
		texto.setTexto("Frase de teste.");
		System.out.println(texto.contaPalavras());
		System.out.println(texto.comprimentoMedioPalavras());
		System.out.println(texto.maiorPalavra());
		System.out.println(texto.comprimentoMaiorPalavra());

	}
}