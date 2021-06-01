import dispositivos.LampadaInteligente;
public class GerenciadorLampadas {
	private LampadaInteligente[] lampadas = new LampadaInteligente[10];

	private int encontraIndiceLivre(){
		for(int i = 0; i < 10; i++){
			if(lampadas[i] == null)
				return i;		
		}
		return -1;
	}
	public void adicionarLampada() {
		int i = encontraIndiceLivre();
		if (i != -1)
			lampadas[i] = new LampadaInteligente();
	}
	public void ligarLampada(int indiceLampada){
		if(lampadas[indiceLampada].getEstado() == false){
			lampadas[indiceLampada].ligar();
		}
	}
	public void desligarLampada(int indiceLampada){
		if(lampadas[indiceLampada].getEstado() == true){
			lampadas[indiceLampada].desligar();
		}
	}
	public void ligarTodasLampadas(){
		for(int i = 0; i < 10; i++){
			if(lampadas[i] != null && lampadas[i].getEstado() == false)
				lampadas[i].ligar();
		}
	}
		public void desligarTodasLampadas(){
		for(int i = 0; i < 10; i++){
			if(lampadas[i] != null && lampadas[i].getEstado() == true)
				lampadas[i].desligar();
		}
	}


}