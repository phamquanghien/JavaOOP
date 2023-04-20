package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public float bankinh;
    public void NhapBanKinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh r = ");
        bankinh = sc.nextFloat();
    }
    public void TinhChuVi()
    {
        chuvi = 2 * PI * bankinh;
    }
    public void TinhDienTich()
    {
        dientich = PI * bankinh * bankinh;
    }
    public void HienThi()
    {
        System.out.printf("r = %f, cv = %f, dt = %f", bankinh, chuvi,dientich);
    }
    public void HienThi(String name)
    {
        System.out.printf("Duong trong %s: r = %f, cv = %f, dt = %f", name, bankinh, chuvi,dientich);
    }
    public void HienThi(int name)
    {
        System.out.printf("Duong trong %s: r = %f, cv = %f, dt = %f", name, bankinh, chuvi,dientich);
    }
}
