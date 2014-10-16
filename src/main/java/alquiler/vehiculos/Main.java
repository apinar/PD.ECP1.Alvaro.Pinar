package alquiler.vehiculos;
import alquiler.vehiculos.Controlador;
import upm.jbb.IO;


public class Main {

	public static void main(String[] args) {
			Controlador c = new Controlador();
			IO.in.addController(c);
		}

}
