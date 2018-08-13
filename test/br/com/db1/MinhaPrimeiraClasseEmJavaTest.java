package br.com.db1;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinhaPrimeiraClasseEmJavaTest {

	@Test
	public void ehParTest(){
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		assertTrue(primeiraClasse.ehPar(2));
		assertFalse(primeiraClasse.ehPar(3));
		assertTrue(primeiraClasse.ehPar(10));
	
	}
	
	@Test
	public void ehMaiorTest(){
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		assertTrue(primeiraClasse.ehMaior(10, 5));
		assertFalse(primeiraClasse.ehMaior(22, 30));

	}
	
}


