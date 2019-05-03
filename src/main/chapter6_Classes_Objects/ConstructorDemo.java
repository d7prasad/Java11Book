package src.main.chapter6_Classes_Objects;

class Box{
    Box (int width, int height){
        this.width = width;
        this.height = height;
        System.out.println("Constructor Called");
    }
    double width;
    double height;
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 10);
        System.out.println(b.height);
    }
}
