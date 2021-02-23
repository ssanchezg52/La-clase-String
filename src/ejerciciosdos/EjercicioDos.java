package ejerciciosdos;

public class EjercicioDos {

	/**
	 * cuenta las ocurrencias de un caracter
	 * @param cadena donde buscar
	 * @param caracter lo que buscar
	 * @return el numero de ocurrencias
	 */
	public int encuentraCaracter(String cadena,char caracter) {
		int posicion=cadena.indexOf(caracter);
		int contador=0;
		while(posicion!=-1) {
			contador++;
			posicion=cadena.indexOf(caracter, posicion+1);
		}
		return contador;
	}
}
