public class MathPow {

    private final double SQUARE_ROOT = 0.5;
    private double result;

    public MathPow() {
    }

    public double square(double a) throws CalculatorException{
        if (a < 0) {
            throw new CalculatorException("Error: Con este metodo, no es posible calcular raiz cuadrada negativa");
        }
        return Math.pow(a, SQUARE_ROOT);
    }

    public double power(double a, double b) throws CalculatorException {
        try {
            return Math.pow(a, b);
        } catch (NumberFormatException e) {
            throw new CalculatorException("Entrada inválida");
        }
    }

    public double getResult() {
        return result;
    }
}
