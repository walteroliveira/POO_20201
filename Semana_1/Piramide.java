import java.util.Scanner;

public class Piramide {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		for(int i = 1; i <=n; i++){
			for(int j = n; j > i; j--)
				System.out.print("-");	
			for(int k = 0; k != 2 * i - 1; k++)
				System.out.print("1");		
			for(int j = n; j > i; j--)
				System.out.print("-");	
			System.out.println();
		}
	}
}