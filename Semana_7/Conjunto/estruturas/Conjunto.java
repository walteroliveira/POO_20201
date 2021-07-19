package estruturas;

public class Conjunto implements Lista {

	private NoLista inicio = null;
	private int qtd = 0;

	static class NoLista{
		int numero;
		NoLista prox = null;

		NoLista(int numero){
			this.numero = numero;
		}
	}

	@Override
	public int getQtd(){
		return this.qtd;
	}

	@Override
	public void adicionar(int numero){
		NoLista novo = new NoLista(numero);
		if(this.inicio == null){
				this.inicio = novo;
				qtd++;
		}
		else {
			boolean repetido = false;
			NoLista anterior = null;
			NoLista atual = inicio;
			while(atual != null){
				if(atual.numero == numero){
					novo = null;
					repetido = true;
					break;
				}
				anterior = atual;
				atual = atual.prox;

			}
			if(!repetido){
				anterior.prox = novo;
				qtd++;
			}
			
		}
	}

	@Override
	public void remover(int numero){
		NoLista anterior = null;
		NoLista atual = inicio;

		while(atual != null && numero != atual.numero){
			anterior = atual;
			atual = atual.prox;
		}
		if(atual != null){
			qtd--;
			if(anterior == null)
				this.inicio = atual.prox;
			else 
				anterior.prox = atual.prox;
			atual.prox = null;
			atual = null;			
		}
	}

	@Override
	public int buscar(int numero){
		int index = -1;
		NoLista atual = inicio;
		while(index < qtd && atual != null){
			index++;
			if(atual.numero == numero)
				break;
			atual = atual.prox;
		}
		if(atual == null)
			return -1;
		else
			return index;
	}

	@Override
	public String toString(){
		String out = "";
		NoLista atual = inicio;
		out += atual.numero;
		atual = atual.prox;
		while(atual != null){
			out += " ";
			out += atual.numero;
			atual = atual.prox;
		}
		return out;
	}

	public static Conjunto uniao(Conjunto a, Conjunto b){
		Conjunto uniao = new Conjunto();
		NoLista atual = a.inicio;
		while(atual != null){
			uniao.adicionar(atual.numero);
			atual = atual.prox;
		}
		atual = b.inicio;
		while(atual != null){
			if(uniao.buscar(atual.numero) == -1)
				uniao.adicionar(atual.numero);
			atual = atual.prox;
		}
		return uniao;
	}
	public static Conjunto intersecao(Conjunto a, Conjunto b){
		Conjunto intersecao = new Conjunto();
		NoLista atual = a.inicio;
		while(atual != null){
			if(b.buscar(atual.numero) != -1)
				intersecao.adicionar(atual.numero);
			atual = atual.prox;
		}
		return intersecao;
	}
}
