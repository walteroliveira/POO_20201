package universidade;


public class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected String vinculo = "Sem vinculo com a UFABC";

	public void setNomeSobrenome(String nome, String sobrenome){
		this. nome = nome;
		this.sobrenome = sobrenome;
	}	

	public String getEmail() {
		return this.nome + "." + this.sobrenome + "@dominio.generico.com.br";
	}

	public String getVinculo() {
		return this.vinculo;
	}



}