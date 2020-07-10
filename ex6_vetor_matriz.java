package cursojava;

import java.util.Scanner;

public class ex6_vetor_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);

		int[] vet = new int[3];
		int[][] mat = new int[3][3];
		int[] vetResul = new int[3];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite numeros para o vetor:");
			vet[i] = dados.nextInt();
		}
		System.out.println("------------------------------------------------");
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {

				System.out.println("Digite valores para a matriz:");
				mat[i][j] = dados.nextInt();
			}
		}
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {

				vetResul[i] = vetResul[i] + vet[j] * mat[i][j];
			}

		}
		System.out.print("[");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vetResul[i] + ",");
		}
		System.out.print("]");
	}
}
