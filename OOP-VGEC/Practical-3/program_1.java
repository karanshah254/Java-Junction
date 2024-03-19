public class program_1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No student names provided.");
            return;
        }

        int numArgs = args.length;
        String[] numericStrings = {
                "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth",
                "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth", "Sixteenth", "Seventeenth",
                "Eighteenth", "Nineteenth", "Twentieth"
        };

        System.out.println("Number of arguments = " + numArgs);
        for (int i = 0; i < numArgs; i++) {
            System.out.println((i + 1) + ": " + numericStrings[i] + " Student Name is = " + args[i]);
        }
    }
}