package ejerciciosdos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjercicioUnoTest {
	
	@Test
	void testCuentaMayusculasYMinusculas() {
		//Vectores Ortogonales
		String cadenaString[]= {"a","A","","123456","A   ¡È  a"," ,.@12W==o"};
		int[] resultados[]= {{0,1},{1,0},{0,0},{0,0},{2,2},{1,1}};
		for (int i = 0; i < resultados.length; i++) {
			assertArrayEquals(resultados[i], EjercicioUno.cuentaMayusculasYMinusculasOld(cadenaString[i]));
		}
	}
	@Test
	void testCuentaMayusculasYMinusculasNew() {
		//Vectores Ortogonales
		String cadenaString[]= {"a","A","","123456","A   ¡È  a"," ,.@12W==o"};
//		int[] resultados[]= {{0,1},{1,0},{0,0},{0,0},{2,2},{1,1}};
		ContadorLetras resultados[]= {
				new ContadorLetras(0,1),
				new ContadorLetras(1,0),
				new ContadorLetras(0,0),
				new ContadorLetras(0,0),
				new ContadorLetras(2,2),
				new ContadorLetras(1,1)};
		for (int i = 0; i < resultados.length; i++) {
			assertTrue(resultados[i].equals(EjercicioUno.cuentaMayusculasYMinusculas(cadenaString[i])));
		}
	}
}
