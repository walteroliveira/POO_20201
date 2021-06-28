public class TesteCifra {
	public static void main(String[] args){
		ZenitPolar teste = new ZenitPolar();
		System.out.println(teste.cifrar("abc z"));
		System.out.println(teste.decifrar(teste.cifrar("abc z")));

	}

}