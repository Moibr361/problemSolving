import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();
        // for time complexty.
        if (y == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
    /* Rcuresion.
    public static long Fact(long y){
        if(y==0||y==1){
            return 1;
        }else {
            return y * Fact(y - 1);
        }
    }

     */

