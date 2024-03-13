public class string_builder_basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'f'; ch++) {
            // add elements
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
