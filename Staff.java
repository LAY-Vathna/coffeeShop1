import java.sql.Date;
import java.time.Year;

public class Staff {
    int staff_id; // 1, 2, 3
    String staff_name; // "John Doe", "Jane Smith"
    String staff_role; // "Manager", "Developer"
    String staff_photo; // "photo1.jpg", "photo2.png"
    String email;
    String phoneNumber; //012123456, 011121314
    int age;
    Date dob;
    String working_shift;// "Morning", "Evening", "Night"
    char staff_gender; // "M" or "F" or "O" for other
    String address; // "123 Main St", "456 Elm St"
    Date dateOfJoining; // "2023-01-01", "2022-05-15"
    int workingExperience; // in years, e.g., 5, 10
    String bankAccountNumber; // 123456789, 987654321
    double salary; // 50000.0, 60000.0
    String password;
    int id=1;

    //create staff
    public Staff(String staff_name, String staff_role, String email, String phoneNumber, Date dob, String working_shift,
            char staff_gender, String address, Date dateOfJoining, int workingExperience, String bankAccountNumber,
            double salary, String password) {
        this.staff_id = id++;
        this.staff_name = staff_name;
        this.staff_role = staff_role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.age = Year.now().getValue() - dob.toLocalDate().getYear(); // Calculate age from DOB
        this.working_shift = working_shift;
        this.staff_gender = staff_gender;
        this.address = address;
        this.dateOfJoining = dateOfJoining;
        this.workingExperience = workingExperience + (Year.now().getValue() - dateOfJoining.toLocalDate().getYear());
        this.bankAccountNumber = bankAccountNumber;
        this.salary = salary;
        this.password = password;
    }
    //create staff with email and password only
    public Staff(String email, String password) {
        this.email = email;
        this.password = password;
    }

    

    

}
