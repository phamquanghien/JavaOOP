import java.util.Scanner;

public class Student extends StudentAB {
    public String FullName;
    public int Age;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten: ");
        FullName = sc.nextLine();
        System.out.print("Nhap vao tuoi: ");
        Age = sc.nextInt();
    }
    
    public void Insert(Student arr[])
    {
        for(int i =0; i < arr.length; i++)
        {
            Student std = new Student();
            std.NhapThongTin();
            arr[i] = std;
        }
    }
    public void Delete(Student arr[], int index)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten muon tim kiem:");
        String str = sc.nextLine();
        boolean kt = false;
        for(int i =0; i < arr.length; i++)
        {
            if(arr[i].FullName.equals(str))
            {
                arr[i] = null;
                kt = true;
            }
        }
        if(kt == false) System.out.println("Khong tim thay thong tin nguoi dung nhap vao");
    }
}
