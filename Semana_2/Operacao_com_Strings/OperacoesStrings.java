public class OperacoesStrings{
	private String texto;

	void setTexto(String texto){
		this.texto = texto;
	}
	String getTexto(){
		return texto;
	}
	int contaPalavras(){
		int numPalavras;
		if(texto.charAt(0) == ' '){
			numPalavras = 0;
		}
		else {
			numPalavras = 1;
		}
		
		for(int i = 0; i < texto.length()- 1; i++){
			if(texto.charAt(i) == ' ' && texto.charAt(i+1) != ' ' && texto.charAt(i+1) != '.'){
				numPalavras++;
			}
		}
		return numPalavras;
	}
	double comprimentoMedioPalavras(){
		int numPalavras = this.contaPalavras();
		double numCaracteres = 0.0;
		for(int i = 0; i < texto.length(); i++){
			if(texto.charAt(i) != ' ' && texto.charAt(i) != '.')
				numCaracteres++;
		}
		return numCaracteres/numPalavras;
	} 
	int comprimentoMaiorPalavra(){
		String maior = this.maiorPalavra();
		return maior.length();
	}
	String maiorPalavra(){
		int indexInicial = 0;
		int indexFinal = 0;
		int indexInicialAux = 0;
		int indexFinalAux = 0;
		for(int i = 0; i < texto.length(); i++){
			if(i == 0 || (texto.charAt(i-1) == ' ' && texto.charAt(i) != ' ')){
				indexInicialAux = i;
				while(i < texto.length() && texto.charAt(i) != ' ' && texto.charAt(i) != '.'){
					i++;
				}
				indexFinalAux = i;
			}
			if(indexFinalAux - indexInicialAux > indexFinal - indexInicial){
				indexInicial = indexInicialAux;
				indexFinal = indexFinalAux;
			}
		}
		String maior = "";
		for(int i = indexInicial; i < indexFinal; i++){
			maior = maior + texto.charAt(i);
		}
			return maior;

	}
}