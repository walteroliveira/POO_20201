package acesso;

public class UsuarioBloqueado extends Exception {
	public UsuarioBloqueado(){
		super("Usuario Bloqueado");
	}
}