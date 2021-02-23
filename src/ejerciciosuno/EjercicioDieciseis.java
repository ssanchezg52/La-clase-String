package ejerciciosuno;

public class EjercicioDieciseis {
	public static void main(String[] args) {
		String cadena = "Espero";
		int tamano = cadena.length();
		// Me aseguro de que la cadena es mayor de 20
		if (tamano >= 20)
			System.out.println("subacadenar por el final: " + cadena.subSequence(tamano - 20, tamano));
		else
			System.out.println("la cadena es muy corta");
	}
}
