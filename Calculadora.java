package br.com.fiap;

public class Calculadora {
	
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		try {
			if (num2 > 0) {
				this.num2 = num2;
			} else {
				throw new Exception ("Esse número não pode ser escolhido.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void soma(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
		int soma = (getNum1() + getNum2());
		System.out.println("\nA soma dos números é: " + soma);
	}
	
	public void subtracao(int num1, int num2) {
		int subtracao = (getNum1() - getNum2());
		System.out.println("\nA subtração dos números é: " + subtracao);
	}
	
	public void multiplicacao(int num1, int num2) {
		int multiplicacao = (getNum1() * getNum2());
		System.out.println("\nA multiplicação dos números é: " + multiplicacao);
	}

	public void divisao(int num1, int num2) {
		int divisao = (getNum1() / getNum2());
		System.out.println("\nA divisão dos números é: " + divisao);
	}



}
