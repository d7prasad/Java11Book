package src.main.chapter5_Control_Statements;

public class BreakLabelInnerforLoop {
    public static void main(String[] args) {
        outer: for(int i = 0; i< 10 ; i++ ) {
            inner: for (int j = 0; j < 10; j ++) {
                if(j==5) break outer;
            }
            System.out.println("This won't execute");
        }
        System.out.println("Outer break");
    }

}
