package teoria;

public class Constructores01 {
	public static void main(String[] args) {
		String uno = new String();
		byte[] cosa={89,111,112};
		String dos=new String(cosa);
		char[] letrasSeparada={'h','o','l','a'};
		uno=letrasSeparada.toString();
		System.out.println(uno);
		String cuatro=new String(letrasSeparada);
		System.out.println(cuatro);
		//La clase String no es modificable
		cuatro=cuatro+" que tal?";
		System.out.println(cuatro);
	}
}
