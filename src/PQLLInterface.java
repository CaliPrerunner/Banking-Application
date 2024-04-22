public interface PQLLInterface<T extends Comparable<T>> {

    public class node<T>{
        private T data;
        private PQLL.node next;
        private int priorioty;

        node(){
            int priority;
            T data;
            PQLL.node next;
        }
        public node(T data, int prioroty){
            this.data = data;
            this.next = null;
            this.priorioty = prioroty;
        }
        public void setData(T data){this.data =data;}
        public void setNext(PQLL.node node){this.next =node;}
        public void setPriorioty(int priorioty){this.priorioty = priorioty;}


        public boolean hasNext(){
            if(this.next !=null){
                return true;
            }else{
                return false;
            }
        }
        public T getData(){
            return this.data;
        }


    }
    //returns the object of the highest priority
    public PQLL.node getHead();    public boolean isEmpty(); public void clear();public void enqueue(T data);
    public void listALL();
    public int getCount();


    public PQLL.node pop();
    public void removeObj(T data);


}
