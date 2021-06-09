package matematica;

public class Fracao {
	private int numerador;
	private int denominador;

	private int mdc(int n1, int n2){
		if(n2 == 0)
			return n1;
		else{
			return mdc(n2, n1 % n2);
		}
	}
	public Fracao(){
		this.numerador = 1;
		this.denominador = 1;
	}

	public Fracao(int numerador){
		this.numerador = numerador;
		this.denominador = 1;
	}

	public Fracao(int numerador, int denominador){

		this.numerador = numerador / mdc(numerador, denominador);
		this.denominador = denominador / mdc(numerador, denominador);
	}

	public String getRepresentacao(){
		return (numerador + "/" + denominador);
	}

	public Fracao somar(Fracao f2){
		int newDenominador = this.denominador * f2.denominador;
		int newNumerador = (newDenominador/this.denominador)*this.numerador + (newDenominador/f2.denominador)*f2.numerador;
		Fracao newFracao = new Fracao(newNumerador, newDenominador);
		return newFracao;
	}

	public static Fracao somar(Fracao f1, Fracao f2){
		int newDenominador = f1.denominador * f2.denominador;
		int newNumerador = (newDenominador/f1.denominador)*f1.numerador + (newDenominador/f2.denominador)*f2.numerador;
		Fracao newFracao = new Fracao(newNumerador, newDenominador);
		return newFracao;
	}


	public static Fracao somar(Fracao[] fracoes){
		int newNumerador = 0;
		int newDenominador = 1;
		for(int i = 0; i < fracoes.length; i++){
			newDenominador *= fracoes[i].denominador;
		}
		for(int i = 0; i < fracoes.length; i++){
			newNumerador += (newDenominador/fracoes[i].denominador)*fracoes[i].numerador; 
		}
		Fracao newFracao = new Fracao(newNumerador, newDenominador);
		return newFracao;
	}

	public static Fracao multiplicar(Fracao f1, Fracao f2){
		Fracao newFracao = new Fracao(f1.numerador * f2.numerador, f1.denominador * f2.denominador);
		return newFracao;
	}
}