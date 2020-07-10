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
		
		
		System.out.println("1 À vista em dinheiro ou cheque, recebe 20% de desconto ");
		System.out.println("2 À vista no cartão de crédito, recebe 15% de desconto  ");
		System.out.println("3 Em duas vezes, preço normal de etiqueta sem juros   ");
		System.out.println("4 Em três vezes, preço normal de etiqueta mais juros de 10%   ");
		opcao = produto.nextInt();
		
		switch(opcao) {
		
		case 1 :
			totalPago = preco -(preco * 0.2);
			System.out.println("O preço pago é:" + totalPago);
			break;
		case 2 :
			totalPago = preco - (preco * 0.15);
			System.out.println("O preço pago é:" + totalPago);
			break;
		case 3 :
			duasVezes = preco / 2;
			System.out.println("Suas parcelas são:" + duasVezes);
			break;
		case 4 :
			totalPago = (preco + (preco * 0.1)) / 3;
			System.out.println("Suas parcelas são:" + totalPago);
			break;
		}
	}

}
