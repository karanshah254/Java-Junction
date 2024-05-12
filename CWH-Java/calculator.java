/*
Create a calculator add, subtract, multiply, divide & it throws exception when:
1. Iavalid input exception like 8 & 9
2. Cannnot divide 0 exception
3. Max input exception if number greater than 100000
4. Max multiplier reached exception if multiplier is greater than 7000
 */

class InvalidInputException extends Exception {

    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "I am message";
    }
}

class CannotDivideByZeroException extends Exception {

    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "I am message";
    }
}

class MaxInputException extends Exception {

    @Override
    public String toString() {
        return "Input cannot be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "I am message";
    }
}

class MaxMultiplierInputException extends Exception {

    @Override
    public String toString() {
        return "Input cannot be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return "I am message";
    }
}

class CustomCalculator {

    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }

        return a + b;
    }

    double subtract(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        return a - b;
    }

    double multiply(double a, double b) throws MaxInputException, MaxMultiplierInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        } else if (a > 7000 || b > 7000) {
            throw new MaxMultiplierInputException();
        }

        return a * b;
    }

    double divide(double a, double b)
            throws CannotDivideByZeroException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (b == 0) {
            throw new CannotDivideByZeroException();
        }

        return a / b;
    }
}

public class calculator {
    public static void main(String[] args)
            throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplierInputException {
        CustomCalculator cal = new CustomCalculator();
        // cal.add(8, 9);
        // cal.divide(4, 0);
        // cal.divide(100002, 23);
        cal.multiply(56, 9000);
    }
}
