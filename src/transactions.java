import java.util.Date;

public class transactions {

    Date date;
    //used to mark if customer has withdrawed via a negative value and deposited money via a postivie value;
    double moneyMoved =0;

    public transactions(){

    }
    public transactions(double mm){
        this.moneyMoved = mm;
        this.date = new Date();
    }
    public transactions(double mm, Date d){
        this.moneyMoved = mm;
        this.date = d;
    }

    public void setDate(Date date) {this.date = date;}
    public Date getDate() {return date;}
    public void setMoneyMoved(double mm) {this.moneyMoved = moneyMoved;}
    public double getMoneyMoved(){return moneyMoved;}

}
