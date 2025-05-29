public class Calculator {
    private double a;
    private double b;
    private BasicOperation basicOperation;
    private MathPow mathPow;

    public Calculator() {
        basicOperation = new BasicOperation();
        mathPow = new MathPow();
    }

    private double validInput(String input) throws CalculatorException{
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new CalculatorException("Entrada inválida: " + input + " no es un número real.");
        }
    }

    public void setA(String a) throws CalculatorException {
        this.a = validInput(a);
    }

    public void setB(String b) throws CalculatorException {
        this.b = validInput(b);
    }

    public double addition(){
        return basicOperation.addition(a,b);
    }

    public double subtraction(){
        return basicOperation.subtraction(a,b);
    }

    public double multiply(){
        return basicOperation.multiply(a,b);
    }

    public double split() throws CalculatorException {
        return basicOperation.split(a,b);
    }

    public double square() throws CalculatorException {
        return mathPow.square(a);
    }

    public double power() throws CalculatorException {
        return mathPow.power(a,b);
    }
}
