package users;

import java.util.ArrayList;
import java.util.Scanner;

import mInterface.Authentication;

public abstract class Account implements Authentication{
    private static int accountCount = 1; // Static variable to keep track of the number of accounts
    public static ArrayList<Account> accountList = new ArrayList<>(); // List to store all accounts
    private int accountId; // Unique identifier for each account
    private String username;
    private String password;
    private String email;
    private String phoneNumber;

    public Account()
    {
        register();
    }
    public Account(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    protected String getUsername() {
        return username;
    }

    @Override
    public void register() {
        
        System.out.println("account");
        Scanner sc = new Scanner(System.in);
        // Registration logic can be implemented here
        System.out.println("Registering account with ID: " + accountId);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        setUsername(username);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        setPassword(password);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        setEmail(email);
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        setPhoneNumber(phoneNumber);
        System.out.println("Account registered successfully!");

    }

    protected void setUsername(String username) {
        // Validate username if needed
        if (username == null || username.isEmpty()) {
            this.username = "defaultUser";
        }else {
            this.username = username;
        }
    }

    protected void setPassword(String password) {
        // Validate password if needed
        if (password == null || password.length() < 6) {
            System.out.println("Password must be at least 6 characters long.");
            this.password = "12345678";
        } else {
            this.password = password;
        }
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        // Validate email format if needed
        if (email == null || !email.contains("@")) {
            System.out.println("Invalid email format.");
            this.email = null;
        }
        else {
            this.email = email;
        }
    }

    protected String getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(String phoneNumber) {
        // Validate phone number format if needed
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            System.out.println("Invalid phone number format. It should be 10 digits.");
            this.phoneNumber = null;
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "Account [username=" + username + ", password=" + password + ", email=" + email + ", phoneNumber="
                + phoneNumber + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(obj instanceof Account) {
            System.out.println("heree");
            Account other = (Account) obj;
            System.out.println(this.email);
            System.out.println(other.email);
            System.out.println(this.password);
            System.out.println(other.password);

            if(this.email.equals(other.email) && this.password.equals(other.password))
            {
            System.out.println("hereee");
                
                return true;
            }
            else
            {
                return false;
            }
        }else
        {
            return false;
        }
    }

    

    
    
}
