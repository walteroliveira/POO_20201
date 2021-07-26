import dispositivos.*;

public class GerenciadorLampadas {

	LampadaInteligente lampadas[] = new LampadaInteligente[10];
	private int numLampadas = -1;

	public void adicionarLampada(){
		LampadaInteligente novaLampada = new LampadaInteligente();
		lampadas[++numLampadas] = novaLampada;
	}

	public void ligarLampada(int indiceLampada) throws LampadaEstaLigada{
		if(lampadas[indiceLampada].getEstado())
			throw new LampadaEstaLigada();
		else
			lampadas[indiceLampada].ligar();
	}

		public void desligarLampada(int indiceLampada) throws LampadaEstaDesligada{
		if(!lampadas[indiceLampada].getEstado())
			throw new LampadaEstaDesligada();
		else
			lampadas[indiceLampada].desligar();
	}
	
}


class LampadaEstaLigada extends Exception{

	LampadaEstaLigada(){
		super("A lampada ja esta ligada.");
	}
}

class LampadaEstaDesligada extends Exception{

	LampadaEstaDesligada(){
		super("A lampada ja esta desligada.");
	}
}