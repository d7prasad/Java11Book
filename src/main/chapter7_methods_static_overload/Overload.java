package src.main.chapter7_methods_static_overload;

class OverloadDemo {

    void printNumbers(double d) {
        System.out.println("Inside double " +d);
    }

    void printNumbers(long l) {
        System.out.println("Inside long " +l);
    }
}

public class Overload {

    public static void main(String[] args) {
        OverloadDemo overloadDemo = new OverloadDemo();
        overloadDemo.printNumbers(12);
    }
}
