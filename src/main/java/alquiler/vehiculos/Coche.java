package alquiler.vehiculos;

public class Coche extends Vehiculo{
	private Categoria categoria;
	
	public Coche(int id, String desc) {
		super(id,desc);
	}

	public Coche(int id, String desc, Categoria a) {
		super(id,desc);
		this.setCategoria(a);
	}

	@Override
	public double coste(int dias) {
		// TODO Auto-generated method stub
		return 0;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
