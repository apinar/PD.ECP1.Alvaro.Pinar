import alquiler.vehiculos.Controlador;
import upm.jbb.IO;


public class Main {

	public static void main(String[] args) {
			Controlador c = new Controlador();
			
			//IO.in.readInt();
			IO.in.addController(c);
		}

}
