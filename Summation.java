import java.util.Scanner;

public class Summation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long num =sc.nextLong();
        long sum=((num*(num+1)/2));
        System.out.println(sum);
    }
}
