package lista02;

import java.util.Scanner;

public class LataOleo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Raio da lata : ");
		
		int raio = sc.nextInt();
		
		System.out.println("Altura Lata :  ");
		int altura = sc.nextInt();
		
		float pi = 3.14f;
		
		float volume = pi * (raio*raio) * altura;
		
		System.out.println("Volume:  "+volume);
		sc.close();
	}
	
}
