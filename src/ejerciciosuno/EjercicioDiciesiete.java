package ejerciciosuno;


public class EjercicioDiciesiete {
	public static void main(String[] args) {
		String cadena = "Espero la carambola que me saque de este agujero negro";
		int tamano=cadena.length();
		/*
		 * La unica diferencia entre substring y subsequence es el tipo de retorno
		 * En subsequence se obtiene un charSequence que es una interface
		 */
		if(tamano>=20)
		System.out.println("subacadenar por el final: " + cadena.substring(tamano-20, tamano));
	}
}
