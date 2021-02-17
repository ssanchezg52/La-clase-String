package ejerciciosuno;


public class EjercicioCinco {

	public static void main(String[] args) {
		/*
		 * 5. Usando los métodos indexOf() realiza un programa que busque una letra
		 * i.p.t. en una cadena i.p.t. Debe imprimir las posiciones de la cadena en las
		 * que ocurre esta circunstancia
		 */
		String cadenaString="no por mucho madrugar se hace solo el cafe"+
		 "a menos que tengas una cafetera automatica";
		char letra='o';
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
