package ejerciciosuno;

public class EjercicioUno {
	public static void main(String[] args) {
		String cadena1 = "Hola";
		String cadena2 = "Hola";
		String cadena3 = new String("Hola");
		if (cadena1 == cadena2) {
			System.out.println("son el mismo");
		} else {
			System.out.println("no son el mismo");
		}
		if (cadena1 == cadena3) {
			System.out.println("son el mismo");
		} else {
			System.out.println("no son el mismo");
		}
		if (cadena1.equals(cadena3))
			System.out.println("son iguales por dentro");
		// Como comparo si uso el metodo compareTo?
		String cadena4 = new String("Ipla");
		// Expresa la distancia entre las dos primeras letras diferentes o 0
		// si son iguales
		System.out.println(cadena3.compareTo(cadena4));
		String cadena5 = new String("Hnpla");
		System.out.println(cadena3.compareTo(cadena5));
		System.out.println(cadena3.compareTo(cadena1));
		// Usar matches
		System.out.println(cadena1.matches(cadena3));
		cadena5 = "Hola";
		String cadena6 = "hola";
		System.out.println(cadena5.compareToIgnoreCase(cadena6));
	}
}
