package alquiler.vehiculos;

import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {
	private int id =0;
	private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	
	public void nuevaMoto(String desc){
		vehiculos.add(new Moto(id,desc));
		id++;
	}
	
	public void nuevoCoche(String desc, Categoria cat){
		vehiculos.add(new Coche(id,desc,cat));
		id++;
	}
	
	public void nuevaBici(String desc){
		vehiculos.add(new Bicicleta(id,desc));
		id++;
	}
	
	public List<Vehiculo> listar(){
		return vehiculos;
	}
	
	public double calculaPrecio(int id, int dias){
		return vehiculos.get(id).coste(dias);		
	}
	
}
