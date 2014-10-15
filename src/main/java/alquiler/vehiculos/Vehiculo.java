package alquiler.vehiculos;

public abstract class Vehiculo {
	protected int id;
	protected String desc;

	public Vehiculo(final int id, final String desc) {
        this.id = id;
        this.desc = desc;
    }
	
	public abstract double coste(int dias);
	
}
