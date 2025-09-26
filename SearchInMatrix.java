package PACKAGE_NAME;

public class SearchInMatrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              array[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        boolean flag=false;
        boolean flag1=false;
        for(int y=0;y<n;y++){
            for(int c=0;c<m;c++) {
                if (x == array[y][c]) {
                    flag=true;
                    flag1=true;
                    break;
                }
            }
            if(flag1){
                break;
            }
        }
        if(flag){
            System.out.println("will not take number");
        }else{
            System.out.println("will take number");
        }
    }
}
