package navegador;

public class AbaBuscador extends AbaNavegador{

	public void buscar(String expressao){
		for(int i = 0; i < navegador.Navegador.historico.length; i++){
			if (navegador.Navegador.historico[i] == null){
				navegador.Navegador.historico[i] = "Busca: " + expressao;
				break;
			}
		}
		
	}

	public String getTipo(){
		return "Buscador";
	}

}