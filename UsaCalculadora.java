package br.com.fiap;

import java.util.Scanner;

public class UsaCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int escolha = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do primeiro número: ");
			calc.setNum1(scan.nextInt());
			System.out.println("Digite o valor do segundo número: ");
			calc.setNum2(scan.nextInt());
			
			System.out.println("\n O que deseja fazer com eles? Faça sua escolha: "
					+ "\n(1) Somar os números."
					+ "\n(2) Subtrair os números."
					+ "\n(3) Multiplicar os números."
					+ "\n(4) Dividir os números.");
			escolha = scan.nextInt();
			
			if (escolha == 1) {
				calc.soma(calc.getNum1(), calc.getNum2());
			} else if (escolha == 2) {
				calc.subtracao(calc.getNum1(), calc.getNum2());
			} else if (escolha == 3) {
				calc.multiplicacao(calc.getNum1(), calc.getNum2()); 
			} else if (escolha == 4) {
				calc.divisao(calc.getNum1(), calc.getNum2());
			} else {
				System.out.println("Opção incorreta.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
