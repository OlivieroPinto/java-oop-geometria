package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// int area[] = new int[5];
		int numeromassimo = 0;
		Rettangolo lati = new Rettangolo();
		System.out.println("Inserisci lati del rettangolo:");
		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			lati.base = scan.nextInt();
			lati.altezza = scan.nextInt();
			if (lati.calcoloArea(lati.base, lati.altezza) >= numeromassimo) {
				numeromassimo = lati.calcoloArea(lati.base, lati.altezza);
			}
			// area[i] = lati.calcoloArea(lati.base, lati.altezza);
			// System.out.println(area[i]);
		}
		// System.out.println("l'area del rettangolo é: " + lati.calcoloArea(lati.base,
		// lati.altezza));
		// System.out.println("mentre il perimetro é: " +
		// lati.calcoloPerimetro(lati.base, lati.altezza));
		// scan.close();

		// for (int i = 0; i < 5; i++) {
		// if (area[i] > numeromassimo) {
		// numeromassimo = area[i];
		// }
		// }
		System.out.println("il rettangolo piu grande ha area di " + numeromassimo);
	}
}
