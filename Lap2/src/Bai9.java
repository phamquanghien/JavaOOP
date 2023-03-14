import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        String strInput;
        int countUpperCase = 0, countLowerCase = 0, countNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap text: ");
        strInput = sc.nextLine();
        //String strArr[] = strInput.split("");
        for(int i = 0; i < strInput.length(); i++)
        {
            int codeascii = strInput.charAt(i);
            if(codeascii >=48 && codeascii <= 57) countNumber++;
            else if(codeascii >=65 && codeascii <= 90) countLowerCase++;
            else if(codeascii >=97 && codeascii <= 122) countUpperCase++;
        }
        System.out.println("In hoa: " + countLowerCase);
        System.out.println("In thuong: " + countUpperCase);
        System.out.println("So: " + countNumber);
    }
}
