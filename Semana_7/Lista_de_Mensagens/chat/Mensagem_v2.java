package chat;

public abstract class Mensagem {
	protected int likes = 0;
	protected String texto;
	protected Mensagem resposta = null;
	protected Mensagem pergunta = null;
	public Mensagem proxMensagem = null;
	protected boolean ehResposta = false;
	protected boolean ehPergunta = false;
	protected boolean foiRespondida = false;

	public void like(){
		this.likes++;
	}

	public void responder(Mensagem resposta){
		this.resposta = resposta;
		resposta.ehResposta = true;
		resposta.pergunta = this;		
		this.ehPergunta = true;
	}

	public String getRepresentacao(){
		return texto;
	}	
}

class MensagemTexto extends Mensagem {

	public MensagemTexto(String texto){
		this.texto = texto;
	}

	@Override
	public String getRepresentacao(){
		String saida = "";
		saida += this.texto;
		Mensagem p = this.pergunta;
		while(p!= null){
			saida += " RESPOSTA A [" pergunta.texto + "]";
			p = p.pergunta;
		}
		saida += "(likes=" + this.likes + ")";
		return saida;
	}

}

class MensagemImagem extends Mensagem {
	private int altura;
	private int largura;

	public MensagemImagem(String arquivoImagem, int largura, int altura){
		this.texto = arquivoImagem;
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public String getRepresentacao(){
		String saida = "";
		saida += this.texto + " " + this.largura + "x" + this.altura;
		Mensagem p = this.pergunta;
		while(p != null){
			saida += " RESPOSTA A [" + p.texto + " " + p.largura + "X" + p.altura + "] ";
			p = p.pergunta;
		}
		saida += "(likes=" + this.likes + ")";
		return saida
	}
}