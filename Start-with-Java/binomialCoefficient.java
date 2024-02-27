
public class binomialCoefficient {
    public static int findFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {
        // code for nCr = binomial coefficient
        int fact_n = findFactorial(n);
        int fact_r = findFactorial(r);
        int n_r_fact = findFactorial(n - r);
        int binCoeff = fact_n / (fact_r * n_r_fact);
        return binCoeff;
    }

    public static void main(String[] args) {
        // finding ncr = n!/ r! (n-r)!
        int n = 6;
        int r = 4;
        int answer = binCoeff(n, r); // 6C2 = 15
        System.out.println("Binomial Coefficient is " + answer); // 15
    }
}
