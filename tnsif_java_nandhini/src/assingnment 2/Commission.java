public class Commission {
    String Name, Address, Phone;
    double Sales_amount, commission;

    public void acceptDetails(String Name, String Address, String Phone, double Sales_amount) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Sales_amount = Sales_amount;
    }

    public void calculateCommission() {
        if (Sales_amount >= 100000)
            commission = Sales_amount * 0.10;
        else if (Sales_amount >= 50000)
            commission = Sales_amount * 0.05;
        else if (Sales_amount >= 30000)
            commission = Sales_amount * 0.03;
        else
            commission = 0;

        System.out.println("Commission for " + Name + " = " + commission);
    }
}
