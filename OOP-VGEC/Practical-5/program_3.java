interface Exam {
    boolean Pass(int marks);
}

interface Classify {
    String Division(int average);
}

class Result implements Exam, Classify {
    public boolean Pass(int marks) {
        return marks >= 50;
    }

    public String Division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "No division";
        }
    }
}

public class program_3 {
    public static void main(String[] args) {
        Result result = new Result();

        System.out.println("Did student pass ? " + result.Pass(70));
        System.out.println("Division : " + result.Division(65));
        System.out.println("Division : " + result.Division(54));
        System.out.println("Division : " + result.Division(40));
    }
}