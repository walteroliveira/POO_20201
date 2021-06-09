package palavras;

public class Tabuleiro {
	private char[][] matriz;

	private boolean verificaLinha1(int i, int j, String palavra){
		int indexPalavra = 0;
		while(j < matriz[0].length && palavra.charAt(indexPalavra) == this.matriz[i][j]){
			indexPalavra++;
			j++;
		}
		return indexPalavra + 1 == palavra.length();
	}

	private boolean verificaLinha2(int i, int j, String palavra){
		int indexPalavra = 0;
		while(j >= 0 && palavra.charAt(indexPalavra) == this.matriz[i][j]){
			indexPalavra++;
			j--;
		}
		return indexPalavra + 1 == palavra.length();
	}

	private boolean verificaColuna1(int i, int j, String palavra){
		int indexPalavra = 0;
		while(i < matriz.length && palavra.charAt(indexPalavra) == this.matriz[i][j]){
			indexPalavra++;
			i++;
		}
		return indexPalavra + 1 == palavra.length();
	}
	private boolean verificaColuna2(int i, int j, String palavra){
		int indexPalavra = 0;
		while(i >= 0 && palavra.charAt(indexPalavra) == this.matriz[i][j]){
			indexPalavra++;
			i--;
		}
		return indexPalavra + 1 == palavra.length();
	}
	private boolean verificaDiagonal1(int i, int j, String palavra){
		int indexPalavra = 0;
		while(i >= 0 && j < matriz[0].length && palavra.charAt(indexPalavra) == this.matriz[i][j]){
			indexPalavra++;
			i--;
			j++;
		}
		return indexPalavra + 1 == palavra.length();
	}
	private boolean verificaDiagonal2(int i, int j, String palavra){
		int indexPalavra = 0;
		while(i < matriz.length && j < matriz[0].length && palavra.charAt(indexPalavra) == this.matriz[i][j]){
			indexPalavra++;
			i++;
			j++;
		}
		return indexPalavra + 1 == palavra.length();
	}
	private boolean verificaDiagonal3(int i, int j, String palavra){
		int indexPalavra = 0;
		while(i < matriz.length && j >= 0 && palavra.charAt(indexPalavra) == this.matriz[i][j]){
			indexPalavra++;
			i++;
			j--;
		}
		return indexPalavra + 1 == palavra.length();
	}
	private boolean verificaDiagonal4(int i, int j, String palavra){
		int indexPalavra = 0;
		while(i >= 0 && j >= 0 && palavra.charAt(indexPalavra) == this.matriz[i][j]){
			indexPalavra++;
			i--;
			j--;
		}
		return indexPalavra + 1 == palavra.length();
	}
	public Tabuleiro(char[][] matriz){
		this.matriz = matriz;
	}

	public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz){
		int indexDados = -1;
		this.matriz = new char[qtdLinhas][qtdColunas];
		for(int i = 0; i < qtdLinhas; i++){
			for(int j = 0; j < qtdColunas; j++){
				this.matriz[i][i] = dadosMatriz[++indexDados];
			}
		}
	} 
	public PalavraEncontrada buscar(String palavra){
		int[] posicao = new int[2];
		for(int i = 0; i < this.matriz.length; i++){
			for(int j = 0; j < this.matriz[0].length; i++){
				if(matriz[i][j] == palavra.charAt(0)){
					if(verificaLinha1(i, j, palavra)){						
						posicao[0] = i;
						posicao[1] = j;
						PalavraEncontrada palavraEncontrada = new PalavraEncontrada(palavra, posicao, 1, 1);
						return palavraEncontrada;
					}
					else if(verificaLinha2(i, j, palavra)){
						posicao[0] = i;
						posicao[1] = j;
						PalavraEncontrada palavraEncontrada = new PalavraEncontrada(palavra, posicao, 1, 2);
						return palavraEncontrada;
					}
					else if(verificaColuna1(i, j, palavra)){
						posicao[0] = i;
						posicao[1] = j;
						PalavraEncontrada palavraEncontrada = new PalavraEncontrada(palavra, posicao, 2, 1);
						return palavraEncontrada;
					}
					else if(verificaColuna2(i, j, palavra)){
						posicao[0] = i;
						posicao[1] = j;
						PalavraEncontrada palavraEncontrada = new PalavraEncontrada(palavra, posicao, 2, 2);
						return palavraEncontrada;
					}
					else if(verificaDiagonal1(i, j, palavra)){
						posicao[0] = i;
						posicao[1] = j;
						PalavraEncontrada palavraEncontrada = new PalavraEncontrada(palavra, posicao, 3, 1);
						return palavraEncontrada;
					}
					else if(verificaDiagonal2(i, j, palavra)){
						posicao[0] = i;
						posicao[1] = j;
						PalavraEncontrada palavraEncontrada = new PalavraEncontrada(palavra, posicao, 3, 2);
						return palavraEncontrada;
					}
					else if(verificaDiagonal3(i, j, palavra)){
						posicao[0] = i;
						posicao[1] = j;
						PalavraEncontrada palavraEncontrada = new PalavraEncontrada(palavra, posicao, 3, 3);
						return palavraEncontrada;
					}
					else if(verificaDiagonal4(i, j, palavra)){
						posicao[0] = i;
						posicao[1] = j;
						PalavraEncontrada palavraEncontrada = new PalavraEncontrada(palavra, posicao, 3, 4);
						return palavraEncontrada;
					}
			
				}

			}
		}
		return null;
	}
	public PalavraEncontrada[] buscar(String[] palavras){
		return null;
	}

}