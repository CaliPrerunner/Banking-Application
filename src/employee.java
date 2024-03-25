public class employee implements employeeInterface{
    private int employeeID;
    private String firstName;
    private String lastName;
    private String bday;
    private String eMail;
    private String department;
    private String username;
    private String phone;
    private char gender;
    private double salary;

    public employee(){

    }

    public employee(int id, String username, String email, String phone){
        this.employeeID = id;
        this.username = username;
        this.eMail = email;
        this.phone = phone;
    }

    public employee(int id, String fn, String ln, String bday, String email, String dpt, char gen, double sal, String user, String phone){
        this.employeeID = id;
        this.firstName = fn;
        this.lastName = ln;
        this.bday = bday;
        this.eMail = email;
        this.department = dpt;
        this.gender = gen;
        this.salary = sal;
        this.username = user;
        this.phone = phone;
    }

    public String getFName() {
        return this.firstName;
    }
    public String getLName() {
        return this.lastName;
    }
    public int getEmolpyeeID() {
        return this.employeeID;
    }
    public String getBday() {
        return this.bday;
    }
    public String getEmail() {
        return this.eMail;
    }
    public String getDepartment() {
        return this.department;
    }
    public char getGender() {
        return this.gender;
    }
    public double getSalary() {
        return this.salary;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setFName(String fn){this.firstName = fn;}
    public void setLName(String ln){this.lastName = ln;}
    public void setEmployeeID(int id){this.employeeID = id;}
    public void setBday(String bday){this.bday = bday;}
    public void setEmail(String email){this.eMail = email;}
    public void setDepartment(String dpt){this.department = dpt;}
    public void setGender(char gen){this.gender = gen;}
    public void setSalary(double sal){this.salary = sal;}
    public void setUsername(String username) {this.username = username;}
    public void setPhone(String phone) {this.phone = phone;}
}