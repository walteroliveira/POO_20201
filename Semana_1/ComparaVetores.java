import java.util.Scanner;

public class ComparaVetores {
	public static boolean comparaVetor(int[] a, int[] b){
		for(int i = 0; i < a.length - 1; i++)
			if ((b[i]/a[i]) != (b[i+1]/a[i+1]))
				return false;
			return true;
	} 
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = leitor.nextInt();
		for(int i = 0; i < n; i++)
			b[i] = leitor.nextInt();
		boolean comp = comparaVetor(a, b);
		if(comp)
			System.out.println("SIM");
		else
			System.out.println("NAO");
	}
}