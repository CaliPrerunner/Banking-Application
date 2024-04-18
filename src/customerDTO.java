//import java.time.LocalDate;
//import java.util.Date;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class customerDTO implements customerInterface{
//
//        private String firstName;
//        private String lastName;
//        private String SSN;
//        private String userName;
//        private String password;
//        private String phone;
//        private String birthday;
//        private String gender;
//        private LocalDate dateCreated;
//        private PQLL accounts;
//        int customerID;
//
//        private String addy;
//        //^linked list of addy <- ********implement after linked list object has been created***********
//
//
//    public customerDTO(){
//
//    }
//    //constructor that generates custID and gets the local date of now
//    public customerDTO(String fn, String ln, String ssn, String addyStreet, String addyCity, String addyState, String addyz, String userN, String passw, String phon, String bday, String sex) {
//        this.dateCreated = LocalDate.now();
//        this.firstName = fn;
//        this.lastName = ln;
//        this.SSN = ssn;
//        this.addy = "LN:" + ln + " FN:" + fn + " STR:" + addyStreet + " C:" + addyCity + " ST:" + addyState + " Z:" + addyz;
//        this.userName = userN;
//        this.password = passw;
//        this.phone = phon;
//        this.birthday = bday;
//        this.gender = sex;
//        this.customerID = (int) (Math.random() * 1000);
//        this.accounts = new PQLL();
//
//        //later to implement: a checker to see if ID has been taken
//    }
//    //constructor for all var's
//    public customerDTO(int customerID,String fn, String ln, String ssn, String userN, String passw, String phon, String bday, String sex,LocalDate date,String addy) {
//        this.dateCreated = date;
//        this.firstName = fn;
//        this.lastName = ln;
//        this.SSN = ssn;
//        this.addy = addy;
//        this.userName = userN;
//        this.password = passw;
//        this.phone = phon;
//        this.birthday = bday;
//        this.gender = sex;
//        this.customerID = customerID;
//        this.accounts = new PQLL();
//
//        //later to implement: a checker to see if ID has been taken
//    }
//        //normal getters/setters
//        public int getCustomerID() {
//        return customerID;
//    }
//        public String getFirstName() {
//        return firstName;
//    }
//        public String getSSN() {
//        return SSN;
//    }
//        public String getLastName() {
//        return lastName;
//    }
//        public String getGender() {
//        return gender;
//    }
//        public String getBirthday() {
//        return birthday;
//    }
//        public String getPassword() {
//        return password;
//    }
//        public String getPhone() {
//        return phone;
//    }
//        public String getUserName() {
//        return userName;
//    }
//    //return a human readable string representing of address
//        public String returnAddy(){
//        String addy = "First name: " + this.addy.substring((this.addy.indexOf("FN:") + 3), (this.addy.indexOf("STR:"))) + " Last name: " + this.addy.substring((this.addy.indexOf("LN:") + 3), (this.addy.indexOf("FN:"))) +"Street:" + this.addy.substring((this.addy.indexOf("STR: ") + 4), (this.addy.indexOf("C:"))) + " City: " + this.addy.substring((this.addy.indexOf("C:") + 2), (this.addy.indexOf("ST:"))) + "\nState: " + this.addy.substring((this.addy.indexOf("ST:") + 3), (this.addy.indexOf("Z:"))) + " Zip Code: " + this.addy.substring((this.addy.indexOf("Z:") + 2), (this.addy.length()));
//        return addy;
//    }
//    public String getAddy(){return addy;}
//
//
//
//
//    //account logic
//
//        public PQLL getAccList(){
//        return this.accounts;
//    }
//        //returns how many accounts the customer has
//        public int getNumOfAccs(){return this.accounts.getCount();}
//        //returns a sting of account of a customer ballance via a string
//        public String getCustAccList(){
//        if(this.accounts == null){
//            return null;
//        }else{
//            //"s: indicates its the start of the string
//            String ballList ="";
//            for(int x=1; x<= this.accounts.getCount(); x++){
//                bankAccount t = (bankAccount) this.getAccList().getNode(x).getData();
//                ballList += String.valueOf(t.getBalance()) + " ";
//
//            }
//            return ballList;
//        }
//    }
//        //returns 0 if nothing, returns double of total account ballance
//        public double getTotalCustBall(){
//        if(this.accounts == null){
//            return 0;
//        }else{
//            double ballList =0;
//            for(int x=1; x<= this.accounts.getCount(); x++){
//                bankAccount t = (bankAccount) this.getAccList().getNode(x).getData();
//                ballList += t.getBalance();
//
//            }
//            return ballList;
//
//        }
//    }
//        //adds account obj with priority and ballance created
//        public void createBankAccount(double m){
//        int id = this.customerID;
//        LocalDate d = LocalDate.now();
//        bankAccount t = new bankAccount(m,d, id);
//        this.getAccList().enqueue(t,this.compareAccounts(d));
//    }
//        public void createBankAccount(LocalDate d){
//        int id = this.customerID;
//        bankAccount t = new bankAccount(12,d,id);
//        this.getAccList().enqueue(t,this.compareAccounts(d));
//    }
//        public void createBankAccount(LocalDate d, Double ball){
//        int id = this.customerID;
//        bankAccount t = new bankAccount(ball,d,id);
//        this.getAccList().enqueue(t,this.compareAccounts(d));
//    }
//        //does not work
//        public void deposit(double m, int x){
//        bankAccount t = (bankAccount) this.getAccList().getNode(x).getData();
//        t.deposit(m);
//    }
//        public void withdraw(double m, int x){
//        bankAccount t = (bankAccount) this.getAccList().getNode(x).getData();
//        t.withdraw(m);
//    }
//        public void printTransactionList(int accountIndex) {
//        bankAccount t = (bankAccount) this.getAccList().getNode(accountIndex).getData();
//
//        for (Map.Entry<Date, Double> entry : t.getTransactionList().entrySet()) {
//            System.out.println("Date: " + entry.getKey() + " Transaction: " + entry.getValue());
//        }
//
//    }
//
//
//
//
//        public void setAddy(String addy) {
//        this.addy = addy;
//    }
//        public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//        public void setCustomCustomerID(int customerID) {
//        this.customerID = customerID;
//    }
//        public void createAndSetCustomerID(){this.customerID = (int) (Math.random() % 1000);}
//        public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//        public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//        public void setPassword(String password) {
//        this.password = password;
//    }
//        public void setPhone(String phone) {
//        this.phone = phone;
//    }
//        public void setSSN(String SSN) {
//        this.SSN = SSN;
//    }
//        public void setCustID(int idd){this.customerID=idd;}
//        public void setAccList(PQLL list){this.accounts = list;}
//        public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//
//
//
//
//
//
//        //this will be used to compare the account objects in the PQLL accounts variable and used to compare the priorties
//        //will be used when creating and adding accounts
//        public int compareAccounts(LocalDate d){
//        //if list is empty retuns 1, highest priority
//        if (this.accounts.isEmpty()) {
//            return 1;
//        }
//        int s = 1;
//        PQLL.node current = this.accounts.getHead();
//        bankAccount curr;
//        TreeMap<LocalDate, Double> dateTree = new TreeMap<>();
//
//
//        for (int x = 1; x <= this.accounts.getCount(); x++) {
//            curr = (bankAccount) current.getData();
//            dateTree.put(curr.dateCreated, curr.ballance);
//            current = current.getNext();
//        }
//        dateTree.put(d, 1.0);
//        for (Map.Entry<LocalDate, Double> entry : dateTree.entrySet()) {
//            System.out.println("Date: " + entry.getKey() + ", Ballance: " + entry.getValue());
//        }
//        for (LocalDate p : dateTree.navigableKeySet()) {
//            if (p.equals(d)) {
//                return s;
//            }
//            s++;
//        }
//        return s;
//
//    }
//
//
//        //dto specific methods
//    public static customer customerByDTO(int cid) {
//        customer cust = null;
//
//
//        return null;
//    }
//}
