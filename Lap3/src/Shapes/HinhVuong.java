package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong()
    {
        ten = "Hinh vuong";
    }
    public void NhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap canh = ");
        dai = rong = sc.nextFloat();
    }
}
