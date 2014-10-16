package alquiler.vehiculos;

import upm.jbb.IO;

public class Controlador {
	private GestorVehiculos gv = new GestorVehiculos();
	
	public void altaCoche(){
		gv.nuevoCoche(IO.in.readString(), (Categoria)IO.in.read(Categoria.class,""));	
	}
	
	
	public void altaMoto(){
		gv.nuevaMoto(IO.in.readString());
	}
	
	public void altaBicicleta(){
		gv.nuevaBici(IO.in.readString());
	}
	
	
	public void verVehiculos(){
		IO.out.println(gv.listar().toString());
		
	}
	

}
