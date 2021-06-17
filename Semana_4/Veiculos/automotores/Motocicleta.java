package automotores;

public class Motocicleta extends Veiculo{
	private boolean  temCarroLateral;

	@Override
	public String getTipo(){
		return "Motocicleta modelo " + this.modelo;
	}

	public void setTemCarroLateral(boolean temCarroLateral){
		this.temCarroLateral = temCarroLateral;
	}
	public boolean getTemCarroLateral(){
		return this.temCarroLateral;
	}
}