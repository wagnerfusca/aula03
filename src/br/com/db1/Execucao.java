package br.com.db1;

import java.util.List;
import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		System.out.println("Digite um valor inteiro at� 100");
		Scanner scanner = new Scanner(System.in);
		Integer valorDigitado = scanner.nextInt();
		System.out.println("o valor digitado �: "+ valorDigitado);
		
		Inteiro inteiro = new Inteiro();
		List<Integer> impares = inteiro.retornaImpares(valorDigitado);
		for (Integer valor:impares){
			System.out.println(valor);
		}		
	}
}
