import java.util.Scanner;
public class SumOfConsictiveOddNumbers {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        int a,z,count;
        for(int i=0;i<x;i++){
            sum=0;
            a=sc.nextInt();
            z=sc.nextInt();
            int max=Math.max(a,z);
            int min=Math.min(a,z);
            for(int c=min+1;c<max;c++){
                if(c%2!=0){
                    sum+=c;
                }
            }
            System.out.println(sum);

        }
    }
}
