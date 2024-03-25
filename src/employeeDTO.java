public class employeeDTO implements employeeDTOInter{
    public int employeeID =0;
    public String fName ="";
    public String lName ="";

    public String getFName() {
        return this.fName;
    }
    public String getLName() {
        return this.lName;
    }
    public int getEmolpyeeID() {
        return this.employeeID;
    }

    public void setFName(String fn){this.fName = fn;}
    public void setLName(String ln){this.lName = ln;}
    public void setFName(int id){this.employeeID = id;}
}
