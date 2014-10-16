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
	
	public String listar(){
		String info = "";
		for (Vehiculo v : vehiculos){
			info=info + v.getId()+". "+v.getDesc()+"\n";
		}
		return info;
	}
	
	public double calculaPrecio(int id, int dias){
		return vehiculos.get(id).coste(dias);		
	}
	
	public int getId(){
		return id;
	}
	
	public List<Vehiculo> getVehiculos(){
		return vehiculos;
	}
}
