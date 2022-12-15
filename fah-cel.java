package lista02;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Temp em Farenheit:");
		
		float farenheit = sc.nextFloat();
		
		float celsius = (farenheit-32)*5/9;
		
		System.out.println("Temperatura em Celsius:  "+celsius);
		sc.close();
	}
	
}
