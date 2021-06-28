package criptografia;

public class ZenitPolar implements Cifra{
	public String cifrar(String mensagem){
		String cifrada = "";
		for(int i = 0; i < mensagem.length(); i++){
			switch (mensagem.charAt(i)){
				case 'z':
					cifrada += "p";
					break;
				case 'e':
					cifrada += "o";
					break;
				case 'n':
					cifrada += "l";
					break;
				case 'i':
					cifrada += "a";
					break;
				case 't':
					cifrada += "r";
					break;
				case 'p':
					cifrada += "z";
					break;
				case 'o':
					cifrada += "e";
					break;
				case 'l':
					cifrada += "n";
					break;
				case 'a':
					cifrada += "i";
					break;
				case 'r':
					cifrada += "t";
					break;
				default:
					cifrada += mensagem.charAt(i);
			}
			
		}
		return cifrada;
	}

	public String decifrar(String mensagem){
		return cifrar(mensagem);
	}
}