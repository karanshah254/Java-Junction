class Volume {
    // volume of cube
    public void volume(int side) {
        System.out.println("Volume of cube is " + (side * side * side));
    }

    // volume of rectangle
    public void volume(int length, int breath, int height) {
        System.out.println("Volume of rectangle is " + (length * breath * height));
    }

    // volume of sphere
    public void volume(double radius) {
        System.out.println("Volume of sphere is " + ((4 / 3) * radius * radius * radius * Math.PI));
    }
}

public class program_4 {
    public static void main(String[] args) {
        Volume vol = new Volume();

        vol.volume(50.3);
        vol.volume(30);
        vol.volume(10, 20, 30);
    }
}