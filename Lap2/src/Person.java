import java.util.Scanner;

public class Person {
    
    public static void main(String[] args) {
        //thong bao cho nguoi dung biet => nhap vao so nguyen duong
        System.out.println("Nhap vao so nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        //khai bao cac bien so
        int n, tong = 0;
        //doc du lieu tu ban phim nhap vao gan cho bien n
        n = sc.nextInt();
        while(n > 0)
        {
            //tach so hang don vi + vao tong
            tong = tong + n%10;
            //chia lay phan nguyen cho 10
            n = n/10;
        }
        System.out.println("Tong  = " + tong);
    }
}