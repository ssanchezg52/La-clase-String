package ejerciciosdos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjercicioDosTest {

	@Test
	void testEncuentraCaracter() {
		EjercicioDos ejerDos=new EjercicioDos();
		String cadena[]={"la primera vez","la primera vez"};
		char letra[]={'a','x'};
		int resultado[]= {2,0};
		for (int i = 0; i < resultado.length; i++) {
			assertEquals(resultado[i], ejerDos.encuentraCaracter(cadena[i], letra[i]));
		}
	}

}
