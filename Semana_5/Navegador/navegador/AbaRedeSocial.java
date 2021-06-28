package navegador;

public class AbaRedeSocial extends AbaNavegador{

	public void postar(String texto){
		for(int i = 0; i < navegador.Navegador.historico.length; i++){
			if (navegador.Navegador.historico[i] == null){
				navegador.Navegador.historico[i] = "Post: " + texto;
				break;
			}
		}
	}

	public String getTipo(){
		return "RedeSocial";
	}

}