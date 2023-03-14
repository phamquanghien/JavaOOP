import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int number, giaiThua = 1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap vao 1 so nguyen duong: ");
            number = sc.nextInt();
        }while(number <= 0);
        for(int i = 1; i <= number; i++)
        {
            giaiThua *= i;
        }
        System.out.printf("%d! = %d", number,giaiThua);
    }
}
