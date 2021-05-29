import java.util.Scanner;

public class TestesDiscosVoadores {
	public static int encontraMenorLinha(int[][] matriz, int inicio){
		int menor = inicio;
		for (int i = inicio + 1; i < matriz.length; i++){
			if(matriz[i][0] < matriz[menor][0])
				menor = i;
			else if (matriz[i][0] == matriz[menor][0]){
				int j = 0;
				while (j < matriz[0].length && matriz[i][j] == matriz[menor][j]){
					j++;
					if(j < matriz[0].length && matriz[i][j] < matriz[menor][j])
						menor = i;
					
				}
			}
		}
		return menor;
	}
	public static int encontraMenorColuna(int[][] matriz, int inicio){
		int menor = inicio;
		for(int i = inicio + 1; i < matriz[0].length; i++){
			if(matriz[0][i] < matriz[0][menor])
				menor = i;
			else if(matriz[0][i] == matriz[menor][0]){
				int j = 0;
				while(j < matriz.length && matriz[j][i] == matriz[j][menor]){	
					j++;	
					if(j < matriz.length && matriz[j][i] < matriz[j][menor])
						menor = i;				
				}
			}
		}
		return menor;
	}
	public static void inverteLinhaMatriz(int[][] matriz, int linha1, int linha2){
		int temp;
		for(int i = 0; i < matriz[0].length; i++){
			temp = matriz[linha1][i];
			matriz[linha1][i] = matriz[linha2][i];
			matriz[linha2][i] = temp;
		}

	}
	public static void inverteColunaMatriz(int[][] matriz, int col1, int col2){
		int temp;
		for(int i = 0; i < matriz.length; i++){
			temp = matriz[i][col1];
			matriz[i][col1] = matriz[i][col2];
			matriz[i][col2] = temp;
		}
	}
	public static void ordenaLinhaMatriz(int[][] matriz){
		int indexMenor;
		for(int i = 0; i < matriz.length; i++){
			indexMenor = encontraMenorLinha(matriz, i);
			if(indexMenor != i)
				inverteLinhaMatriz(matriz, i, indexMenor);


		}
	}
	public static void ordenaColunaMatriz(int[][] matriz){
		int indexMenor;
		for(int i = 0; i < matriz[0].length; i++){
			indexMenor = encontraMenorColuna(matriz, i);
			if(indexMenor != i)
				inverteColunaMatriz(matriz, i, indexMenor);



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
		if(m > 0 && n > 0){
			int[][] matriz = new int[n][m]; 
				for(int i = 0; i < n; i++){
					for(int j = 0; j < m; j++){
						matriz[i][j] = leitor.nextInt();
					}
				}
		ordenaLinhaMatriz(matriz);
		imprimeMatriz(matriz);
		System.out.println();
		ordenaColunaMatriz(matriz);
		imprimeMatriz(matriz);
		}
	}
}