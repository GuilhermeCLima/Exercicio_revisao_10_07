package cursojava;

import java.util.Scanner;

public class produto_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner produto = new Scanner (System.in);
		
		float preco;
		int caso = 0, opcao;
		double totalPago = 0,duasVezes = 0;

		System.out.println("Digite o valor do seu produto:");
		preco = produto.nextFloat();
		
		
		System.out.println("1 � vista em dinheiro ou cheque, recebe 20% de desconto ");
		System.out.println("2 � vista no cart�o de cr�dito, recebe 15% de desconto  ");
		System.out.println("3 Em duas vezes, pre�o normal de etiqueta sem juros   ");
		System.out.println("4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%   ");
		opcao = produto.nextInt();
		
		switch(opcao) {
		
		case 1 :
			totalPago = preco -(preco * 0.2);
			System.out.println("O pre�o pago �:" + totalPago);
			break;
		case 2 :
			totalPago = preco - (preco * 0.15);
			System.out.println("O pre�o pago �:" + totalPago);
			break;
		case 3 :
			duasVezes = preco / 2;
			System.out.println("Suas parcelas s�o:" + duasVezes);
			break;
		case 4 :
			totalPago = (preco + (preco * 0.1)) / 3;
			System.out.println("Suas parcelas s�o:" + totalPago);
			break;
		}
	}

}
