package HinhHoc;

import java.util.Scanner;

public class HinhTron {
    public float BanKinh;
    final float PI = 3.14f;
    public float ChuVi,DienTich;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("r = ");
        BanKinh = sc.nextFloat();
    }
    public void TinhChuVi() {
        ChuVi = 2 * PI * BanKinh;
    }
    public void TinhDienTich() {
        DienTich = PI * BanKinh * BanKinh;
    }
    public void HienThi() {
        System.out.println("Day la hinh tron");
    }
}
