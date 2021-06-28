public class TesteCifra {
	public static void main(String[] args){
		CifraCesar teste = new CifraCesar(2);
		System.out.println(teste.cifrar("abc z"));
		System.out.println(teste.decifrar(teste.cifrar("abc z")));

	}

}