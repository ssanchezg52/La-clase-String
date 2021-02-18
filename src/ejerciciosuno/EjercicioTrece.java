package ejerciciosuno;

public class EjercicioTrece {
	public static void main(String[] args) {
		String cadena = "la.cosa.es.que.vamos.a.hacer.muchos.trocitos";
		char punto = '.';
		//Tan solo hay que usar el parametro limit. Estudia el resultado
		String resultado[] = cadena.split("\\"+Character.toString(punto),3);
		System.out.println("tamaño resultado " + resultado.length);
		for (int i = 0; i < resultado.length; i++) {
			System.out.println("cadena  numero " + i + " " + resultado[i]);
		}
	}

}
