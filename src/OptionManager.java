import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionManager {
    private static OptionManager instace;
    private final String ADDITION_OPTION = "Suma de dos numeros (a+b).";
    private final String SUBTRACTION_OPTION = "Resta de dos numeros (a-b).";
    private final String MULTIPLY_OPTION = "Producto de dos numero (a*b).";
    private final String SPLIT_OPTION = "Division entre dos numeros (a/b).";
    private final String POWER_OPTION = "Potencia de un numero elevado a otro (a elevado b).";
    private final String SQUARE_ROOT_OPTION = "Raiz cuadrada de un numero (Raiz cuadrada de a).";
    private final String CLOSE_OPTION = "Cerrar el programa.";
    private final String NO_VALID_OPTION = "Operación no reconocida";
    private final String CHOOSE_OPTION = "Elije la operacion que deseas usar.";
    private final String A_KEY = "a";
    private final String B_KEY = "b";

    private Map<String, String> mapOption;
    private Scanner scanner;
    private Calculator calculator;

    private OptionManager() {
        mapOption = new HashMap<String, String>();
        scanner = new Scanner(System.in);
        calculator = new Calculator();
        operationOptions();
    }

    public static OptionManager getInstace() {
        if(instace==null){
            instace = new OptionManager();
        }
        return instace;
    }

    public void closeScannerInstance(){
        scanner.close();
        System.out.println("Scanner cerrado");
    }

    private void operationOptions(){
        mapOption.put("1",ADDITION_OPTION);
        mapOption.put("2",SUBTRACTION_OPTION);
        mapOption.put("3",MULTIPLY_OPTION);
        mapOption.put("4",SPLIT_OPTION);
        mapOption.put("5",POWER_OPTION);
        mapOption.put("6",SQUARE_ROOT_OPTION);
        mapOption.put("c",CLOSE_OPTION);
    }

    public void mainMenu(){
        System.out.println(" ");
        System.out.println(CHOOSE_OPTION);
        mapOption.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        });
        System.out.println(" ");
    }

    private String inputNumber(String num){
        System.out.println("Ingrese el numero "+ num +" y luego presione ENTER");
        return scanner.nextLine();
    }

    public boolean operation() throws CalculatorException {
        String input = scanner.nextLine();
        switch (mapOption.get(input)) {
            case ADDITION_OPTION:
                System.out.println(ADDITION_OPTION);
                calculator.setA(inputNumber(A_KEY));
                calculator.setB(inputNumber(B_KEY));
                calculator.addition();
                return true;
            case SUBTRACTION_OPTION:
                System.out.println(SUBTRACTION_OPTION);
                calculator.setA(inputNumber(A_KEY));
                calculator.setB(inputNumber(B_KEY));
                calculator.subtraction();
                return true;
            case MULTIPLY_OPTION:
                System.out.println(MULTIPLY_OPTION);
                calculator.setA(inputNumber(A_KEY));
                calculator.setB(inputNumber(B_KEY));
                calculator.multiply();
                return true;
            case SPLIT_OPTION:
                System.out.println(SPLIT_OPTION);
                calculator.setA(inputNumber(A_KEY));
                calculator.setB(inputNumber(B_KEY));
                calculator.split();
                return true;
            case POWER_OPTION:
                System.out.println(POWER_OPTION);
                calculator.setA(inputNumber(A_KEY));
                calculator.setB(inputNumber(B_KEY));
                calculator.power();
                return true;
            case SQUARE_ROOT_OPTION:
                System.out.println(SQUARE_ROOT_OPTION);
                calculator.setA(inputNumber(A_KEY));
                calculator.square();
                return true;
            case CLOSE_OPTION:
                System.out.println(CLOSE_OPTION);
                closeScannerInstance();
                return false;
            default:
                System.out.println(NO_VALID_OPTION);
                return true;
        }
    }
}
