package br.com.db1;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class InteiroTest {

	@Test
	public void exercicio7Test(){
		Inteiro inteiro = new Inteiro();
		List<Integer> impares =  inteiro.retornaImpares(93);

		assertTrue(impares.get(0) == 93);
		assertTrue(impares.get(1) == 95);
		assertTrue(impares.get(2) == 97);
		assertTrue(impares.get(3) == 99);
		assertTrue(impares.size() == 4);
		
	}	
}
