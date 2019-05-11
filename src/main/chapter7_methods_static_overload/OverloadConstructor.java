package src.main.chapter7_methods_static_overload;

class Box {
    double width;
    double height;

    Box() {
        this.width = -1;
        this.height = -1;
    }

    Box(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double volume(){
        return width * height;
    }

}

public class OverloadConstructor {

    public static void main(String[] args) {
        Box box = new Box(12, 13);
        System.out.println(box.volume());

        Box emptyBox = new Box();
        System.out.println(emptyBox.volume());
    }
}
