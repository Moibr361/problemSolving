import java.util.Scanner;
public class Digits {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        int reversed =0;
        for(int i=0;i<t;i++) {
            int N = sc.nextInt();
            if(N==0){
                System.out.println(0);
                continue;
            }
            while (N != 0) {
                int digit = N % 10;
                System.out.print(digit + " ");
                N /= 10;
            }
            System.out.println();

        }

    }
}
