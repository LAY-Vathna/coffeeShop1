package users;

public class Staff extends Account{

    private String role;
    private float salary;

    public Staff(String name, String email, String password, String phoneNumber, String role, float salary) {
        super(name, email, password, phoneNumber);
        setRole(role);
        setSalary(salary);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        // Validate role if needed
        if (role == null || role.isEmpty()) {
            System.out.println("Role cannot be empty.");
            this.role = "Staff";
        } else {
            this.role = role;
        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        // Validate salary if needed
        if (salary < 200 || salary > 10000) {
            System.out.println("Salary cannot be negative.");
            this.salary = 200;
        } else {
            this.salary = salary;
        }
    }



    
    @Override
    public String toString() {
        return super.toString()+"Staff [role=" + role + ", salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            Staff other = (Staff) obj;
            if(this.role.equals(other.role) && this.salary == other.salary) {
                return true;
            }
        }
        return false;
    }
    

    

}
