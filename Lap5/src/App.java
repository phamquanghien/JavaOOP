import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a =0;
        int b=0, x=0;
        
        while(a==0||b==0){
            try
            {
                System.out.print("a = ");
                a = sc.nextInt();
                System.out.print("b = ");
                b = sc.nextInt();
                //cac cau lenh co the gay ra ngoai le
                x = a/b;
            }
            catch(Exception ex)
            {
                a = b = 0;
            }
        }
        System.out.printf("%d/%d = %d",a,b,x);
    }
}