package Slide;

import java.util.ArrayList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.print("n = ");
        int n = sc.nextInt();
        //nhap vao n phan tu
        for(int i = 0; i < n; i++)
        {
            System.out.printf("Nhap vao phan tu thu %d: ", i+1);
            int number = sc.nextInt();
            intList.add(number);
        }
        //sap xep giam dan
        intList.sort((o1,o2)-> o2-o1);
        //in ra phan tu lon nhat
        System.out.printf("Phan tu co gia tri lon nhat = %d",intList.get(0));
        //nhap va xoa
        System.out.print("\nnhap vao gia tri muon xoa: ");
        int x = sc.nextInt();
        while(intList.indexOf(x)>=0)
        {
            intList.remove(intList.indexOf(x));
        }
        //sap xep giam dan
        intList.sort((o1,o2)-> o2-o1);
        //in ra man hinh
        for(int i = 0; i < intList.size(); i++)
        {
            System.out.print(intList.get(i) + "\t");
        }
    }
}
