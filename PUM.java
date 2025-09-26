import java.util.Scanner;
public class PUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int x = 1; x <= n; x++) {
            if (count % 4 == 0) {
                System.out.println(" PUM");
                count++;
                x--;
                continue;
            }
            System.out.print(count++ + " " + count++ + " " + count++);

        }
        System.out.print( " PUM" );

    }

}
