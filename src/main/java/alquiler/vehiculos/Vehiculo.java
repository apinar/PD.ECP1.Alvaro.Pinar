package alquiler.vehiculos;

public abstract class Vehiculo {
	protected int id;
	protected String desc;

	
	public abstract double coste(int dias);
	
}
