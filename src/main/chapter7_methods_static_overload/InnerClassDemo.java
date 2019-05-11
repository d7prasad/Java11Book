package src.main.chapter7_methods_static_overload;

class Outer {

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Inside Inner");
        }
    }
}

public class InnerClassDemo {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
