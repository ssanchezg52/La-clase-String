package ejerciciosuno;


public class EjercicioSeis {

	public static void main(String[] args) {
		/*
		 * 6.	Repite el ejercicio anterior para 
		 * una cadena en vez de una letra
		 */
		String cadenaString = "no por mucho madrugar se hace solo el cafe"
				+ "a menos que no tengas una cafetera automatica";
		String letra ="no";
		System.out.println(cadenaString.indexOf(letra));
		int posicion = 0;
		do {
			posicion=cadenaString.indexOf(letra,posicion);
			System.out.println(posicion);
			posicion++;
		}while(posicion<cadenaString.length()&&posicion!=0);
		System.out.println();
	}

}
