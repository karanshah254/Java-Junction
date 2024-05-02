class IllegalMarkException extends Exception {
    public IllegalMarkException(String message) {
        super(message);
    }
}

public class program_6 {
    public static String CheckMarks(int marks) throws IllegalMarkException {
        if (marks < 0) {
            throw new IllegalMarkException("entered wrong marks");
        }
        return (marks >= 40) ? "Pass" : "Fail";
    }

    public static void main(String[] args) {
        int[] list = { 50, -10, 35 };

        for (int i = 0; i < list.length; i++) {
            try {
                String result = CheckMarks(list[i]);
                System.out.println("Registration number is " + i + " & Result is " + result);
            } catch (IllegalMarkException e) {
                System.err.println("Resgistration Number is " + i + " : " + e.getMessage());
            }
        }
    }
}