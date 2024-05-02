public class program_4 {
    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        if (values == null) {
            throw new NullPointerException("Array is null");
        }

        double sum = 0;
        int count = 0;

        for (String value : values) {
            if (value == null) {
                throw new NullPointerException("Array element is null");
            }
            try {
                double num = Double.parseDouble(value);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Incorrectly formated element");
            }
        }

        return sum / count;
    }

    public static void main(String[] args) {
        String[] values1 = { "10", "20", "30" };
        try {
            double avg1 = average(values1);
            System.out.println("Average: " + avg1);
        } catch (NullPointerException | NumberFormatException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        String[] values2 = { "10", "20", "30", null };
        try {
            double avg2 = average(values2);
            System.out.println("Average: " + avg2);
        } catch (NullPointerException | NumberFormatException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        String[] values3 = { "10", "20", "30", "invalid" };
        try {
            double avg3 = average(values3);
            System.out.println("Average: " + avg3);
        } catch (NullPointerException | NumberFormatException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}