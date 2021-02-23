package ejerciciosuno;


public class EjercicioQuince {
public static void main(String[] args) {
	StringBuilder cad;
	String cadena = " agujero negro";
//	String cadena = "Espero la carambola que me saque de este agujero negro";
	int tamano=cadena.length();
	CharSequence jaleo = null;
	//Me aseguro de que la cadena es mayor de 20
	if(tamano>=20)
		jaleo=cadena.subSequence(tamano-20, tamano);
	else
		jaleo=new String("Errorazo");
	System.out.println("subacadenar por el final: " + jaleo.toString());
}
}
