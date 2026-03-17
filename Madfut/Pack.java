package Madfut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Pack {
	private String tipo;
	private ArrayList<Carta> cartas = new ArrayList<>();

	public Pack(String tipo) {
		this.tipo = tipo;
	}

	public static void abrirPackGratis() {
		ArrayList<Carta> sobre = new ArrayList<>();
		HashSet<Integer> numeros = new HashSet<>();
		do {
			int numero = (int) (Math.random() * ((Coleccion.colCompleta.size() - 1) - 0 + 1) + 0);
			Carta carta = Coleccion.colCompleta.get(numero);
			System.out.println(carta.getNombre());
			int prob = carta.getProbabilidad();
			int numero2 = (int) ((Math.random() * 100) + 1);
			if (numero2 <= prob)
				numeros.add(numero);
		} while (numeros.size() != 2);

		ArrayList<Integer> numerosReal = new ArrayList<>(numeros);
		Collections.shuffle(numerosReal);
		System.out.println(numerosReal);
		for (int i = 0; i < numerosReal.size(); i++)
			sobre.add(Coleccion.colCompleta.get(numerosReal.get(i)));
		System.out.println("Las cartas del pack son:");
		for (Carta c : sobre) {
			System.out.printf(" - %s: %d\n", c.getNombre(), c.getProbabilidad());
		}

	}

	public void abrirPack() {

	}
}
