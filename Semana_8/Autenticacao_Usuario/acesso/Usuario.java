package acesso;

public class Usuario {
	public String login;
	public String senha;
	public int tentativas = 2;
	public Usuario(String login, String senha){
		this.login = login;
		this.senha = senha;
	}

	public String getLogin(){
		return this.login;
	}

	public void autenticar(String senha) throws SenhaInvalida, UsuarioBloqueado{
		if(this.senha != senha)
			throw new SenhaInvalida();
		if(this.tentativas > 2)
			throw new UsuarioBloqueado();
	}

}