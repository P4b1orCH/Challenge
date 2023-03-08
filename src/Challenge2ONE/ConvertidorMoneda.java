package Challenge2ONE;

import java.util.Scanner;

public class ConvertidorMoneda {

	static double BolivarVenezuela = 2432984.263228;
	static double Dolar = 1;
	static double DolarAustraliano = 1.486774;
	static double DolarCanadiense = 1.363745;
	static double Euro = 0.94798;
	static double FrancoSuizo = 0.94048;
	static double LibraEsterlina = 0.836855;
	static double PesoArgentino = 195.00977;
	static double PesoChileno = 823.076879;
	static double PesoColombiano = 4841.983637;
	static double PesoMexicano = 18.386741;
	static double RealBrazileño = 5.209989;
	static double RupiaIndia = 82.932903;
	static double Wonsurcoreano = 1314.79508;
	static double YenJapones = 136.479476;
	static double YuanChino = 6.956042;

	public static void main(String[] args) {

		Externa:
		while (true) {
			System.out.println("Conversor de moneda");
			System.out.println("1 Pesos Mexicanos a dolares\n" + "2 Pesos Colombianos a dolares\n"
					+ "3 Pesos Chileno a dolares\n" + "4 Salir");
			System.out.println("Ingrese una opcion: ");
			Scanner leer = new Scanner(System.in);
			char Opcion = leer.next().charAt(0);

			switch (Opcion) {
			case '1':
				convertir(PesoMexicano, "Pesos Mexicanos");
				// System.out.println();
				break;
			case '2':
				convertir(PesoColombiano, "Pesos Colombianos");
				// System.out.println();
				break;
			case '3':
				convertir(PesoChileno, "Pesos Chileno");
				// System.out.println();
				break;
			case '4':
				System.out.println("Cerrando programa");
				break Externa;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}
	}

	static void convertir(double Tasa, String Moneda) {
		Scanner leer = new Scanner(System.in);
		System.out.printf("ingrese la cantidad de %s: ", Moneda);
		double MonedaOrigen = leer.nextDouble();

		double MonedaDestino = MonedaOrigen * (1/Tasa);

		System.out.println("Tienes: " + Math.round(MonedaDestino*100.0)/100.0 + " Dolares");
	}

}
