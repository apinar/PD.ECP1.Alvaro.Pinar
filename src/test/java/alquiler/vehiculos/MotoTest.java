package alquiler.vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MotoTest {
	
@Test
public void testCoste(){
	Moto moto = new Moto (1,"Test");
	assertEquals(40, moto.coste(5),10e-2);
	assertEquals(56, moto.coste(7),10e-2);
	assertEquals(70, moto.coste(10),10e-2);
	
}
	
}
