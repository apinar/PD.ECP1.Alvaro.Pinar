package alquiler.vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BicicletaTest {

@Test
public void testCoste(){
	Bicicleta bici = new Bicicleta(3,"Test");
	assertEquals(6, bici.coste(2),10e-2);
	assertEquals(8, bici.coste(3),10e-2);
	assertEquals(12, bici.coste(5),10e-2);
	
}
	
}
