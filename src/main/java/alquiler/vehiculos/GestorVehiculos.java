package alquiler.vehiculos;

import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {
	private int id =0;
	private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	
	public void nuevaMoto(String desc){
		id++;
		vehiculos.add(new Moto(id,desc));
	}
	
	public void nuevoCoche(String desc, Categoria cat){
		id++;
		vehiculos.add(new Coche(id,desc,cat));
	}
	
	public void nuevaBici(String desc){
		id++;
		vehiculos.add(new Bicicleta(id,desc));
	}
	
	public List<Vehiculo> listar(){
		return vehiculos;
	}
	
	public double calculaPrecio(int id, int dias){
		return vehiculos.get(id).coste(dias);		
	}
	
}
