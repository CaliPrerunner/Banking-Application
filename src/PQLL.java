
public class PQLL<T extends Comparable<T>> implements PQLLInterface<T> {
    private node head;
    private int count;



    public class node<T extends Comparable<T>>{
        private T data;
        private node next;
        private int priorioty;

        node(){
            int priority;
            T data;
            node next;
        }
        public node(T data, int prioroty){
            this.data = data;
            this.next = null;
            this.priorioty = prioroty;
        }
        public node(T data){
            this.data = data;
            this.next = null;
            this.priorioty = 0;
        }
        public void setData(T data){this.data =data;}
        public void setNext(node node){this.next =node;}
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
        public node getNext(){return this.next;}

        public int compareTo(T d) {
            return d.compareTo(this.data);
        }
    }

    public PQLL() {
        this.count =0;
        this.head = new node();

    }

    public PQLL(T data, int prority) {
        this.count =0;
        this.head = new node<>(data, prority);

    }









    //******************************Priority Queue methods************************************



    //clears whole list
    public void clear(){
        this.head = null;
    }
    //returns the object of the highest priority
    public node getHead(){
        return this.head;
    }
    //gets the length of the priority queue list
    public int getCount(){return count;}


    public void listALL(){
        System.out.println("########### LIST ##########");
        node current = this.head;
        for(int x=1; x<=this.count;x++){
            System.out.println("data: "+ current.data + " priority: "+ current.priorioty+ " NEXT value: "+ current.next);
            current = current.next;
        }

    }
    public void removeObj(T data){
        node current = this.head;
        node prev = null;

        while(current.hasNext()){

            if(current.data == data)
            {System.out.println(" current data: "+ current.data+ " prev data: ");
                prev = current;
                prev.next = current.next;
                break;
            }
            current = current.next;
        }
    }

    //check to see if given data is in node
    public boolean contains(T data){
        node current = this.head;

        while(current.data != data ){
            current = current.next;
            if(current.next == null){
                return false;}
        }
        return true;
    }

    public boolean isEmpty() {
        return head.data == null;
    }

    //gets a node from a given index in the list
    public node getNode(int index){
        if(this.count ==index){
            return this.pop();
        }else{
            node n = this.head;
            for(int x=1; x<index;x++){
                n = n.next;
            }
            return n;
        }
    }


    //finds the node index based on the data passed
    //returns 0 for none & 1 for head
    public int findNode(T data){

        if(this.head.data ==data){
            return 1;
        }node n = this.head;
            for (int x = 1; x <= this.count; x++) {
                if (n.data == data) {
                    return x;
                } else {
                    n = n.next;
                }
            }

        return 0;
    }

    //inserts new node after the current node
    public void insertAfter(node newNode, node currentNode){
        newNode.next= currentNode.next;
        currentNode.next = newNode;
        this.count++;
    }


public void compareNode(node newNode){

        //use recusion to find the node in the list

    node current = new node();
    current = this.head;

    switch (newNode.compareTo(current.getData())) {
        case 1:
            //newNode is higher priority
            System.out.println("Higher");
        case -1:
            //newNode is lower priority
            System.out.println("lower");
            current =current.next;
        case 0:
            //they are the same
            System.out.println("same");

    }
}

    //creates new node from data, adds it based on the priority
    //compares prioroity and places it based off that
    public void enqueue(T data) {

        //  WHEN THE NODES GET TO THE COMPARE TO METHOD, THEY ARE
        //NULL that is why compare to method is not working
        node newNode = new node(data);
        node current = new node();
        current = this.head;
       if(this.head.data == null){
           this.head = newNode;
       }else {
           System.out.println("compare to method: " + newNode.getData().compareTo(current.getData()));
           switch (newNode.compareTo(current.getData())) {
               case 1:
                   //newNode is higher priority
                   System.out.println("Higher");
                   //need to swap the newNode with the current node
               case -1:
                   //newNode is lower priority
                   System.out.println("lower");
                   //have to loop until it finds a node where the newnode
                   //is of higher priority than some of the nodes in the list
                   current =current.next;
               case 0:
                   //they are the same
                   //imput the new node right after the current
                   System.out.println("same");

           }
       }


/*
        //if the head is null or the heads priority is greater than the
        //new priority, it will replace the head
        if(current.data == null || current.priorioty > pri) {
           if(current.data == null){
               this.head = newNode;
           }else{
               newNode.next = current;
               this.head = newNode;
           }
        }
        //while there is a node after the current and
        while(current.next!=null && current.next.priorioty <= pri ){
            current = current.next;
        }
        //checking to see if we are at the end of the priority queue
        if(current.next == null) {
            current.next = newNode;
        }else {
            newNode.next = current.next;
            current.next = newNode;
        }
        this.count++;
*/
        }
        //returns the object of the highest priority
    public node peek(){
        return this.head;
    }

        //returns the last node in the list
    public node pop() {
        node current = this.head;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }

    //removes the last entry
    public void deque(){
        node n = new node();

        n = this.head;
        while(n.next.next != null){
            n = n.next;
        }
        n.next = null;
    }





}
