package navegador;

public abstract class AbaNavegador {
	protected String titulo;

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo(){
		return this.titulo;
	}

	public abstract String getTipo();
}