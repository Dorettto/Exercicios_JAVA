package exercicios;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double volume, raio, altura;
		
		System.out.println("Insira o raio da lata: ");
		raio = entrada.nextDouble();
		
		System.out.println("Insira a altura da lata: ");
		altura = entrada.nextDouble();
		
		volume = 3.14159 * raio * raio * altura;
		
		System.out.println("O volume da lata é: " + volume);

	}

}
