package teoria;

public class StringNoModificable03 {
public static void main(String[] args) {
	String cosa="cosica";
	String cosaDoString="cosica";
	//Vamos a demostrar que no es moodificable
	cosa+=" apellido";
	System.out.println(cosa.replace("apellido", "berengeno"));
	System.out.println(cosa);
	//Puedo modicar el string sobreescribiendo la cadena
	cosa=cosa.replace("apellido", "berenjena");
	System.out.println(cosa);
}
}
