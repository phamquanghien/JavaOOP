import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        do{
            System.out.print("Nhap so hang n = ");
            n = sc.nextInt();
            System.out.print("Nhap so hang m = ");
            m = sc.nextInt();
        }while(n <=0 || m <=0);
        int A[][] = new int[n][m];
        //nhap mang
        System.out.println("Nhap vao cac phan tu cua mang");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        //
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.printf("%d\t",A[i][j]);
                if(A[i][j] > max) max = A[i][j];
            }
            System.out.println();
        }
        System.out.println("Phan tu lon nhat = " + max);
    }
}