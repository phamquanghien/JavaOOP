package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public float bankinh;
    public HinhTron()
    {
        Setter("Hinh tron");
    }
    public HinhTron(float bankinh)
    {
        this.bankinh = bankinh;
    }
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
        dientich = PI * bankinh * dientich;
    }
    public void HienThi() {
        System.out.printf("r = %f, cv = %f, dt = %f", bankinh,chuvi,dientich);
    }
}
