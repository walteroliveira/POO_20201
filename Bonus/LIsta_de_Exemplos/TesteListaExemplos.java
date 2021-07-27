import classificacao.*;

public class TesteListaExemplos {
	public static void main(String[] args) {
		ListaExemplos l = new ListaExemplos(3);
		double a[] = {1.0, 0.9, 1.1};
		double b[] = {1.1, 0.8, 1.0};
		double c[] = {4.0, 8.0, 0.9};


		Exemplo e1 = new Exemplo(a, 1);
		Exemplo e2 = new Exemplo(b, 1);
		Exemplo e3 = new Exemplo(c, 2);

		l.adicionarExemplo(e1);
		l.adicionarExemplo(e2);
		l.adicionarExemplo(e3);

		Exemplo out0[] = l.getExemplos();
		for(int i = 0; i < out0.length; i++)
			System.out.println(out0[i].toString());
	

		double base[] = {5.0, 7.0, 1.0};
		
		l.ordenarPelaDistancia(base);

		Exemplo out[] = l.getExemplos();

		for(int i = 0; i < out.length; i++)
			System.out.println(out[i].toString());
	}
}