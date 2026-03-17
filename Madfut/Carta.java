package Madfut;

import java.util.ArrayList;
import java.util.Iterator;

public class Carta {
	private String nombre;
	private String posicion;
	private String tipo;
	private int probabilidad;
	private int media;
	private boolean pillada = false;
	private ArrayList<Estadistica> stats = new ArrayList<>();

	public Carta(String nombre, String posicion, String tipo, int probabilidad) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.tipo = tipo;
		this.probabilidad = probabilidad;
		Coleccion.colCompleta.add(this);
	}

	public void setEstadisticas(Estadistica e1, Estadistica e2, Estadistica e3, Estadistica e4, Estadistica e5,
			Estadistica e6) {
		this.stats.add(e1);
		this.stats.add(e2);
		this.stats.add(e3);
		this.stats.add(e4);
		this.stats.add(e5);
		this.stats.add(e6);
	}

	public void getMedia() {
		double media = 0;
		String posicion = this.posicion.toLowerCase();
		switch (posicion) {
		case "cb": {
			media = (this.stats.get(0).getValor() * 0.15 + this.stats.get(1).getValor() * 0.05
					+ this.stats.get(2).getValor() * 0.1 + this.stats.get(3).getValor() * 0.05
					+ this.stats.get(4).getValor() * 0.40 + this.stats.get(5).getValor() * 0.25) * 1.08;
			break;
		}
		case "rb": {
			media = (this.stats.get(0).getValor() * 0.3 + this.stats.get(1).getValor() * 0.05
					+ this.stats.get(2).getValor() * 0.15 + this.stats.get(3).getValor() * 0.05
					+ this.stats.get(4).getValor() * 0.30 + this.stats.get(5).getValor() * 0.15) * 1.03;
			break;
		}
		case "lb": {
			media = (this.stats.get(0).getValor() * 0.3 + this.stats.get(1).getValor() * 0.05
					+ this.stats.get(2).getValor() * 0.15 + this.stats.get(3).getValor() * 0.05
					+ this.stats.get(4).getValor() * 0.30 + this.stats.get(5).getValor() * 0.15) * 1.03;
			break;
		}
		case "cdm": {
			media = (this.stats.get(0).getValor() * 0.1 + this.stats.get(1).getValor() * 0.05
					+ this.stats.get(2).getValor() * 0.2 + this.stats.get(3).getValor() * 0.1
					+ this.stats.get(4).getValor() * 0.3 + this.stats.get(5).getValor() * 0.25) * 1.04;
			break;
		}
		case "cam": {
			media = (this.stats.get(0).getValor() * 0.15 + this.stats.get(1).getValor() * 0.2
					+ this.stats.get(2).getValor() * 0.3 + this.stats.get(3).getValor() * 0.25
					+ this.stats.get(4).getValor() * 0.05 + this.stats.get(5).getValor() * 0.05) * 1.06;
			break;
		}
		case "cf": {

		}
		case "cm": {
			media = (this.stats.get(0).getValor() * 0.05 + this.stats.get(1).getValor() * 0.05
					+ this.stats.get(2).getValor() * 0.3 + this.stats.get(3).getValor() * 0.25
					+ this.stats.get(4).getValor() * 0.2 + this.stats.get(5).getValor() * 0.15) * 1.04;
			break;
		}
		case "lm": {

		}
		case "rm": {

		}
		case "lw": {
			media = (this.stats.get(0).getValor() * 0.35 + this.stats.get(1).getValor() * 0.15
					+ this.stats.get(2).getValor() * 0.15 + this.stats.get(3).getValor() * 0.3
					+ this.stats.get(4).getValor() * 0.03 + this.stats.get(5).getValor() * 0.02) * 1.02;
			break;
		}
		case "rw": {
			media = (this.stats.get(0).getValor() * 0.35 + this.stats.get(1).getValor() * 0.15
					+ this.stats.get(2).getValor() * 0.15 + this.stats.get(3).getValor() * 0.3
					+ this.stats.get(4).getValor() * 0.03 + this.stats.get(5).getValor() * 0.02) * 1.02;
			break;
		}
		case "st": {
			media = (this.stats.get(0).getValor() * 0.2 + this.stats.get(1).getValor() * 0.35
					+ this.stats.get(2).getValor() * 0.1 + this.stats.get(3).getValor() * 0.15
					+ this.stats.get(4).getValor() * 0.05 + this.stats.get(5).getValor() * 0.15) * 1.07;
			break;
		}
		}
		this.media = (int) (Math.round(media * 100d) / 100d);
	}

	public void getEstadisticas() {
		System.out.println(this.nombre);
		for (int i = 0; i < this.stats.size(); i++) {
			if (i == this.stats.size() - 1)
				System.out.print(this.stats.get(i).getNombre() + " " + this.stats.get(i).getValor());
			else
				System.out.print(this.stats.get(i).getNombre() + " " + this.stats.get(i).getValor() + " - ");
		}
	}

	public int getM() {
		return this.media;
	}
	public int getProbabilidad() {
		return this.probabilidad;
	}
	public String getNombre() {
		return this.nombre;
	}
}
