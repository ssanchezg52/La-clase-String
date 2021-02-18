package ejerciciosuno;


public class EjercicioOnce {

	public static void main(String[] args) {
		String cadenaString="esta cadena prueba el funcionamiento "+
	"de un metodo corte que vamos a cortejar enseguida";
		String cambio="corte";
		String[] split = cadenaString.split(cambio);
		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			System.out.println(string);
		}
		//Pero si solo queremos dos partes podemos establecer un limite
		int maximaCantidadPartes=2;
		split = cadenaString.split(cambio,maximaCantidadPartes);
		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			System.out.println(string);
		}
	}

}
