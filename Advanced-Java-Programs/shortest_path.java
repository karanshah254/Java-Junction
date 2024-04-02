public class shortest_path {
    public static void main(String[] args) {
        String path = "wneenesennn";
        int x = 0, y = 0;
        int X, Y;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            if (direction == 'n') {
                // north
                y++;
            } else if (direction == 's') {
                // south
                y--;
            } else if (direction == 'e') {
                // east
                x++;
            } else {
                // west
                x--;
            }
        }
        X = x * x;
        Y = y * y;

        float answer = (float) Math.sqrt(X + Y);
        System.out.println("shortest path is " + answer);
    }
}
