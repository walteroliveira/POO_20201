public class CrachaFuncionario extends Cracha{

	private String cargo;
	private int m;
	private int a;

	public void setCargo(String cargo){
		this.cargo = cargo;
	}

	public void setDataAdmissao(int m, int a){
		this.m = m;
		this.a = a;
	}
	@Override
	public void imprimir(){
	    Impressao.imprimirLinha("FUNCIONARIO");
		Impressao.imprimirLinha("Nome: " + this.nome);
		Impressao.imprimirLinha("Cargo: " + this.cargo);
		Impressao.imprimirLinha("Admissao: " + this.m + "/" + this.a);
	}

}