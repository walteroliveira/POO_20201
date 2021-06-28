package criptografia;

public class CifraCesar implements Cifra{
	private int nShifts;

	public CifraCesar(int nShifts){
		this.nShifts = nShifts;
	}	

	public String cifrar(String mensagem){
		String cifrada = "";
		for(int i = 0; i < mensagem.length(); i++){
			int ascii = mensagem.charAt(i);
			if(ascii != 32){
				for(int j = 0; j < nShifts; j++){
					ascii++;
					if(ascii == 123)
						ascii = 97;
				}
			}

			cifrada += (char)ascii;
		}
		return cifrada;
	}
	public String decifrar(String mensagem){
		String decifrada = "";
		for(int i = 0; i < mensagem.length(); i++){
			int ascii = mensagem.charAt(i);
			if(ascii != 32){
				for(int j = 0; j < nShifts; j++){
					ascii--;
					if(ascii == 96)
						ascii = 122;
				}
			}
			decifrada += (char)ascii;
		}
		return decifrada;
	}
}