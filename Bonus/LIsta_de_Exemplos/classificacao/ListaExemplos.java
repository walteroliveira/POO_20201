package classificacao;

public class ListaExemplos {
	
	private int maxQtd;
	private Exemplo[] lista;
	private int index;

	public ListaExemplos(int maxQtd){
		this.maxQtd = maxQtd;
		lista = new Exemplo[maxQtd];
		index = -1;
	}
	
	public void adicionarExemplo(Exemplo exemplo){
		if(index + 1 < maxQtd)
			lista[++index] = exemplo;
	}

	private double sqrt(double n){
		double t;
		double raiz = n/2;
		do {
			t = raiz;
			raiz = (t + (n / t)) / 2;
		} while((t - raiz) != 0);
		return raiz;
	}
	private double calculaDistancia(double[] l1, double[] l2){
		double distancia = 0;
		for(int i = 0; i < l1.length; i++){
			distancia += (l1[i] - l2[i]) * (l1[i] - l2[i]);  
		}
		return sqrt(distancia);
	}
	public void ordenarPelaDistancia(double[] atributosEntrada){
		double distancia[] = new double[index + 1];
		for(int i = 0; i <= index; i++){
			distancia[i] = calculaDistancia(lista[i].getAtributosEntrada(), atributosEntrada);
		}
		for(int i  = 0; i < index; i++){
			int menor = i;
			for(int j = i; j <= index; j++){
				if(distancia[j] < distancia[menor])
					menor = j;
			}

			double tempDist = distancia[i];
			distancia[i] = distancia[menor];
			distancia[menor] = tempDist;

			Exemplo temp = lista[i];
			lista[i] = lista[menor];
			lista[menor] = temp;
		}

	}

	public int getQtdExemplos(){
		return index+1;
	}

	public Exemplo[] getExemplos(){
		return lista;
	}

	public Exemplo[] getPrimeirosExemplos(int n){
		Exemplo retorno[] = new Exemplo[n];
		for(int i = 0; i < n; i++)
			retorno[i] = lista[i];
		return retorno;
	}

	public Exemplo[] getUltimosExemplos(int n){
		Exemplo retorno[] = new Exemplo[n];
		for(int i = 0; i < n; i++)
			retorno[i] = lista[index - n + 1 + i ];
		return retorno;

	}
}

class Exemplo {
	private double[] atributosEntrada;
	private int rotuloClasse;

	public Exemplo(double[] atributosEntrada, int rotuloClasse){
		this.atributosEntrada = atributosEntrada;
		this.rotuloClasse = rotuloClasse;
	}

	public double[] getAtributosEntrada(){
		return this.atributosEntrada;
	}

	public int getRotuloClasse(){
		return this.rotuloClasse;
	}
}