package src.main.chapter5_Control_Statements;

public class ForEachArrayIteration {

    public static void main(String[] args) {
        int nums [][] = new int [3][5];

//        give nums some value
        for(int i = 0; i <3; i++) {
            for (int j = 0; j< 5; j++) {
                nums [i] [j] = (i +1) * (j +1);
            }
        }

//        Use for each to display array iteration
        for(int x[]: nums){
            for(int y = 0; y<5; y++ ){
                System.out.print(x[y]);
            }
            System.out.println("");
        }
    }
}
