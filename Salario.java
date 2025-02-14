package exercicios;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double horas, valorHora, bruto, inss, liquido;
		
		System.out.println("Insira o total de horas trabalhadas: ");
		horas = entrada.nextDouble();
		System.out.println("Insira seu valor/hora R$: ");
		valorHora = entrada.nextDouble();
		
		bruto = horas * valorHora;
		inss = (bruto/100) * 12;
		liquido = bruto - inss;
		
		System.out.println("Salário bruto R$: " + bruto);
		System.out.println("Salário líquido R$: " + liquido);
		System.out.println("Desconto do INSS R$: " + inss);
	}

}
