package cursojava;

import java.util.Scanner;

public class imc_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);
		int peso;
		double altura,imc = 0;
		
		System.out.println("Digite seu peso:");
		peso = dados.nextInt();
		System.out.println("Digite sua altura:");
		altura = dados.nextDouble();
		
		imc = peso / (altura * altura);
		if(imc < 18.5) {
			System.out.println("Você esta abaixo do texto!");
		}
		if(imc > 18.5 && imc < 25) {
			
			System.out.println("Seu peso esta normal");
		}
		if(imc > 25 && imc < 30) {
			System.out.println("Você esta acima do peso");
		}
		else if(imc > 30) {
			
			System.out.println("Você esta acima do peso");
		}
	}

}
