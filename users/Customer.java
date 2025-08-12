package users;

import java.util.Scanner;

public class Customer extends Account{
   
    int loyaltyPoints;
    String passcode;

    public Customer()
    {
        super();
    }
    public Customer(String email, String password, String passcode) {
        super(email, password);
        setPasscode(passcode);
    }

    public void setPasscode(String passcode) {
        // Validate passcode if needed
        if (passcode == null || passcode.length() < 4) {
            System.out.println("Passcode must be at least 4 characters long.");
            this.passcode = "1234";
        } else {
            this.passcode = passcode;
        }
    }
    
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        if (loyaltyPoints < 0 || loyaltyPoints > 100) {
            System.out.println("Loyalty points cannot be negative.");
            this.loyaltyPoints = 0;
        } else {
            this.loyaltyPoints = loyaltyPoints;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this);
        System.out.println(obj);
        if(super.equals(obj)) {
            System.out.println("here");
            Customer other = (Customer) obj;
            if(this.passcode.equals(other.passcode)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void register() {
        System.out.println("customer");
        // TODO Auto-generated method stub
        super.register();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter loyalty points: ");
        int points = scanner.nextInt();
        this.setLoyaltyPoints(points);
        System.out.print("Enter passcode: ");
        String code = scanner.next();
        this.setPasscode(code);
        accountList.add(this);
    }

    @Override
    public String toString() {
        return super.toString()+"Customer [loyaltyPoints=" + loyaltyPoints + ", passcode=" + passcode + "]";
    }

    

    
    
}
