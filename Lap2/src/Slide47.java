import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        int number, sum = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Nhap vao 1 so nguyen: ");
            number = sc.nextInt();
            sum += number;
            str += number + " + ";
        }
        while(sum < 100);
        str = str.substring(0, str.length()-2);
        System.out.println("Tong cac so vua nhap vao: " + str + "=" + sum);

    }
}
