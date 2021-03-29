package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora{
	private double densidade;

	public CalculadoraCFC() {
		super("Cúbica de Face Centrada");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double constante = 6.023*Math.pow(10, 23);
		double volume = Math.pow(2*raio*Math.pow(10, -7)*Math.sqrt(2), 3);
		this.densidade = (4*peso)/(volume*constante); 
		return (this.densidade*100)/100;
	}

}
