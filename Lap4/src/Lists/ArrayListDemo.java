package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Student;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrList = new ArrayList<>();
        System.out.println("Nhap so phan tu: ");
        int sophantu = sc.nextInt();
        Student.Add(arrList, sophantu);
        Student.Display(arrList);
        Student.Update(arrList);
    }
}
