import java.util.Date;

public class accountPQLL implements accountInterface {
    @Override
    public Date getDateCreated() {
        return null;
    }

    @Override
    public double getBallance() {
        return 0;
    }

    @Override
    public int getCustomerID() {
        return 0;
    }

    @Override
    public transactions getTransactionList() {
        return null;
    }

    @Override
    public void setBallance(double ballance) {

    }

    @Override
    public void setDateCreated(Date dateCreated) {

    }

    @Override
    public void setCustoerID(int id) {

    }

    public class node<account> {
        private account data;
        private accountPQLL.node next;
        private int priorioty;

        node() {
            int priority;
            account data;
            custPQLL.node next;
        }

        public node(account data, int prioroty) {
            this.data = data;
            this.next = null;
            this.priorioty = prioroty;
        }

        public void setData(account data) {
            this.data = data;
        }

        public void setNext(accountPQLL.node node) {
            this.next = node;
        }

        public void setPriorioty(int priorioty) {
            this.priorioty = priorioty;
        }


        public boolean hasNext() {
            if (this.next != null) {
                return true;
            } else {
                return false;
            }
        }

        public account getData() {
            return this.data;
        }


    }

    public void listALL() {

    }

    public account getHead(){
       return this.getHead();
    }

    /*
    public custPQLL.node pop();
    public void removeObj(T data);
    public boolean isEmpty();
    public void enqueue(account data, int pri);

     */
}



