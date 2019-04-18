package main;

public class FindMinimumPlatform {
    public static void main(String[] args) {
          double[] arrival =  { 9.00, 9.40, 9.50, 11.00, 15.00, 18.00 };
        double[] departure = { 9.10, 11.20, 11.30, 12.00, 19.00, 20.00  };

        int max_platform = 1;
        int temp = 1;
        int i = 1, j = 0;
        int n = arrival.length;

        while(i < n && j < n){
            if(arrival[i] < departure[j]){
                temp ++;
                i ++;
            }else{
                j++;
                if(i == j) i++;
                max_platform = Integer.max(max_platform, temp);
                temp = 1;
            }
        }

        System.out.println(max_platform);
    }
}
