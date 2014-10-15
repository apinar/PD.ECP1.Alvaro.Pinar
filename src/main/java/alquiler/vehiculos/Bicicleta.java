package alquiler.vehiculos;

public class Bicicleta extends Vehiculo{
	private static double precio_standard=3;
	private static double precio_rebaja=2;

	public Bicicleta(int id, String desc) {
		super(id,desc);
	}

	@Override
	public double coste(int dias) {
		double result;
		if (dias <=2){
			result=dias*precio_standard;
		} else{
			result=2*precio_standard+(dias-2)*precio_rebaja;
		}
		return result;
	}

}
