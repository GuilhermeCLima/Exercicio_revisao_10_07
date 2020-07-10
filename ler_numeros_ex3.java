package cursojava;

import java.util.Scanner;

public class ler_numeros_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner (System.in);
		int num,cont1 = 0,cont2 = 0,cont3 = 0,cont4 = 0;
		
		do {
			System.out.println("Digite numeros:");
			num = dados.nextInt();
			if( num > 0 && num < 25) {
				cont1++;
			}
			if( num > 26 && num < 50) {
				cont2++;
			}
			if( num > 51 && num < 75) {
				cont3++;
			}
			if( num > 76 && num < 100) {
				cont4++;
			}
			
		}while(num > -1);
		
		System.out.println("no intervalo de 0 a 25 é:" + cont1);
		System.out.println("no intervalo de 26 a 75 é:" + cont2);
		System.out.println("no intervalo de 51 a 75 é:" + cont3);
		System.out.println("no intervalo de 76 a 100 é:" + cont4);
	}

}
