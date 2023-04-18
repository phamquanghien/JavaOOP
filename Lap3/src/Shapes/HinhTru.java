package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron{
    public float chieucao;
    public HinhTru()
    {
        super();
    }
    public HinhTru(float ch)
    {
        this.chieucao = ch;
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
    @Override
    public void HienThi()
    {
        //super.HienThi();
        System.out.printf("\nh = %f, tt = %f", chieucao,thetich);
    }
}
