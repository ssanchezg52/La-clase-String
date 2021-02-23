package ejerciciosuno;

public class EjercicioCatorce {
	public static void main(String[] args) {
		String cadena = "Espero la carambola que me saque de este agujero negro";
		// Podemos usar esta interface, que se parece a String, usala solo
		// cuando se te pida en algún método, pero como ves puedes usar String
		CharSequence jaleo = cadena.subSequence(0, 19);
		String jaleo2 = jaleo.toString();
		System.out.println("subacadenar: " + jaleo);
		StringBuilder sitrin=new StringBuilder(jaleo);
		System.out.println("usando string " + jaleo2);

	}
}
