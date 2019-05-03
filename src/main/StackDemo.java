package src.main;

class Stack {
    int[] stck  = new int[10];
    int tos;

    Stack(){
        tos = -1;
    }

//    push an item to stack
    void push(int item){
        if(tos == 9){
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

//    Pop an item from stack
    int pop(){
        if(tos < 0 ){
            System.out.println("No items to pop");
            return 0;
        }else{
            return stck[tos--];
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i=0; i<10; i++){
            stack.push(i);
        }

        for(int i = 0; i< 10; i++){
            System.out.println(stack.pop());
        }
        stack.pop();
    }
}
