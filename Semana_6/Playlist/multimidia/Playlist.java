package multimidia;

public class Playlist implements Cloneable{

	private ArquivoMultimidia playlist[];
	private int indexPlaylist = -1;

	public Playlist(){
		this.playlist = new ArquivoMultimidia[100];
	}

	public void adicionarItem(ArquivoMultimidia arquivo) {
		if (indexPlaylist + 1 <= 100){
			playlist[++indexPlaylist] = arquivo;
		} 	
	}
		

	public void renomearItem(int indiceArquivo, String novoNomeArquivo){
		playlist[indiceArquivo].setNomeArquivo(novoNomeArquivo);
	}

	// Falta arrumar essa parte
	public void moverParaInicio(int indiceArquivo){
		ArquivoMultimidia prim = playlist[indiceArquivo];
		for(int i = indiceArquivo; i > 0; i--){
			playlist[i] = playlist[i-1];
		}
		playlist[0] = prim;

	}

	public String[] listarArquivos(){
		String[] arquivos = new String[indexPlaylist + 1];
		for(int i = 0; i <= indexPlaylist; i++){
			arquivos[i] = playlist[i].getNomeArquivo();
		}
		return arquivos;
	}

	@Override
	public Playlist clone() throws CloneNotSupportedException{
		Playlist novaPlaylist = new Playlist();
		for(int i = 0; i < indexPlaylist + 1; i++) {
			ArquivoMultimidia novo = (ArquivoMultimidia) playlist[i].clone();
			novaPlaylist.adicionarItem((ArquivoMultimidia)(playlist[i]).clone());
		}
		return novaPlaylist;	
	}
}
