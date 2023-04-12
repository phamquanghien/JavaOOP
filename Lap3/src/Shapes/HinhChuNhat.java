package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    public HinhChuNhat()
    {
        ten = "Hinh Chu nhat";
    }
    public void NhapChieuDai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai = ");
        dai = sc.nextFloat();
    }
    public void NhapChieuRong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap chieu Rong = ");
        rong = sc.nextFloat();
    }
    public void TinhChuVi() {
        chuvi = (dai + rong) * 2;
    }
    public void TinhDienTich()
    {
        dientich = dai * rong;
    }
}
