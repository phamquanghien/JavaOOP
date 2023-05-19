import java.util.List;
import java.util.Scanner;

public class Student
{
    public String Ten;
    public float Diem;
    public void NhapThongTin()
    {
        //nhap ten va diem cua sinh vien
    }
    public static void ThemSinhVien(List<Student> stdList)
    {
        while(true)
        {
            Student std = new Student();
            std.NhapThongTin();
            if(std.Ten.equals(""))
            {
                break;
            }
            else stdList.add(std);
        }
    }
    public static void TimKiem(List<Student> stdList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten muon tim kiem:");
        String strInput = sc.nextLine();
        boolean checkStudent = false;
        //duyet qua tat ca cac phan tu trong list
        for(Student std : stdList)
        {
            //kiem tra ten cua doi tuong std co == ten nguoi dung nhap vao khong
            if(std.Ten.equals(strInput))
            {
                checkStudent = true;
                String hoten = std.Ten;
                float diem = std.Diem;
                //hien thi thong tin sinh vien
                System.out.printf("Sinh vien %s - %f diem", hoten,diem);
            }
        }
        //neu khong tim thay thi thong bao
        if(checkStudent == false)
        {
            System.out.println("Khong tim thay thong tin");
        }
    }
}