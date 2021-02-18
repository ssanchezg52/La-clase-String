package ejerciciosuno;

public class EjercicioOcho {
	/*
	 * Lo unico que hay que tener en cuenta es que empezamos a buscar por el
	 * final y terminamos de buscar en la posicion 0
	 */
	public static void main(String[] args) {
		String cadena="Una cadena llena de aes para buscar";
		//Lo unico que debes tener en cuenta es que comenzamos
		//en la posicion final, que se puede saber así:
		int posicion=cadena.lastIndexOf('a');
		//comienzo del bucle
		while(posicion!=-1){		
			System.out.println("posicion: "+posicion);
			posicion=cadena.lastIndexOf('a', posicion-1);
		}
		//Creo que te será facil hacerlo para cadenas
		//Lo mismo pero usando do
		posicion=cadena.length();
		do {
			posicion=cadena.lastIndexOf('a', posicion-1);
			System.out.println("posicion: "+posicion);
		}while(posicion!=-1);
	}
}
