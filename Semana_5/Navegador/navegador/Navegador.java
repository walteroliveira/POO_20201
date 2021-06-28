package navegador;

public class Navegador {
	private int limiteAbas;
	private int indexAbas;
	private int numAbas;
	private AbaNavegador[] abas;
	protected static String[] historico  = new String[100];
	protected static int indexHistorico = -1;

	public Navegador(int limiteAbas){
		this.limiteAbas = limiteAbas;
		this.abas = new AbaNavegador[limiteAbas];
		this.indexAbas = -1;
		this.numAbas = 0;
	}

	
	public AbaNavegador abrirAba(int tipo, String titulo){
		if(indexAbas + 1 < limiteAbas){
			if(tipo == 1){
				AbaBuscador novaAba = new AbaBuscador();
				novaAba.setTitulo(titulo);
				abas[++indexAbas] = novaAba;
				numAbas++;
				return novaAba;	
			}
			else if (tipo == 2){
				AbaRedeSocial novaAba = new AbaRedeSocial();
				novaAba.setTitulo(titulo);
				abas[++indexAbas] = novaAba;
				numAbas++;
				return novaAba;	
			}	
		}
		return null;
	}	

	public void fecharAba(AbaNavegador aba){
		int i;
		for(i = 0; i <= indexAbas; i++){
			if(aba == abas[i]){
				abas[i] = null;
				numAbas--;
				break;
			}
		}
		for(int j = i+1; j <= indexAbas; j++){
			abas[j-1] = abas[j];
		}
		indexAbas--;

	}
	public String[] getAbas() {
		String[] abasAbertas = new String[numAbas];
		int aba = -1;
		for(int i = 0; i <= indexAbas; i++){
			if (abas[i] != null){
				abasAbertas[++aba] = abas[i].getTipo()+ " " + abas[i].getTitulo();
			}
		}
		return abasAbertas;
	}

	public String[] getHistorico() {
		int numHistorico = 0;
		for(int i = 0; i < 100; i++){
			if (historico[i] != null)
				numHistorico++;
		}
		String[] outHistorico = new String[numHistorico];
		for(int i = 0; i < numHistorico; i++){
			outHistorico[i] = historico[i];
		}
		return outHistorico;
	}
}