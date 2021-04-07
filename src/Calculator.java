public class Calculator {

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        return a / b;
    }

    int power(int base, int exp) {
        return base ^ exp;
    }

    String divMod(int dividend, int divisor) {
        return "Dividend = " + dividend / divisor + "*" + divisor + " + " + dividend % divisor;
    }


    String primeFactorsBreakDown(int a, int b) {
        String breakdown;
        breakdown = a + "=";
        while (a > 1) for (int i = 1; i <= a; i++) {
            if (isPrime(i)) {
                if (a % i == 0 & a / i > 1) {
                    breakdown = breakdown + (i + "*");
                    a = a / i;
                } else if (a % i == 0 & a / i == 1) {
                    breakdown = breakdown + i;
                    a = a / i;
                } else {
                    continue;
                }
            }
        }
        return breakdown;
    }

    private static boolean isPrime(int a) {
        for (int j = 2; j <= a; j++) {
            if (a % j == 0 && a != j) {
                return false;
            } else if (a % j == 0 && a == j) {
                //System.out.println(a + " is prime!");
                return true;
            }
        }
        return false;
    }


}
