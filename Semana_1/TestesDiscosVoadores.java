import java.util.Scanner;

public class TestesDiscosVoadores {
	public static void inverteLinhaMatriz(int[][] matriz, int linha1, int linha2){
		int temp;
		for(int i = 0; i < matriz[0].length; i++){
			temp = matriz[linha1][i];
			matriz[linha1][i] = matriz[linha2][i];
			matriz[linha2][i] = temp;
		}

	}
	public static void inverteColunaMatriz(int[][] matriz, int col1, int col2){}
		int temp;
		for(int i = 0; i < matriz.length; i++){
			temp = matriz[i][col1];
			matriz[i][col1] = matriz[i][col2];
			matriz[i][col2] = temp;
		}
	}
	public static void ordenaLinhaMatriz(int[][] matriz){
		
		for(int i = 0; i < matriz.length - 1; i++){
			for(int j = 0; j < matriz[0].length; j++){
				if(matriz[i][j] > matriz[i+1][j]){					
					inverteLinhaMatriz(matriz, i, i+1);
					break;
				}

			}
			
		}

	}
	public static void ordenaColunaMatriz(int[][] matriz){
		for(int i = 0; i < matriz[0].length - 1; i++){
			for(int j = 0; j < matriz.length; j++){
				if(matriz[j][i] > matriz[j][i+1]){
					System.out.println("Troca coluna " + i);
					inverteColunaMatriz(matriz, i, i+1);
					break;				
				}
			}
		}

	}
	public static void imprimeMatriz(int[][] matriz){
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[0].length - 1; j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(matriz[i][matriz[0].length-1]);
		}
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int m = leitor.nextInt();
		int[][] matriz = new int[n][m]; 
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				matriz[i][j] = leitor.nextInt();
			}
		}
		ordenaLinhaMatriz(matriz);
		imprimeMatriz(matriz);
		ordenaColunaMatriz(matriz);
		imprimeMatriz(matriz);

	}
}