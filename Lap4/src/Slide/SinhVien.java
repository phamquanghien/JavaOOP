package Slide;

import java.util.List;
import java.util.Scanner;

public class SinhVien {
    public String HoTen;
    public double Diem;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap diem: ");
        Diem = sc.nextDouble();
    }
    public static void Add(List<SinhVien> svList)
    {
        while(true)
        {
            SinhVien sv = new SinhVien();
            sv.NhapThongTin();
            if(sv.HoTen.equals("")) break;
            svList.add(sv);
        };
    }
    public static void Display(List<SinhVien> svList)
    {
        for(int i = 0; i < svList.size(); i++)
        {
            String name = svList.get(i).HoTen;
            double score = svList.get(i).Diem;
            System.out.printf("%s-%f\n",name,score);
        }
    }
}
