package exercicios;

import java.util.Scanner;

public class Media_ponderada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int prova1, prova2, media;
		
		System.out.println("Insira a nota da primeira prova: ");
		prova1 = entrada.nextInt();
		
		System.out.println("Insira a nota da segunda prova: ");
		prova2 = entrada.nextInt();
		
		media = ((prova1*4) + (prova2*6))/10;
		
		System.out.println("Sua média é: " + media);

	}

}
