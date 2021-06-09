public class Paralelogramo {
	private int ladoA;
	private int ladoB;

	public Paralelogramo(int ladoA){
		this.ladoA = ladoA;
		this.ladoB = ladoA;
	}

	public Paralelogramo(int ladoA, int ladoB){
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public int getArea(){
		return ladoA * ladoB;
	}

	public String getTipo(){
		if(ladoA == ladoB)
			return "Paralelogramo quadrado";
		else
			return "Paralelogramo retangulo";
	}	

}