package alquiler.vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CocheTest {

@Test
public void testCoste(){
	Coche coche = new Coche(2,"Test",Categoria.A);
	assertEquals(30, coche.coste(3),10e-2);
	assertEquals(38, coche.coste(4),10e-2);
	assertEquals(67, coche.coste(8),10e-2);
	
	coche = new Coche(2,"Test",Categoria.B);
	assertEquals(45, coche.coste(3),10e-2);
	assertEquals(57, coche.coste(4),10e-2);
	assertEquals(100.5, coche.coste(8),10e-2);
	
	coche = new Coche(2,"Test",Categoria.C);
	assertEquals(60, coche.coste(3),10e-2);
	assertEquals(76, coche.coste(4),10e-2);
	assertEquals(134, coche.coste(8),10e-2);
}


}
