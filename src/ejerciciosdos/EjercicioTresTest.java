package ejerciciosdos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjercicioTresTest {

	@Test
	void testEsPalindroma() {
		EjercicioTres ejerTres=new EjercicioTres();
		String cadena[]={"rapar","ordenador","Ana"};
		boolean resultado[]= {true,false,true};
		for (int i = 0; i < resultado.length; i++) {
			assertEquals(resultado[i], ejerTres.esPalindroma(cadena[i]));
		}
	}

}
