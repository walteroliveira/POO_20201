import java.util.Scanner;

public class CampoMinado {

	public static int verificaVizinho(int[][] campo, int linha, int col){
		int qtde = 0;
		if(campo[linha][col] == 1)
			qtde--;
		for(int i = linha-1; i < linha + 2; i++){
			for(int j = col - 1; j < col +2; j++){
				if (i >= 0 && i < campo.length && j >= 0 && j < campo[0].length){

					if(campo[i][j] == 1 )	{
						qtde++;
					}			
				}
			}
		}
		return qtde;
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int m = leitor.nextInt();
		int[][] campo = new int[n][m]; 
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				campo[i][j] = leitor.nextInt();
			}
		}
		n = leitor.nextInt();
		m = leitor.nextInt();
		System.out.println(verificaVizinho(campo, n, m));
	}
}