package Madfut;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CreadorCartas.ejecuta();
		System.out.println("\nWelcome to PinFut 2026 (BASED ON FC 26)");
		System.out.println("--------OPTIONS----------");
		System.out.println("| 1. Abrir Packs Gratis |");
		System.out.println("| 2. Colección de Packs |");
		System.out.println("| 3. Jugar Partido      |");
		System.out.println("| 4. Colección          |");
		System.out.println("| 5. Tienda             |");
		
		System.out.print("Introduce un número para continuar: ");
		int numero = teclado.nextInt();
		Pack.abrirPackGratis();
	}
}
