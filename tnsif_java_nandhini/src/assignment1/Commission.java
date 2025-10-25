package assignment1;
import java.util.*;
public class Commission {
	String name;
    String address;
    String phone;
    double sales_amount;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        sales_amount = sc.nextDouble();
    }

    // Method (ii): Calculate commission
    void calculateCommission() {
        double commission;

        if (sales_amount >= 100000)
            commission = sales_amount * 0.10;
        else if (sales_amount >= 50000)
            commission = sales_amount * 0.05;
        else if (sales_amount >= 30000)
            commission = sales_amount * 0.03;
        else
            commission = 0;

        System.out.println("\nCommission Details:");
        System.out.println("Name: " + name);
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Commission: " + commission);
      
    }
}
