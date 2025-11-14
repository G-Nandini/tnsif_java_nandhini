package assignment1;
import java.util.*;
public class Details {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your full name with initial:");
	        String name = sc.nextLine();

	        System.out.println("Enter your roll number:");
	        String rollNumber = sc.nextLine();

	        System.out.println("Enter your grade:");
	        String grade = sc.nextLine();

	        System.out.println("Enter your percentage:");
	        String percentage = sc.nextLine();
	        
	        System.out.println("\n" + name);
	        System.out.println(rollNumber);
	        System.out.println("\t" + grade);
	        System.out.println("\t\t" + percentage);

	       sc.close();
	    }
}
	


