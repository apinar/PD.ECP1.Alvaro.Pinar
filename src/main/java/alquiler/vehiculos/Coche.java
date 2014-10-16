package alquiler.vehiculos;

public class Coche extends Vehiculo{
	private static double descuento1=0.8;
	private static double descuento2=0.5;
	
	private Categoria categoria;
	
	
	public Coche(int id, String desc, Categoria a) {
		super(id,desc);
		this.setCategoria(a);
	}

	private double calculoCoste(int dias){
		double result;
		if (dias <= 3){
			result=dias;
		} else if (dias <= 7){
			result= 3 + (dias-3) * descuento1;
		} else
			result= 3 + 4 * descuento1 + (dias - 7) * descuento2; 
		
		return result;
	}
	

	private double precio_categoria(Categoria cat) {
		double precio = 0;
		switch (cat) {
        case A:
                precio=10;
                break;
        case B:
                precio=15;
                break;
        case C:
                precio=20;
                break;        
}		
		return precio;
	}
	
	
	@Override
	public double coste(int dias) {
		return calculoCoste(dias)*precio_categoria(this.categoria);
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
