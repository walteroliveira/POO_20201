package multimidia;

public class Playlist {

	private ArquivoMultimidia playlist[];
	private int indexPlaylist = -1;

	public Playlist(){
		this.playlist = new ArquivoMultimidia[10];
	}

	public void adicionarItem(ArquivoMultimidia arquivo) throws QuantidadeLimiteArquivos{
		if (indexPlaylist + 1 >= 10){
			throw new QuantidadeLimiteArquivos();
		} 	
		playlist[++indexPlaylist] = arquivo;
	}
		

	public void renomearItem(int indiceArquivo, String novoNomeArquivo) throws IndiceArquivoInvalido{
		if(indiceArquivo < 0 || indiceArquivo > 10 || playlist[indiceArquivo] == null)
			throw new IndiceArquivoInvalido(indiceArquivo);
		playlist[indiceArquivo].setNomeArquivo(novoNomeArquivo);
	}

	public void moverParaInicio(int indiceArquivo) throws IndiceArquivoInvalido{
		if(indiceArquivo < 0 || indiceArquivo > 10 || playlist[indiceArquivo] == null)
			throw new IndiceArquivoInvalido(indiceArquivo);
		ArquivoMultimidia prim = playlist[indiceArquivo];
		for(int i = indiceArquivo; i > 0; i--){
			playlist[i] = playlist[i-1];
		}
		playlist[0] = prim;

	}

	public String[] listarArquivos(){
		String[] arquivos = new String[indexPlaylist + 1];
		for(int i = 0; i <= indexPlaylist; i++){
			arquivos[i] = playlist[i].toString();
		}
		return arquivos;
	}

	public void ordenarArquivos(int tipo){
		if(tipo == 1){
			for(int i = 0; i < indexPlaylist; i++){
				int indexMenor = i;
				for(int j = i; j <= indexPlaylist; j++){
					if((playlist[j].getNomeArquivo()).compareTo(playlist[indexMenor].getNomeArquivo()) < 0)
						indexMenor = j;
					else if((playlist[j].getNomeArquivo()).compareTo(playlist[indexMenor].getNomeArquivo()) == 0){
						if(playlist[j].getTamanhoArquivo() < playlist[indexMenor].getTamanhoArquivo())
							indexMenor = j;
					}
				}
				ArquivoMultimidia temp = playlist[i];
				playlist[i] = playlist[indexMenor];
				playlist[indexMenor] = temp;
			}	
		}
		else if (tipo == 2){
			for(int i = 0; i < indexPlaylist; i++){
				int indexMenor = i;
				for(int j = i; j <= indexPlaylist; j++){
					if(playlist[j].getTamanhoArquivo() < playlist[indexMenor].getTamanhoArquivo())
						indexMenor = j;
					else if(playlist[j].getTamanhoArquivo() == playlist[indexMenor].getTamanhoArquivo()){
						if((playlist[j].getNomeArquivo()).compareTo(playlist[indexMenor].getNomeArquivo()) < 0)
							indexMenor = j;
					}
				}
				ArquivoMultimidia temp = playlist[i];
				playlist[i] = playlist[indexMenor];
				playlist[indexMenor] = temp;
			}	
		}
	}
}

class QuantidadeLimiteArquivos extends Exception{
	QuantidadeLimiteArquivos(){
		super("Quantidade limite de arquivos foi atingida.");
	}
}

class IndiceArquivoInvalido extends Exception{
	IndiceArquivoInvalido(int indice){
		super("Indice de arquivo invalido = " + indice);
	}
}