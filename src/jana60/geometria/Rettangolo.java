package jana60.geometria;

public class Rettangolo {
	int base, altezza;

	int calcoloArea(int base, int altezza) {
		int calcoloArea = base * altezza;
		return calcoloArea;
	}

	int calcoloPerimetro(int base, int altezza) {
		int calcoloPerimetro = (base + altezza) * 2;
		return calcoloPerimetro;
	}
}
