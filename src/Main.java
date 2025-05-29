public class Main {
    public static void main(String[] args) {

        OptionManager optionManager = OptionManager.getInstace();

        boolean nextOperation = true;
        while (nextOperation){
            try {
                optionManager.mainMenu();
                nextOperation = optionManager.operation();
            } catch (CalculatorException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        optionManager.closeScannerInstance();
    }
}