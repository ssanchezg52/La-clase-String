package teoria;

public class ProbarStringBuffer05 {
	public static void main(String[] args) {
		StringBuffer lorito=new StringBuffer("Hace una buena manana");
		lorito.replace(0, 8, "poco");
		System.out.println(lorito);
		String caballa=new String("Hace una manana regulera");
		//Lo hace pero no lo guarda
		System.out.println(caballa.replace('a','u'));	
		System.out.println(caballa);
//		//Para modificar hacemos algo muy costoso
		caballa=caballa.replace('a','u');	
		System.out.println(caballa);
//		//añadir desde una posicion
		lorito.insert(0, caballa);
		System.out.println(lorito);
//		//Reemplaza una por otra
		lorito.replace(0, lorito.length(), caballa);
		System.out.println(lorito);
//		//añadir al final
		lorito.append(caballa);
		lorito.append("final");
		System.out.println(lorito);
	}
}
