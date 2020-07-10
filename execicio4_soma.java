package cursojava;

import java.util.Scanner;

public class execicio4_soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);
		float soma = 0,num = 1,total = 0;
		
		for(int i = 1;i <= 50;i++) {
			
			soma = num /i;
			total = total + soma;
			num = num + 2;
		}
		System.out.println("A soma dos numeros é:" + total);
	}

}
