package dispositivos;
public class LampadaInteligente {
	private boolean estado = false;

	public void ligar(){
		estado = true;
	}
	public void desligar(){
		estado = false;
	}
	public boolean getEstado(){
		return estado;
	}
}