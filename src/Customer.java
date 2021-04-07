public class Customer {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        accountant.calculate("addition", 91,2);
        accountant.payoff();
        accountant.operationsSum();

        accountant.calculate("primeFactorsBreakDown", 90,0);
        accountant.payoff();
        accountant.operationsSum();

    }
}
