package Challenge2ONE;

public class ConvertidorDivisas2 {
	//TC
	double BolivarVenezuela = 2432984.263228;
	double Dolar = 1;
	double DolarAustraliano = 1.486774;
	double DolarCanadiense = 1.363745;
	double Euro = 0.94798;
	double FrancoSuizo = 0.94048;
	double LibraEsterlina = 0.836855;
	double PesoArgentino = 195.00977;
	double PesoChileno = 823.076879;
	double PesoColombiano = 4841.983637;
	double PesoMexicano = 18.386741;
	double RealBrazileño = 5.209989;
	double RupiaIndia = 82.932903;
	double Wonsurcoreano = 1314.79508;
	double YenJapones = 136.479476;
	double YuanChino = 6.956042;
	
	public static void main(String[] args) {

	}
	 
	public void convertidor( String monedaPais) {
		System.out.println();
		double MonedaOrigen = BolivarVenezuela;
		double MonedaDestino = YuanChino;
		double TasaDeConversion= MonedaDestino/MonedaOrigen;
		double MonedaConversion = MonedaOrigen * (TasaDeConversion);
		System.out.println(MonedaConversion + monedaPais);

	}

}
