package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCCCTest {
	private static double DELTA = 0.05;
	private CalculadoraCCC calculadoraCCC;
	private CalculadoraCFC calculadoraCFC;
	

	@BeforeEach
	public void setUp() {
	}
	
	@Test
	public void testNiobio() {
		calculadoraCCC = new CalculadoraCCC("Nióbio");
		double densidade = calculadoraCCC.calcula(92.91, 0.143);
		assertEquals(8.57, densidade, DELTA);	
	}
	
	@Test
	public void testCobre() {
		calculadoraCFC = new CalculadoraCFC("Cobre");
		double densidade = calculadoraCFC.calcula(63.55, 0.128);
		assertEquals(8.89, densidade, DELTA);	
	}
	
	@Test
	public void testTungstenio() {
		calculadoraCCC = new CalculadoraCCC("Tungstênio");
		double densidade = calculadoraCCC.calcula(183.84, 0.137);
		assertEquals(19.28, densidade, DELTA);	
	}
	
	@Test
	public void testOuro() {
		calculadoraCFC = new CalculadoraCFC("Ouro");
		double densidade = calculadoraCFC.calcula(196.97, 0.144);
		assertEquals(19.36, densidade, DELTA);	
	}
	
	@Test
	public void testLitio() {
		calculadoraCCC = new CalculadoraCCC("Lítio");
		double densidade = calculadoraCCC.calcula(6.94, 0.152);
		assertEquals(0.53, densidade, DELTA);	
	}
	
	@Test
	public void testPrata() {
		calculadoraCFC = new CalculadoraCFC("Prata");
		double densidade = calculadoraCFC.calcula(107.87, 0.144);
		assertEquals(10.60, densidade, DELTA);	
	}
	

}
