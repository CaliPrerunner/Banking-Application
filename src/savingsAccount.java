import java.time.LocalDate;

public class savingsAccount extends bankAccount {

    public savingsAccount(){
        super();
        this.type = "Savings Account";
    }
    public savingsAccount(double ball ){
        super();
        this.balance = ball;
        this.type = "Savings Account";
    }
    public savingsAccount(double ball,LocalDate d ){
        this.dateCreated = d;
        this.balance = ball;
        this.type = "Savings Account";
    }


    //returns -1 if this.XX is older than the obj being passed in
    //returns 1 if the.xx is younger than the obj being passed in
    //returns 0 if they are the same
    //**only works for savings account objects
    public int compareTo(bankAccount b){
        if(this.dateCreated.compareTo(b.dateCreated) < 0){
            return -1;
        }else if(this.dateCreated.compareTo(b.dateCreated) > 0){
            return 1;
        }else{ return 0;}
    }



}
