import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n < 1)
        {
            System.out.print("n = ");
            n = sc.nextInt();
        }
        int[] arr = new int[5];
        for(int i = 0; i<5; i++)
        {
            System.out.printf("A[%d] = ",i);
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<5; i++)
        {
            System.out.printf("%d\t",arr[i]);
        }
    }
}
