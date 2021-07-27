package geometria;

public class Comparacao {	

	public static <T extends Comparable<T>> T menorElemento(T[] v) {
		T menor = v[0];
		for(int i = 0; i < v.length; i++){
			if(v[i].compareTo(menor) < 0)
				menor = v[i];
		}
		return menor;
	}

	public static <T extends Comparable<T>> T maiorElemento(T[] v) {
		T maior = v[0];
		for(int i = 0; i < v.length; i++){
			if(v[i].compareTo(maior) > 0)
				maior = v[i];
		}
		return maior;
	
	}
}