import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen a = ");
        a = sc.nextInt();
        if(a%2 == 0) System.out.printf("%d la so chan",a);
        else System.out.printf("%d la so le",a);
    }
}
