import java.util.Date;

public interface customerInterface {
      String firstName = null;
    String lastName = null;
     String SSN= null;
     String userName= null;
     String password= null;
     String phone= null;
     String birthday= null;
     char gender= ' ';
     Date dateCreated= null;
     PQLL accounts = null;
     String addy = null;
    int customerID=0;
    public void setAddy(String addy);

    public void setBirthday(String birthday);

    public void setCustomCustomerID(int customerID);

    public void createAndSetCustomerID();
    public void setFirstName(String firstName);
    public void setGender(String gender) ;

    public void setLastName(String lastName) ;

    public void setPassword(String password) ;

    public void setPhone(String phone) ;

    public void setSSN(String SSN) ;

    public void setCustID(int idd);
    public void setAccList(PQLL list);
    public void setUserName(String userName) ;
    public String getCustAccList();
    public int getNumOfAccs();
    public double getTotalCustBall();
    public void createBankAccount(double m);
    public void deposit(double m, int x);
        public void withdraw(double m, int x);

    public int getCustomerID();

    public String getFirstName();
    public String getSSN();
    public String getLastName() ;
    public String getGender() ;
    public String getBirthday() ;
    public String getPassword() ;
    public String getPhone() ;
    public String getUserName() ;
    public String getAddy();




}
