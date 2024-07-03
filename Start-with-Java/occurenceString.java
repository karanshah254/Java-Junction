public class occurenceString {
    public static void main(String[] args) {
        String string = "ObjectOrientedProgramming";
        getOccurence(string);
    }

    static void getOccurence(String str) {
        int count[] = new int[256];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]) {
                    find++;
                }
            }

            if (find == 1) {
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
            }
        }
    }
}