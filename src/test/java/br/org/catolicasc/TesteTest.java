package br.org.catolicasc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteTest {

	@Test
	public void teste1() {
		assertTrue(true);
	}
	
	@Test 
	public void somaSucesso() {
		assertEquals(3, soma(2,1));
	}
	
	@Test 
	public void somaErro() {
		assertNotEquals(1, soma(3,1));
	}
	
	@Test 
	public void diminuiSucesso() {
		assertEquals(3, diminui(6,3));
	}
	
	@Test 
	public void diminuiErro() {
		assertNotEquals(1, diminui(2,1));
	}
	
	public int soma(int valor1, int valor2 ) {
		return valor1+valor2; 
	}
	
	public int diminui(int valor1, int valor2 ) {
		return valor1-valor2; 
	}
}
