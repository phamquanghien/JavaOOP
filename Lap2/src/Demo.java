import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soDong, soCot;
        //1. Thao tac khai bao mang
        //1.1 Nhap kich thuoc mang tu ban phim (n>0)
        do
        {
            System.out.print("Nhap so dong: ");
            soDong = sc.nextInt();
            System.out.print("Nhap so cot: ");
            soCot = sc.nextInt();
        } while(soDong <= 0 || soCot <= 0);
        //1.2 Khai bao mang voi kich thuoc da nhap
        int A[][] = new int[soDong][soCot];
        //2. Thao tac nhap du lieu vao cac phan tu cua mang
        for(int i = 0; i < soDong; i++)
        {
            for(int j = 0; j < soCot; j++)
            {
                //thong bao nhap vao phan tu A[i][j]
                System.out.printf("A[%d][%d] = ", i,j);
                A[i][j] = sc.nextInt();
            }
        }
        //3. Duyet mang, in ra cac phan tu
        for(int i = 0; i < soDong; i++)
        {
            for(int j = 0; j < soCot; j++)
            {
                System.out.printf("%d\t", A[i][j]);
            }
            
        }
    }
}