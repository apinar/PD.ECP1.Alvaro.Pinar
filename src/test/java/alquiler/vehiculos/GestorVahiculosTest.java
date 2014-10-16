package alquiler.vehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorVahiculosTest {
	private GestorVehiculos gv;
	
@Before
public void before() {
	gv = new GestorVehiculos();
}
	
@Test
public void testNuevaMoto(){
	gv.nuevaMoto("Moto1");
	assertEquals("Moto1",gv.listar().get(0).getDesc());
	assertEquals(40.0,gv.calculaPrecio(0, 5),10e-2);
}

@Test
public void testNuevoCoche(){
	gv.nuevoCoche("Coche1",Categoria.A);
	assertEquals("Coche1",gv.listar().get(0).getDesc());
	assertEquals(30.0,gv.calculaPrecio(0,3),10e-2);	
}

@Test
public void testNuevaBici(){
	gv.nuevaBici("Bici1");
	assertEquals("Bici1",gv.listar().get(0).getDesc());
	assertEquals(8,gv.calculaPrecio(0,3),10e-2);	
}


}
