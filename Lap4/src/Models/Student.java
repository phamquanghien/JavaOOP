package Models;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student {
    public String FullName;
    public int Age;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        FullName = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Age = sc.nextInt();
    }

    //hien thi toan bo du lieu cac phan tu trong listStudent
    public static void Display(List<Student> listStudent)
    {
        for(int i = 0; i < listStudent.size(); i++)
        {
            String fName = listStudent.get(i).FullName;
            int tuoi = listStudent.get(i).Age;
            System.out.printf("Sinh vien %s, %d tuoi\n", fName, tuoi);
        }
    }
    //hien thi toan bo du lieu cac phan tu trong setStudent
    public static void Display(Set<Student> setStudent)
    {
        for(Student std : setStudent)
        {
            String fName = std.FullName;
            int tuoi = std.Age;
            System.out.printf("Sinh vien %s, %d tuoi\n", fName, tuoi);
        }
    }
    public static void Add(List<Student> listStudent, int n)
    {
        for(int i = 0; i < n; i++)
        {
            Student std = new Student();
            std.NhapThongTin();
            //add vao listStudent
            listStudent.add(std);
        }
    }
    public static void Add(Set<Student> stdSet, int n)
    {
        for(int i = 0; i < n; i++)
        {
            Student std = new Student();
            std.NhapThongTin();
            //add vao listStudent
            stdSet.add(std);
        }
    }
    public static void Update(List<Student> studentList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao thong tin muon cap nhat:");
        String ten = sc.nextLine();
        //tim kiem phan tu thu i co fulllname == ten
        for(int i = 0; i < studentList.size(); i++)
        {
            if(studentList.get(i).FullName.equals(ten))
            {
                //neu tim thay thi nhap thong tin moi va cap nhat vao list
                Student std = new Student();
                std.NhapThongTin();
                studentList.set(i, std);
            }
        }
        
    }
    public static void Update(Set<Student> studentSet)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao thong tin muon cap nhat:");
        String ten = sc.nextLine();
        //tim kiem phan tu thu i co fulllname == ten
        for(Student std: studentSet)
        {
            if(std.FullName.equals(ten))
            {
                //neu tim thay thi nhap thong tin moi va cap nhat vao list
                std.FullName = "Ten moi";
            }
        }
        
    }
    public static void Delete(List<Student> studentList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao thong tin muon cap nhat:");
        String ten = sc.nextLine();
        //tim kiem phan tu thu i co fulllname == ten
        for(int i = 0; i < studentList.size(); i++)
        {
            if(studentList.get(i).FullName.equals(ten))
            {
                studentList.remove(i);
            }
        }
    }
}
