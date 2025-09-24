import java.util.Scanner;
public class SomeSums {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Sum=0;
        for(int i=1;i<=n;i++){
            if(i/10==0){
                if(i>=a && i<=b){
                    Sum+=i;
                }
            }else{
                int num=i;
                int digtSum=0;
                while(num!=0){
                    int digit=num%10;
                    digtSum+=digit;
                    num/=10;
                }
                if(digtSum>=a && digtSum<=b){
                    Sum+=i;
                }
            }

        }
        System.out.println(Sum);


    }
}
