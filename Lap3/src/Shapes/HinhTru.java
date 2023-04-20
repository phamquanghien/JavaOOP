package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron{
    public static float chieucao;
    public static void NhapChieuCao()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("h = ");
        chieucao = sc.nextFloat();
    }
    public void TinhTheTich()
    {
        thetich = dientich * chieucao;
    }
    public void TinhTheTich(float cc)
    {
        TinhDienTich();
        thetich = dientich * cc;
        System.out.printf("chieu cao = %f,the tich = %f",cc,thetich);
    }
    
}
