package Madfut;

public class CreadorCartas {
	public static void ejecuta() {
		Estadistica e1 = new Estadistica("PAC", 87);
		Estadistica e2 = new Estadistica("SHO", 50);
		Estadistica e3 = new Estadistica("PAS", 78);
		Estadistica e4 = new Estadistica("DRI", 81);
		Estadistica e5 = new Estadistica("DEF", 94);
		Estadistica e6 = new Estadistica("PHY", 90);

		Carta toty1 = new Carta("Saliba", "CB", "TOTY", 100);
		toty1.setEstadisticas(e1, e2, e3, e4, e5, e6);
		toty1.getEstadisticas();
		toty1.getMedia();
		System.out.println(" " + toty1.getM());

		Carta toty2 = new Carta("Hakimi", "RB", "TOTY", 90);
		toty2.setEstadisticas(e1.cambiarValor(98), e2.cambiarValor(89), e3.cambiarValor(95), e4.cambiarValor(94),
				e5.cambiarValor(92), e6.cambiarValor(90));
		toty2.getEstadisticas();
		toty2.getMedia();
		System.out.println(" " + toty2.getM());

		Carta toty3 = new Carta("Nuno Mendes", "LB", "TOTY", 80);
		toty3.setEstadisticas(e1.cambiarValor(97), e2.cambiarValor(86), e3.cambiarValor(87), e4.cambiarValor(94),
				e5.cambiarValor(94), e6.cambiarValor(93));
		toty3.getEstadisticas();
		toty3.getMedia();
		System.out.println(" " + toty3.getM());

		Carta toty4 = new Carta("Dembele", "ST", "TOTY", 70);
		toty4.setEstadisticas(e1.cambiarValor(99), e2.cambiarValor(94), e3.cambiarValor(90), e4.cambiarValor(98),
				e5.cambiarValor(59), e6.cambiarValor(77));
		toty4.getEstadisticas();
		toty4.getMedia();
		System.out.println(" " + toty4.getM());

		Carta toty5 = new Carta("Mbappé", "ST", "TOTY", 60);
		toty5.setEstadisticas(e1.cambiarValor(99), e2.cambiarValor(98), e3.cambiarValor(90), e4.cambiarValor(98),
				e5.cambiarValor(47), e6.cambiarValor(88));
		toty5.getEstadisticas();
		toty5.getMedia();
		System.out.println(" " + toty5.getM());

		Carta toty6 = new Carta("Raphinha", "LW", "TOTY", 50);
		toty6.setEstadisticas(e1.cambiarValor(98), e2.cambiarValor(93), e3.cambiarValor(92), e4.cambiarValor(97),
				e5.cambiarValor(66), e6.cambiarValor(86));
		toty6.getEstadisticas();
		toty6.getMedia();
		System.out.println(" " + toty6.getM());

		Carta toty7 = new Carta("Rice", "CDM", "TOTY", 40);
		toty7.setEstadisticas(e1.cambiarValor(88), e2.cambiarValor(85), e3.cambiarValor(94), e4.cambiarValor(90),
				e5.cambiarValor(90), e6.cambiarValor(92));
		toty7.getEstadisticas();
		toty7.getMedia();
		System.out.println(" " + toty7.getM());

		Carta toty8 = new Carta("Pedri", "CM", "TOTY", 30);
		toty8.setEstadisticas(e1.cambiarValor(92), e2.cambiarValor(89), e3.cambiarValor(94), e4.cambiarValor(98),
				e5.cambiarValor(90), e6.cambiarValor(88));
		toty8.getEstadisticas();
		toty8.getMedia();
		System.out.println(" " + toty8.getM());

		Carta toty9 = new Carta("Vitinha", "CM", "TOTY", 20);
		toty9.setEstadisticas(e1.cambiarValor(93), e2.cambiarValor(91), e3.cambiarValor(96), e4.cambiarValor(98),
				e5.cambiarValor(88), e6.cambiarValor(85));
		toty9.getEstadisticas();
		toty9.getMedia();
		System.out.println(" " + toty9.getM());

		Carta thunderstruck1 = new Carta("Bellingham", "CAM", "Thunderstruck", 10);
		thunderstruck1.setEstadisticas(e1.cambiarValor(82), e2.cambiarValor(88), e3.cambiarValor(85),
				e4.cambiarValor(92), e5.cambiarValor(82), e6.cambiarValor(87));
		thunderstruck1.getEstadisticas();
		thunderstruck1.getMedia();
		System.out.println(" " + thunderstruck1.getM());
	}
}
