import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi, kytu;
        int count = 0;
        do{
            System.out.print("Nhap chuoi ky tu (khong qua 80 ky tu): ");
            chuoi = sc.nextLine();
        } while(chuoi.length() > 80);
        do{
            System.out.print("Nhap ky tu: ");
            kytu = sc.nextLine();
        } while(kytu.length() != 1);
        for(int i = 0; i < chuoi.length(); i++)
        {
            if(chuoi.indexOf(kytu,i)>=0){
                count++;
                i = chuoi.indexOf(kytu,i);
            } 
        }
        System.out.printf("Ky tu %s xuat hien %d lan trong chuoi %s",kytu,count,chuoi);
    }
}
