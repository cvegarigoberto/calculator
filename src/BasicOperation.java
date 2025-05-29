public class BasicOperation {

    public BasicOperation() {
    }

    public double addition(double a, double b){
        return a+b;
    }

    public double subtraction(double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double split(double a, double b) throws CalculatorException{
        if (b == 0) {
            throw new CalculatorException("Error: No se puede dividir entre cero.");
        }
        return a/b;
    }


}
