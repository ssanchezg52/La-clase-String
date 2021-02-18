package ejerciciosuno;


public class EjercicioDoce {

	public static void main(String[] args) {
		String cadena="la.cosa.es.que.vamos.a.hacer.muchos.trocitos";
		String punto=".";
		//Que pasa si tengo un char pero solo puedo poner string
		char puntillo='.';
		punto=String.valueOf(puntillo);
		//La secuencia de escape hace que un elemento pierda
		//su significado y se vuelva literal
		String[] split = cadena.split("\\"+punto);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

}
