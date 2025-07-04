package users;
//member

import java.sql.Date;
import mInterface.*;

public class Customer implements Authentication{
    int customer_id;
    String customer_name;
    int customer_age;
    Date dob;
    String email;
    String password;
    String phoneNumber;
    String photo;
    int royaltyPoints; // 0, 100, 200
    String membershipTier; // "Bronze", "Silver", "Gold"
    String registrationDate;
    String address; // "123 Main St", "456 Elm St"
    public Customer(int customer_id, String customer_name, int customer_age, Date dob, String email, String password,
            String phoneNumber, String photo, int royaltyPoints, String membershipTier, String registrationDate,
            String address) {
                
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_age = customer_age;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
        this.royaltyPoints = royaltyPoints;
        this.membershipTier = membershipTier;
        this.registrationDate = registrationDate;
        this.address = address;
    }

    
    @Override
    public void login(String email, String password) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void register()
    {

    }
    
}
