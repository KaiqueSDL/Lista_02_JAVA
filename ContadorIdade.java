package lista02;

import java.util.Scanner;

public class IdadeDias {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos anos completos voce tem: ");
		
		int anos = sc.nextInt() * 365;
		
		System.out.println("Quantos meses completos voce tem:  ");
		
		int meses = sc.nextInt() * 30;
		
		System.out.println("Quantos dias completos voce tem: ");
		
		int dias = sc.nextInt();
		
		int idade = anos+meses+dias;
		System.out.println("A sua idade em dias é de: "+idade);
		sc.close();
	}

}
