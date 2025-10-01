import java.util.Scanner;

public class ColorfulStons {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String s =sc.next();
        String t =sc.next();
        int count =1;
        int x=0;
            for(int j=0;j<t.length();j++){
                if(s.charAt(x)==t.charAt(j)){
                    count++;
                    x++;
                }
            }


        System.out.println(count);
    }
}
