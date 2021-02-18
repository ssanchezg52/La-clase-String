package teoria;


public class Constructores04 {
	// Como no se de donde viene la cadena
	public boolean hayZetas(CharSequence cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.toLowerCase(cadena.charAt(i)) == 'z')
				return true;
		}
		return false;
	}
	public boolean hayZetasBis(String cadena){
		return cadena.contains("z");
	}

	public static void main(String[] args) {
		StringBuffer uno = new StringBuffer();
		StringBuffer dos = new StringBuffer(80);
		StringBuffer tres = new StringBuffer("Godofredo");
		Constructores04 instancia=new Constructores04();
		System.out.println("longitudes " + uno.length() + " " + dos.length() + " " + tres.length());
		System.out.println("longitudes " + uno.capacity() + " " + dos.capacity() + " " + tres.capacity());
		String cosa = "si hay zeta";
		StringBuilder cosaBuilder = new StringBuilder("hay zeta");
		StringBuffer cosaBuffer = new StringBuffer("no ha ceta");
		System.out.println("hay zetas "+instancia.hayZetas(cosa)+ " "+
		instancia.hayZetas(cosaBuffer)+" "+instancia.hayZetas(cosaBuilder));
		System.out.println("hay zetas "+instancia.hayZetasBis(cosa)+ " "+
			instancia.hayZetasBis(cosaBuffer.toString())+" "
				+instancia.hayZetasBis(cosaBuilder.toString()));
	}


}
