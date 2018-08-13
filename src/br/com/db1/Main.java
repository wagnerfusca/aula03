package br.com.db1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("digite um valor:");
		Scanner s = new Scanner(System.in);
		Integer variavel = s.nextInt();
		
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		System.out.println(primeiraClasse.ehPar(variavel));
		

		
	}
}
