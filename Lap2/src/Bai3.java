import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int nam; String fullName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten: ");
        fullName = sc.nextLine();
        System.out.print("Nhap vao nam: ");
        nam = sc.nextInt();
        if((2023-nam) < 16) System.out.printf("Bạn %s ở độ tuổi vị thành niên",fullName);
        else if((2023-nam) < 18) System.out.printf("Bạn %s ở độ tuổi trưởng thành",fullName);
        else System.out.printf("Bạn %s đã già",fullName);
    }
}
