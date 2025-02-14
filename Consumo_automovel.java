package exercicios;

import java.util.Scanner;

public class Consumo_automovel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double distancia, litros, consumo;
		
		System.out.println("Informe a distância percorrida em Km: ");
		distancia = entrada.nextDouble();
		
		System.out.println("Informe a quantidade de litros gastos: ");
		litros = entrada.nextDouble();
		
		consumo = distancia/litros;
		
		System.out.println("O consumo do carro em Km/l é " + consumo);

	}

}
