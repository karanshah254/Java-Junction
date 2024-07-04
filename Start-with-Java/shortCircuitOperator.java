public class shortCircuitOperator {
    public static void main(String[] args) {
        
        // For (&&) the first operand itself is false, then a short circuit occurs, the
        // further expression is not evaluated, and false is returned else short circuit
        // don't occur
        if (false && false && true) {
            System.out.println("true part printed");
        } else {
            System.out.println("false part printed"); // short circuit part printed
        }

        // For (||) the first operand itself is true, a short circuit occurs, evaluation
        // stops, and true is returned else short circuit don't occur
        if (true || false || false) {
            System.out.println("true part printed"); // short circuit part printed
        } else {
            System.out.println("false part printed");
        }
    }
}