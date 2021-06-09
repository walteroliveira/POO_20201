public class ContaCorrente {
	private String nome;
	private double saldo;
	public static int qtdeContas = 0; 

	public ContaCorrente(String nome){
		this.nome = nome;
		this.saldo = 0.0;
		++qtdeContas;
	}

	public ContaCorrente(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
		++qtdeContas;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public String getTitular(){
		return this.nome;
	}

	public boolean depositar(double valor){
		if(valor > 0 ){
			this.saldo += valor;
			return true;
		}
		return false;
	}

	public boolean sacar(double valor){
		if(valor > 0 && valor <= this.saldo){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor){
		if(de != null && para != null){
			if(valor <= de.getSaldo() ){
				de.sacar(valor);
				para.depositar(valor);
				return true;
			}	
		}
		return false;
	}
	public static int getQuantidadeContas(){
		return qtdeContas;
	}
	
}