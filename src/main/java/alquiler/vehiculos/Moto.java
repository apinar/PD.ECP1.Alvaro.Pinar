package alquiler.vehiculos;

public class Moto extends Vehiculo{
	private static double precio_standard=8;
	private static double precio_rebaja=7;
	
	public Moto(int id, String desc) {
		super(id,desc);
	}

	@Override
	public double coste(int dias) {
		double result;
		if (dias <= 7) {
			result= dias * precio_standard;
		} else {
			result = 7 * precio_standard + (dias-7) * precio_rebaja;
		}
		return result;
	}

}
