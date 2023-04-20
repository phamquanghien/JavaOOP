package Shapes;

import java.util.Scanner;

public class HinhHoc {
    public final float PI = 3.14f;
    private String ten;
    public static float chuvi;
    public float dientich;
    public float thetich;
    public void SetTen(String name)
    {
        this.ten = name;
    }
    public String GetTen() {
        return this.ten;
    }
    
    public static void InChuVi()
    {
        System.out.println("Chu vi = " + chuvi);
    }
    public void InDienTich() {
        System.out.println("Dien tich = " + dientich);
    }
    public void InTheTich() {
        System.out.println("The tich = " + thetich);
    }
}