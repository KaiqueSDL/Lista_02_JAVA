package lista02;

import java.util.Scanner;

public class ListrosUsados {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas durou?  ");
		int horas = sc.nextInt();
		
		System.out.println("Velocidade Media?  ");
		int velocidade = sc.nextInt();
		
		int distancia = horas*velocidade;
		
		float litrosUsados = distancia/12f;
		
		System.out.println("Tempo gasto "+horas);
		System.out.println("A velocidade média de: "+velocidade);
		System.out.println("A distância : "+distancia);
		System.out.println("A quantidade de litros utilizados:  "+litrosUsados);
		sc.close();
	}
	
}
