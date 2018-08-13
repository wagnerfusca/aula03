package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class Inteiro {

	public List<Integer> retornaImpares(Integer valorInicial) {
		List<Integer> impares = new ArrayList<>();
		percorreLista(valorInicial, impares);
		return impares;
	}

	private void percorreLista(Integer valorInicial, List<Integer> impares) {
		for(Integer contador = valorInicial; contador < 100; contador++){
			validaEhPar(impares, contador);
		}
	}

	private void validaEhPar(List<Integer> impares, Integer contador) {
		if(contador % 2 != 0){
			impares.add(contador);
		}
	}

	
}
