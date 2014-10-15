package coleccion.operaciones;

public class Summation extends Operation {

    public Summation(final int operator1, final int operator2) {
    	super(operator1,operator2);
    }

    @Override
    public String toString() {
        return "[" + operator1 + "+" + operator2 + "]";
    }

	@Override
	public int execute() {
		return this.operator1 + this.operator2;
	}

}
