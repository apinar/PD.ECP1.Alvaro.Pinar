package coleccion.operaciones;

public class Addition extends Operation {
    private final int operator1=0, operator2=0;

    public Addition(final int operator1, final int operator2) {
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
