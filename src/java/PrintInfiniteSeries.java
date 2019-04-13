package java;

public class PrintInfiniteSeries {
    public static void main(String[] args) {
        String series = "abcde";
        char c = 'c';
        int count = 11;
        StringBuilder builder = new StringBuilder();
        builder.append(series);
        int length = series.length();
        while(length <= count){
            if((length + length) <= count){
                builder.append(series);
                length = length + length;
            }else{
                builder.append(series.substring(0, (count - length)));
                break;
            }
        }
        System.out.println(builder.toString());
    }
}
