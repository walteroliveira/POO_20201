public class CrachaEstudante extends Cracha{

	private String curso;

	public void setCurso(String curso){
		this.curso = curso;
	}

	@Override
	public void imprimir(){
	    Impressao.imprimirLinha("ESTUDANTE");
		Impressao.imprimirLinha("Nome: " + this.nome);
		Impressao.imprimirLinha("Curso: " + this.curso);
	}

}