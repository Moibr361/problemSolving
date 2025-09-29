import java.util.Scanner;
public class FourNnumbers {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a,b,c,d;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        d= sc.nextInt();
        long multi = (long)a*b*c*d;
        System.out.print(multi);

    }
}
