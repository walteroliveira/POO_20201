package classificacao;

public class Exemplo {
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

	public String toString(){
		String out = "";
		for(int i = 0; i < atributosEntrada.length; i++)
			out += atributosEntrada[i] + " ";
		return out;
	}
}