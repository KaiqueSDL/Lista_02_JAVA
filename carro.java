package lista02;

import java.util.Scanner;

public class CustoCarro {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Custo de fabrica do carro: ");
		
		float fabrica = sc.nextInt();
		
		float distribuidor = fabrica*28/100;
		
		float imp = fabrica*45/100;
		
		float total = fabrica+distribuidor+imp;
		System.out.println("O valor a ser pago no carro é de: "+total);
		sc.close();
	}

}
