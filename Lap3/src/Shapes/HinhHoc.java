package Shapes;

public class HinhHoc {
    public final float PI = 3.14f;
    private String ten;
    public String Getter() {
        return ten;
    }
    public void Setter(String name) {
        this.ten = name;
    }
    public float chuvi;
    public float dientich;
    public float thetich;
    public void XuatTen()
    {
        System.out.println("Ten = " + ten);
    }
    public void InChuVi()
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