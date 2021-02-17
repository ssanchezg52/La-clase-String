package teoria;

public class Envoltorio02 {
public static void main(String[] args) {
	char letra='a';
	//Un envoltorio sirve para dar mas funcionalidades a un tipo primitivos
	Character chara=new Character(letra);
	System.out.println(Character.isLetter(chara));
	System.out.println(Character.isDigit(chara));
	System.out.println(Character.isDigit(letra));
	System.out.println(chara.charValue());
	
}
}
