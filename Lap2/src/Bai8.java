import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        double n, tong =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon nhap vao bao nhieu so nguyen? ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.printf("Nhap vao so thu %d: ", i+1);
            tong += sc.nextInt();
        }
        System.out.println("Gia tri trung binh cong cua cac so vua nhap = " + (tong/n));
    }
}
