package assignment2;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting inputs
        String name = sc.nextLine();
        String rollNumber = sc.nextLine();
        String grade = sc.nextLine();
        String percentage = sc.nextLine();

        // Printing outputs
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t" + percentage);

        sc.close();
    }
}
