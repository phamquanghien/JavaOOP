import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int tong = 0, number;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap vao 1 so nguyen de tinh tong: ");
            number = sc.nextInt();
            tong += number;
        }while(tong < 100);
        System.out.println("Tong cac so vua nhap vao = " + tong);
    }
}
