public class Operacoes {
	private int a;
	private int b;
	private int c;
	private Integer min = null;
	private Integer max = null; 
	private void atualizaExtremos(int op){
		if(min == null)
			min = op;
		else if (op < min)
			min = op;
		if(max == null)
			max = op;
		else if (op > max)
			max = op;
	}
	
	public void setA(int a){
		this.a = a;
	}
	public void setB(int b){
		this.b = b;
	}
	public void setC(int c){
		this.c = c;
	}
	public int soma2(){
		atualizaExtremos(this.a + this.b);
		return this.a + this.b;
	}
	public int soma3(){
		atualizaExtremos(this.a + this.b + this.c);
		return this.a + this.b + this.c;
	}
	public int multiplica(){
		atualizaExtremos(this.a * this.b);
		return this.a * this.b;
	}

	public int getMin(){
		return min;
	}
	public int getMax(){
		return max;	
	}
}
