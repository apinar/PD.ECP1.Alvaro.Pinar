package coleccion.operaciones;

public class Multiplication extends Operation{

	
	public Multiplication(int operator1, int operator2) {
		super(operator1, operator2);
	}

	@Override
    public String toString() {
        return "[" + operator1 + "x" + operator2 + "]";
    }
	
	@Override
	public int execute() {
		return this.operator1 * this.operator2;
	}
	

}
