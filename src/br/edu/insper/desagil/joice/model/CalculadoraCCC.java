package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	private double densidade;

	public CalculadoraCCC(String nome) {
		super(nome);
		this.densidade = 0;
		
	}
	

	@Override
	public double calcula(double peso, double raio) {
		double constante = 6.023*Math.pow(10, 23);
		double massa = (6*peso)/(constante); 
		double volume = Math.pow(2*raio*Math.pow(10, 7)*Math.sqrt(2), 3);
		this.densidade = massa/volume; 
		return this.densidade;
	}

}
