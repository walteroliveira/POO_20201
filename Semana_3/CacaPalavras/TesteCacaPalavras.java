import palavras.PalavraEncontrada;
import palavras.Tabuleiro;
import java.util.Scanner;

public class TesteCacaPalavras{
	public static void main(String[] args){


		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int m = leitor.nextInt();
		char[] entrada = new char[n*m];
		for(int i = 0; i < n*m; i++){
			entrada[i] = leitor.next().charAt(0);
		}

		// char[][] campo = new char[n][m]; 
		// for(int i = 0; i < n; i++){
		// 	for(int j = 0; j < m; j++){
		// 		campo[i][j] = leitor.next().charAt(0);

		// 	}
		// }
		// for(int i = 0; i < n; i++){
		// 	for(int j = 0; j < m; j++){
		// 		System.out.print(campo[i][j]);
		// 	}
		// 	System.out.println();
		// }
		int[] a = new int[2];
		PalavraEncontrada[] p = new PalavraEncontrada[2];	
		String[] palavras = new String[3];
		palavras[0] = "TESTE";
		palavras[1] = "PALAVRA";
		palavras[2] = "JAVA";
		Tabuleiro tabuleiro = new Tabuleiro(n, m, entrada);
		char[][] matriz = tabuleiro.getMatriz();
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				System.out.println(matriz[i][j]);
			}
		}
		System.out.println(tabuleiro.buscar("TESTE").getPalavra());
		a = tabuleiro.buscar("TESTE").getPosicao();
		p = tabuleiro.buscar(palavras);
		System.out.println("L=" + a[0] + " C=" + a[1]);
		System.out.println(p[0].getPalavra());
		System.out.println(p[1].getPalavra());
	}

}
