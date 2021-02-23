package ejerciciosuno;

public class EjercicioDieciochoAnexo {
public static void main(String[] args) {
	StringBuilder cadena1=new StringBuilder("primera");
	String cadena2=new String(cadena1);
	System.out.println(cadena1);
	System.out.println(cadena2);
	if(cadena1.toString()!=cadena2) {
		System.out.println("son diferentes");
	}
	if(!cadena1.equals(cadena2)) {
		System.out.println("son diferentes");
	}
	if(cadena1.toString().equals(cadena2)) {
		System.out.println("son iguales");
	}
	//modificar el builder
	cadena1.trimToSize();
	if(!cadena1.equals(cadena2)) {
		System.out.println("son diferentes");
	}
	if(cadena2.equals(cadena1)) {
		System.out.println("son iguales");
	}
}
}
