package mainclass;
import com.nandhini.assignment.employees.*;
import com.nandhini.assignment.utilities.*;

public class AssignmentMain {
    public static void main(String[] args) {
        // --- Create Manager object ---
        Manager manager = new Manager();
        manager.setName("Nandhini");
        manager.setEmployeeId(101);
        manager.setSalary(70000);
        manager.setDepartmentName("Sales");
        manager.setTeamsize(8);

       
        Developer developer = new Developer();
        developer.setName("Nithyasri");
        developer.setEmployeeId(102);
        developer.setSalary(60000);
        developer.setProgrammingLanguages("Java");
        developer.setProjectName("E-Commerce Website");

     
        EmployeeUtilities util = new EmployeeUtilities();

        System.out.println(" Manager Details ");
        util.displayEmployee(manager);
        util.showRoleDetails(manager);

        System.out.println("\n Developer Details ");
        util.displayEmployee(developer);
        util.showRoleDetails(developer);
        
        double annualSalary = util.calculateAnnualSalary(manager);
        System.out.println("\nManager Annual Salary: " + annualSalary);
    }
}

