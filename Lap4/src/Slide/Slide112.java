package Slide;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Slide112 {
    public static void main(String[] args) {
        int count = 0; double sum = 0;
        Scanner sc = new Scanner(System.in);
        List<Integer> intList = new LinkedList<>();
        System.out.print("n = ");
        int n = sc.nextInt();
        //nhap vao n phan tu
        for(int i = 0; i < n; i++)
        {
            System.out.printf("Nhap vao phan tu thu %d: ", i+1);
            int number = sc.nextInt();
            intList.add(number);
            if(number % 2 ==0)
            {
                count++;
                sum += number;
            }
        }
        System.out.println("Cac phan tu trong Linked List: ");
        for(int i = 0; i < intList.size(); i++)
        {
            System.out.print(intList.get(i) + "\t");
        }
        System.out.println("Trung binh cong cac so chan = " + sum/count);
    }
}
