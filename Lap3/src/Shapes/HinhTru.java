package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron{
    public float chieucao;
    public HinhTru()
    {
        ten = "Hinh Tru";
    }
    public void NhapChieuCao()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("h = ");
        chieucao = sc.nextFloat();
    }
    public void TinhTheTich()
    {
        thetich = dientich * chieucao;
    }
}
