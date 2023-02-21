import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int myNumber, sumDigit = 0;
        System.out.println("Enter an integer: ");
        myNumber = sc.nextInt();
        while(myNumber > 0)
        {
            sumDigit += myNumber % 10;
            myNumber = myNumber / 10;
        }
        System.out.println("The sum of the digits of the above number is: " + sumDigit);
    }
}
