public class Main {
    public static void main(String[] args) {
        Student s = new Student();  // Calls default constructor

        Commission c = new Commission();
        c.acceptDetails("Ayan S", "Chennai", "9876543210", 75000);
        c.calculateCommission();
    }
}
