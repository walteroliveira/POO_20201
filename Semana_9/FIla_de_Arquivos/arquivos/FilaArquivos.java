package arquivos;

import java.util.ArrayList;

public class FilaArquivos<T> implements Fila<T> {
	private int n;
	private ArrayList<T> fila = new ArrayList<T>();

	FilaArquivos(int n){
		this.n = n;
	}

	public boolean enfileirar(T arquivo){
		if(fila.size() + 1 > n)
			return false;
		fila.add(arquivo);
		return true;
	}

	public T desenfileirar(){
		if(fila.size() == 0)
			return null;
		T item = fila.get(0);
		fila.remove(0);
		return item;
	}
}