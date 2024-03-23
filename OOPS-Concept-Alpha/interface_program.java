public class interface_program {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();

        Duck d = new Duck();
        d.walk();
        d.swim();
    }
}

// multiple inheritance starts here
interface walkable {
    void walk();
}

interface swimmable {
    void swim();
}

class Duck implements walkable, swimmable {
    public void walk() {
        System.out.println("Duck can walk");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }
}
// multiple-inheritance ends here


// demo of using interface
interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("all direction by 1 step");
    }
}
