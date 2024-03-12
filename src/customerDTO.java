import java.util.Date;

public class customerDTO {

    private String firstName;
    private String lastName;
    private String SSN;
    private String userName;
    private String password;
    private String phone;
    private String birthday;
    private char gender;
    private int customerID;
    private Date dateCreated;
    private custPQLL<account> accounts;

    private String addy;
    //^linked list of addy <- ********implement after linked list object has been created***********

    public customerDTO(){

    }

    public customerDTO(String fn, String ln, String ssn, String addyStreet, String addyCity, String addyState, String addyz, String userN, String passw, String phon, String bday, char sex) {
        this.firstName = fn;
        this.lastName = ln;
        this.SSN = ssn;
        this.addy = "LN:" + ln + " FN:" + fn + " STR:" + addyStreet + " C:" + addyCity + " ST:" + addyState + " Z:" + addyz;
        this.userName = userN;
        this.password = passw;
        this.phone = phon;
        this.birthday = bday;
        this.gender = sex;
        this.customerID = (int) (Math.random() % 1000);
        this.accounts = new custPQLL<account>();
        //later to implement: a checker to see if ID has been taken
    }


    public customerDTO(int customerID){
        this.customerID = customerID;
    }


    public int getCustomerID() {
        return customerID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSSN() {
        return SSN;
    }
    public String getLastName() {
        return lastName;
    }
    public char getGender() {
        return gender;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getPassword() {
        return password;
    }
    public String getPhone() {
        return phone;
    }
    public String getUserName() {
        return userName;
    }
    public custPQLL getAccList(){
        return this.accounts;
    }
    public String getCustBall(){
        if(this.accounts == null){
            return null;
        }else{
            //"s: indicates its the start of the string
            String ballList ="S:";
            for(int x=1; x<= this.accounts.getCount(); x++){
                account t = (account) this.getAccList().getNode(x).getData();
                ballList += String.valueOf(t.getBallance()) + " ";

            }
            return ballList;
        }
    }
    public int getNumOfAccs(){return this.accounts.getCount();}
    public double getTotalCustBall(){
        if(this.accounts == null){
            return 0;
        }else{
            double ballList =0;
            for(int x=1; x<= this.accounts.getCount(); x++){
                account t = (account) this.getAccList().getNode(x).getData();
                ballList += t.getBallance();

            }
            return ballList;

        }
    }
    public void createBankAccount(double m){
        int id = this.customerID;
        account t = new account(m,id);
        this.getAccList().enqueue(t,1);
    }
    public void addTransaction(double m){
        account t = (account) this.getAccList().getNode(1).getData();
        t.transactionList.deposit(m,t);
    }
    public void getAddy() {
        System.out.println("First name: " + this.addy.substring((this.addy.indexOf("FN:") + 3), (this.addy.indexOf("STR:"))) + " Last name: " + this.addy.substring((this.addy.indexOf("LN:") + 3), (this.addy.indexOf("FN:"))));
        System.out.println("Street:" + this.addy.substring((this.addy.indexOf("STR: ") + 4), (this.addy.indexOf("C:"))) + " City: " + this.addy.substring((this.addy.indexOf("C:") + 2), (this.addy.indexOf("ST:"))) + "\nState: " + this.addy.substring((this.addy.indexOf("ST:") + 3), (this.addy.indexOf("Z:"))) + " Zip Code: " + this.addy.substring((this.addy.indexOf("Z:") + 2), (this.addy.length())));
    }
    public static void getAddy(customerDTO obj) {
        System.out.println("First name: " + obj.addy.substring((obj.addy.indexOf("FN:") + 3), (obj.addy.indexOf("STR:"))) + " Last name: " + obj.addy.substring((obj.addy.indexOf("LN:") + 3), (obj.addy.indexOf("FN:"))));
        System.out.println("Street:" + obj.addy.substring((obj.addy.indexOf("STR: ") + 4), (obj.addy.indexOf("C:"))) + " City: " + obj.addy.substring((obj.addy.indexOf("C:") + 2), (obj.addy.indexOf("ST:"))) + "\nState: " + obj.addy.substring((obj.addy.indexOf("ST:") + 3), (obj.addy.indexOf("Z:"))) + " Zip Code: " + obj.addy.substring((obj.addy.indexOf("Z:") + 2), (obj.addy.length())));
    }
    public static String returnAddy(customerDTO obj){
        String addy = "First name: " + obj.addy.substring((obj.addy.indexOf("FN:") + 3), (obj.addy.indexOf("STR:"))) + " Last name: " + obj.addy.substring((obj.addy.indexOf("LN:") + 3), (obj.addy.indexOf("FN:"))) +"Street:" + obj.addy.substring((obj.addy.indexOf("STR: ") + 4), (obj.addy.indexOf("C:"))) + " City: " + obj.addy.substring((obj.addy.indexOf("C:") + 2), (obj.addy.indexOf("ST:"))) + "\nState: " + obj.addy.substring((obj.addy.indexOf("ST:") + 3), (obj.addy.indexOf("Z:"))) + " Zip Code: " + obj.addy.substring((obj.addy.indexOf("Z:") + 2), (obj.addy.length()));
        return addy;
    }
    public String returnAddy(){
        String addy = "First name: " + this.addy.substring((this.addy.indexOf("FN:") + 3), (this.addy.indexOf("STR:"))) + " Last name: " + this.addy.substring((this.addy.indexOf("LN:") + 3), (this.addy.indexOf("FN:"))) +"Street:" + this.addy.substring((this.addy.indexOf("STR: ") + 4), (this.addy.indexOf("C:"))) + " City: " + this.addy.substring((this.addy.indexOf("C:") + 2), (this.addy.indexOf("ST:"))) + "\nState: " + this.addy.substring((this.addy.indexOf("ST:") + 3), (this.addy.indexOf("Z:"))) + " Zip Code: " + this.addy.substring((this.addy.indexOf("Z:") + 2), (this.addy.length()));
        return addy;
    }

    public void setAddy(String addy) {
        this.addy = addy;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setCustomCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void createAndSetCustomerID(){this.customerID = (int) (Math.random() % 1000);}
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }






    //dto specific methods
    public static customer customerByDTO(int cid) {
        customer cust = null;


        return null;
    }
}
