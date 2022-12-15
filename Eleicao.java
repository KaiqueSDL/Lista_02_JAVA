package lista02;

import java.util.Scanner;

public class votacaoEleitores {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Toal eleitores : ");
		int eleitores = sc.nextInt();
		
		System.out.println("Votos em branco");
		float brancos = sc.nextFloat() / eleitores*100;
		
		System.out.println("Votos em nulos ");
		float nulos = sc.nextFloat() / eleitores*100;
		
		System.out.println("Votos em validos ");
		float validos = sc.nextFloat() / eleitores*100;
		
		System.out.println("Brancos --  "+ brancos);
		
		System.out.println("NUlos -- : "+ nulos);
		
		System.out.println("validos --  "+validos);
		
		sc.close();
	}

}
