package Slide;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Slide114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> strSet = new HashSet<>();
        System.out.print("n = ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print("Nhap ten trai cay: ");
            String fruit = sc.nextLine();
            strSet.add(fruit);
        }
        System.out.printf("So phan tu trong hashset = %d\n",strSet.size());
        
    }
}
