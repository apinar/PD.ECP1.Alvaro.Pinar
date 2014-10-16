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
		IO.out.clear();
		IO.out.println(gv.listar());		
	}
	
	public void costeAlquiler(){
		int id = (int) IO.in.select(0,gv.getId()-1,"Vehículo alquilado");
		int dias = IO.in.readInt("Días Alquiler"); 
		IO.out.clear();
		IO.out.println("Precio del alquiler: "+gv.calculaPrecio(id, dias)+"€");
	}

}
