package com.atividadedapm.strategy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			
			System.out.println("[ Calculadora de Fretes - Strategy Pattern]");
			System.out.println("[ Aluno: Cleverson Mendes Faria]");
			System.out.println();
			
			System.out.print("Informe o Km (distância) p/ entrega: ");
			int km = entrada.nextInt();
			
			System.out.println();
			System.out.println("Tipos de Fretes");
			System.out.println("[1] PAC-Normal");
			System.out.println("[2] Sedex");
			System.out.println("[3] Sedex 10");
			System.out.println("[4] Sedex Hoje");
			System.out.println();
			System.out.print("Selecione o Tipo de Frete: ");
			int opcaoFrete = entrada.nextInt();
			
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
			Frete frete = tipoFrete.obterFrete();
			double total = frete.calcularPreco(km);
			System.out.printf("O Valor Total do Frete é de R$%.2f", total);
			
		}
	}
	
}
