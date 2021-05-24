import java.util.Scanner;

public class Estatisticas {
	public static int verificaMax(int n, int max){
		if (n > max)
			return n;
		return max;
	}
	public static int verificaMin(int n, int min){
		if (n < min)
			return n;
		return min;
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int soma = 0, max = 0, min = 0;
		double media = 0.0, qtde = 0.0;
		int n = leitor.nextInt();
		while (n >= 0){
			soma += n;
			if(qtde == 0){
				max = n;
				min = n;
			}
			else {
				max = verificaMax(n, max);
				min = verificaMin(n, min);
			}
			qtde += 1.0;
			n = leitor.nextInt();
		}
		media = soma / qtde;
		System.out.println(soma);
		System.out.println(String.format("%.2f", media));
		System.out.println(min);
		System.out.println(max);
	}
}