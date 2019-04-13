package java;

public class CountRepeat {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        StringBuilder builder = new StringBuilder();
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            int temp  = 1;
            while(i < ch.length-1 && ch[i] == ch[i+1]) {
                temp++;
                i++;
            }
            builder.append(ch[i]);
            if(temp >1) builder.append(temp);
        }
        System.out.println(builder.toString());
    }
}
