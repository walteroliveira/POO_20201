public class TesteOperacoes {
	public static void main(String[] args) {
		System.out.println("Passou");
		Operacoes teste = new Operacoes();
		
		teste.setA(2);
		teste.setB(3);
		teste.setC(4);
		System.out.println(teste.soma2());
		System.out.println(teste.soma3());
		System.out.println(teste.multiplica());
		System.out.println(teste.getMax());
		System.out.println(teste.getMin());		

	}
}