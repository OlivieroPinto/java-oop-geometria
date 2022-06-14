package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rettangolo lati = new Rettangolo();
		System.out.println("Inserisci lati del rettangolo:");
		Scanner scan = new Scanner(System.in);
		lati.base = scan.nextInt();
		lati.altezza = scan.nextInt();
		System.out.println("l'area del rettangolo é: " + lati.calcoloArea(lati.base, lati.altezza));
		System.out.println("mentre il perimetro é: " + lati.calcoloPerimetro(lati.base, lati.altezza));
		scan.close();

	}

}
