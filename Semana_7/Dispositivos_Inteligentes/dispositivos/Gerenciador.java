package dispositivos;

public class Gerenciador {

	private DispositivoInteligente primeiro = null;
	public void adicionarDispositivo(DispositivoInteligente d){
		if (primeiro == null)
			primeiro = d;
		else {
			DispositivoInteligente index = primeiro;
			while(index.proxDispositivo != null)
				index = index.proxDispositivo;
			index.proxDispositivo = d;
			index = null;
		}
		

	}

	public void ligarTodosDispositivos(){
		DispositivoInteligente index = primeiro;
		while(index.proxDispositivo != null){
			index.ligar();
			index = index.proxDispositivo;
		}
		index.ligar();
		index = null;
	}

	public void desligarTodosDispositivos(){
		DispositivoInteligente index = primeiro;
		while(index.proxDispositivo != null){
			index.desligar();
			index = index.proxDispositivo;
		}

		index.desligar();
		index = null;
	}

}

abstract class DispositivoInteligente {
	
	private boolean estado;
	protected DispositivoInteligente proxDispositivo = null;

	public void ligar(){
		this.estado = true;
	}

	public void desligar(){
		this.estado = false;
	}

	public boolean getEstado(){
		return this.estado;
	}
}

class LampadaInteligente extends DispositivoInteligente {
	
	private boolean estado;
	protected DispositivoInteligente proxDispositivo = null;

	public void ligar(){
		this.estado = true;
	}

	public void desligar(){
		this.estado = false;
	}

	public boolean getEstado(){
		return this.estado;
	}
}

class TomadaInteligente extends DispositivoInteligente {
	
	private boolean estado;
	protected DispositivoInteligente proxDispositivo = null;

	public void ligar(){
		this.estado = true;
	}

	public void desligar(){
		this.estado = false;
	}

	public boolean getEstado(){
		return this.estado;
	}
}

class InterruptorInteligente extends DispositivoInteligente {
	
	private boolean estado;
	protected DispositivoInteligente proxDispositivo = null;

	public void ligar(){
		this.estado = true;
	}

	public void desligar(){
		this.estado = false;
	}

	public boolean getEstado(){
		return this.estado;
	}
}