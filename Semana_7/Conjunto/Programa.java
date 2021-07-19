import estruturas.*;

public class Programa{

	public static void main(String[] args) {
		Conjunto a = new Conjunto();

		a.adicionar(20);	
		a.adicionar(15);	


		Conjunto b = new Conjunto();
		b.adicionar(60);	
		b.adicionar(70);	
		b.adicionar(20);	

		System.out.println(a.buscar(10));
		System.out.println(a.getQtd());
		System.out.println("Intersecao = " + a.intersecao(a,b));
		System.out.println("Uniao = " + a.uniao(a,b));	
	}
}