public class Accountant {
    private Calculator calculator = new Calculator();
    double cost = 0;
    int totalops = 0;

    void calculate(String operation, int a, int b) {
        checkIntegerInput(operation, a, b);
        switch (operation) {
            case "addition":
                System.out.println("The result when adding "+ a + "+" + b + " is   " +
                        calculator.addition(a, b));
                cost++;
                totalops++;
                break;
            case "subtraction":
                System.out.println(calculator.subtraction(a, b));
                cost++;
                totalops++;
                break;
            case "multiplication":
                System.out.println(calculator.multiplication(a, b));
                cost++;
                totalops++;
                break;
            case "division":
                System.out.println(calculator.division(a, b));
                cost++;
                totalops++;
                break;
            case "divMod":
                System.out.println(calculator.divMod(a, b));
                cost = cost + 2;
                totalops++;
                break;
            case "power":
                System.out.println(calculator.power(a, b));
                cost = cost + 2;
                totalops++;
                break;
            case "primeFactorsBreakDown":
                System.out.println(calculator.primeFactorsBreakDown(a,b));
                cost = cost + 2;
                totalops++;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
    private void checkIntegerInput(String operation, int a, int b){

        if (operation=="primeFactorsBreakDown" & (b!=0 | a<1|a>100)){
            cost = cost + 0.5;
            totalops--;
            System.out.println("Provided input should be between 1 and 100!");
            System.out.println("Second input should be equal to zero!");
            System.exit(1);
        }
        else if((a<1|a>100) | (b<1|b>100) & (operation!="primeFactorsBreakDown")){
            cost = cost + 0.5;
            totalops--;
            System.out.println("Provided numbers should be between 1 and 100!");
            System.exit(1);
        }

    }

     void payoff(){
        System.out.println("Payoff Time! Total cost is: "+ cost);
        cost = 0;
    }

     void operationsSum(){
        System.out.println("Total number of operations is: "+ totalops);
    }

}
