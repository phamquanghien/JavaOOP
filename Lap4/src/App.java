import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import Models.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Set<Student> linkSet = new LinkedHashSet<>();
        Student.Add(linkSet, 3);
        Student.Display(linkSet);
        Student.Update(linkSet);
        Student.Display(linkSet);
    }
}