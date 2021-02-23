package ejerciciosdos;

public class EjercicioUno {


	/**
	 * cuenta las mayusculas y minusculas que aparecen 
	 * en un texto
	 * @param cadena string que vamos a analizar
	 * @return un vector de dos elementos, el primero
	 * con la cuenta de mayusculas y el segundo con la cuenta 
	 * de minusculas
	 */
	public static int[] cuentaMayusculasYMinusculasOld(String cadena) {
		int tamano=2;
		int[] retorno=new int[tamano];
//		for (int i = 0; i < cadena.length(); i++) {
//			char charAt = cadena.charAt(i);
//		}
		for (char letra : cadena.toCharArray()) {
			if(Character.isLetter(letra)) {
				if(Character.isUpperCase(letra)) {
					retorno[0]++;
				}else {
					retorno[1]++;
				}
			}
		}
		return retorno;
	}

	public static ContadorLetras cuentaMayusculasYMinusculas(String cadena) {
		ContadorLetras contadorLetras=new ContadorLetras();
//		for (int i = 0; i < cadena.length(); i++) {
//			char charAt = cadena.charAt(i);
//		}
		for (char letra : cadena.toCharArray()) {
			if(Character.isLetter(letra)) {
				if(Character.isUpperCase(letra)) {
					contadorLetras.mayusculas++;
				}else {
					contadorLetras.minusculas++;
				}
			}
		}
		return contadorLetras;
	}
}
