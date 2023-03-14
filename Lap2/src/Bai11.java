import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap vao kich thuoc mang n = ");
            n = sc.nextInt();
        }while(n <= 0);
        int A[] = new int[n];
        //nhap mang
        System.out.println("Nhap vao cac phan tu cua mang:");
        for(int i=0; i<n; i++)
        {
            System.out.printf("A[%d] = ", i);
            A[i] = sc.nextInt();
        }
        //in mang
        for(int i=0; i<n; i++)
        {
            System.out.printf("%d\t", A[i]);
        }
        //sap xep mang tang dan
        for(int i=0; i<n-1; i++)
        {
            int tg;
            for(int j=i+1; j<n; j++)
            {
                if(A[i] > A[j]){
                    tg = A[i];
                    A[i] = A[j];
                    A[j] = tg;
                }
            }
        }
        //in mang sau khi sap xep tang dan
        System.out.println("Mang sau khi sap xep tang dan la");
        for(int i=0; i<n; i++)
        {
            System.out.printf("%d\t", A[i]);
        }
    }
}
