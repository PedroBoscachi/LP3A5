package ex3;

public class Circulo extends FormaGeometrica{
	private double raio;
	
	@Override
	public double calcularArea() {
		return Math.PI * (raio * raio);
	}
}
