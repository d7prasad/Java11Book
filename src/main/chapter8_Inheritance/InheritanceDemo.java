package src.main.chapter8_Inheritance;

class A {
    void display(){
        System.out.println("Inside A");
    }
}

class B extends A {
   public B() {
        System.out.println("Inside b Constructor");
    }

    void display() {
        System.out.println("Inside B");
    }

    void print() {
        System.out.println("Inside B");
    }
}


public class InheritanceDemo {

    public static void main(String[] args) {
        A a = new B();
        a.display();
    }
}
