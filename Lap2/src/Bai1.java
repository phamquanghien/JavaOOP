import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Bai1{
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.printf("%f + %f = %f\n",a,b,a+b);
        System.out.printf("%f - %f = %f\n",a,b,a-b);
        System.out.printf("%f * %f = %f\n",a,b,a*b);
        System.out.printf("%f / %f = %f\n",a,b,a/b);
        System.out.printf("%f %% %f = %f\n",a,b,a%b);
        if(a > b) System.out.printf("%f > %f\n",a,b);
        else if(a < b) System.out.printf("%f < %f\n",a,b);
        else if(a == b) System.out.printf("%f = %f\n",a,b);
        else if(a != b) System.out.printf("%f != %f\n",a,b); 
    }
}