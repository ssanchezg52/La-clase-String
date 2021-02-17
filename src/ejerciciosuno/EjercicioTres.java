package ejerciciosuno;


public class EjercicioTres {

	public static void main(String[] args) {
		// 3.	Une dos cadenas i.p.t. usando el método concat()
		String nuevoString="hola";
		//"hola" es un objeto. primero se crea y luego se le 
		"hola".equals(nuevoString);
		String nuevoStringDos=new String("hola");
		String otraString="que tal";
		String concat = nuevoString.concat(" ".concat(otraString));
		String nuevaCosaString="hola"+" "+"que tal";
		String otraCosa=nuevoStringDos+" "+otraString;
	}

}
