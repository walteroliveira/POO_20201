package cartoes;

public class CartaoLimitado extends CartaoCredito{
	public boolean pagarComCredito(double valor){
		if(this.credito + valor > 200){
			return false;
		}
		this.credito += valor;
		return true;
	}	
}