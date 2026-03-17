package Madfut;

public class Estadistica {
	private String nombre;
	private int valor;
	
	public Estadistica(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public Estadistica cambiarValor(int numero) {
		this.valor = numero;
		return this;
	}
}
