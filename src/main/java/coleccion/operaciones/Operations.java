package coleccion.operaciones;

public class Operations {
    private Object[] operators = new Operation[10];

    public void add(Object operator) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == null) {
                operators[i] = operator;

                return;
            }
        }
        return;
    }

    public void reset() {
        for (int i = 0; i < operators.length; i++) {
            operators[i] = null;
        }
    }

    // MAL DISEÑADO... MAL CODIFICADO
    public int total() {
    	
    	
        int result = 0;
        String separator = "";
        
        for (Object operando : operators) {
            if (operando != null) {
                System.out.print(separator + operando.toString());
                result+=((Operation) operando).execute();
            }
            separator = "+";
        }
        System.out.print(">>> ");
        return result;
    }
}
