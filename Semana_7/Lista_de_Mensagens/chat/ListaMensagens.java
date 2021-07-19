package chat;

public class ListaMensagens{
	Mensagem inicioLista;
	private int numeroMensagens;


	public ListaMensagens(){
		this.inicioLista = null;
		this.numeroMensagens = -1;
	}

	public void adicionarMensagem(Mensagem mensagem){
		if(inicioLista == null){			
			inicioLista = mensagem;
			this.numeroMensagens++;
		}		
		else {
			Mensagem p = inicioLista;
			while(p.proxMensagem != null)
				p = p.proxMensagem;
			p.proxMensagem = mensagem;
			this.numeroMensagens++;
		}
	} 

	public void responderMensagem(int indicieMensagemOriginal, Mensagem resposta){
		Mensagem p = inicioLista;
		while(p != null && indicieMensagemOriginal > 0){
			p = p.proxMensagem;
			indicieMensagemOriginal--;
		}
		p.responder(resposta);
		adicionarMensagem(resposta);
	}

	public Mensagem[] getMensagens(){
		Mensagem lista[] = new Mensagem[numeroMensagens+1];
		int i = -1;
		Mensagem p = inicioLista;
		while(p != null){
			lista[++i] = p;
			p = p.proxMensagem;
		}
		return lista;
	}
 	public String[] getMensagensString(){
		String lista[] = new String[numeroMensagens+1];
		int i = -1;
		Mensagem p = inicioLista;
		while(p != null){
			lista[++i] = p.getRepresentacao();
			p = p.proxMensagem;
		}
		return lista;
	}

	public void like(int indicieMensagem){
		Mensagem p = inicioLista;
		while(p != null && indicieMensagem > 0){
			p = p.proxMensagem;
			indicieMensagem--;
		}
		p.like();
	}
}