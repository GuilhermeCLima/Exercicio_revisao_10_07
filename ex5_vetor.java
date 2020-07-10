package cursojava;

import java.util.Scanner;

public class ex5_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);
		double[] num = { 1, 2, 3, 4, 5 };
		double[] inv = new double[5];
		int cod;
		double salva = 0;

		System.out.println("Digite uma numero:");
		cod = dados.nextInt();

		switch (cod) {

		case 0:
			break;
		case 1:
			for (int i = 0; i < num.length; i++) {

				System.out.print(num[i] + "|");
			}
			break;
		case 2:
				for (int i = 4; i >= 0; i--) {
					
					System.out.print(num[i] + "|");
			}
			break;
		default:

			System.out.println("opção invalida");
		}
	}
}
