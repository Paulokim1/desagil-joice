package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	private static String nome;
	private double densidade;

	public CalculadoraCCC() {
		super(nome);
		this.densidade = 0;
		
	}
	

	@Override
	public double calcula(double peso, double raio) {
		double constante = 6.023*Math.pow(10, 23);
		double volume = Math.pow(4*raio*Math.pow(10, -7)*Math.sqrt(3)/3, 3);
		this.densidade = (2*peso)/(volume*constante); 
		return (this.densidade*100)/100;
	}

}
