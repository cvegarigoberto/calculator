public class Main {
    public static void main(String[] args) {

        OptionManager optionManager = OptionManager.getInstace();

        optionManager.mainMenu();
        try {
            optionManager.operation();
        } catch (CalculatorException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Cerrando el scanner");
            optionManager.closeScannerInstance();

        }catch (Exception e){
            System.out.println();
        }
    }
}