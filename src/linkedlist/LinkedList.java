package linkedlist;

public class LinkedList {
    Node headNode;

    /*
    * insert
    * */
    public void insert(int value){
        Node newNode=new Node();
        newNode.value=value;
        /*
        * if we insert the value that will be the end of the linkedList
        * that's why next node is null in the single linkedList
        * */
        newNode.nextNode=null;

        /*
        * headNode!=null means, it's already created
        * */
        if(headNode!=null){
            /*
            * 1. assign the headNode(First Node) to a Node Reference(here n is the object reference)
            * 2. then run the while loop until get the nextNode becomes null
            * --> if it's becomes null, that's the before last node,
            * 3. then nextNode must be null, because it's a last element
            * 4. then assign the created above newNode as the nextNode for the last available node- n.nextNode=newNode;
            * */
            //1
            Node n=headNode;

            //2
            while (n.nextNode!=null){
                n=n.nextNode;
            }
            //3
            n.nextNode=newNode;

            /*
            * if the headNode is null which is means that's the new Node in the LinkedList
            * */
        }else {
            headNode=newNode;
        }
    }

    /*
     * show
     * */
    public void show(){
        Node n=headNode;

        while (n.nextNode!=null){
            System.out.println(n.value);
            n=n.nextNode;
        }
        System.out.println(n.value);
    }

    /*
    * insert At Start
    * */
    public void insertAtStart(int value){
        /*
        * 1. create a Node object - newNode
        * 2. set the value to the newNode
        * 3. check if the headNode is already available or unavailable
        *  if it's available assign created Node Object next value as headNode ->newNode.nextNode=headNode;
        * 4. and change the value for the headNode as newNode
        * 5. if headNode is null which is means, it's a newNode assign to the headNode
        * */
        //1
        Node newNode=new Node();
        //2
        newNode.value=value;
        newNode.nextNode=null;

        //3
        if(headNode!=null){
            newNode.nextNode=headNode;
            //4
            headNode=newNode;
            //5
        }else{
            headNode=newNode;
        }
    }


    /*
    * insert At
    * */
    public void insertAt(int index,int value){
        /*
        * create n newNode with given value
        * */
        Node newNode=new Node();
        newNode.value=value;
        newNode.nextNode=null;

        /*
        * |11|43|55|63|23|
        *  0  1  2  3  4
        *
        * replaceable index is  2
        *
        *      ->100
        * |11|43|55|63|23|
        *  0  1  2  3  4
        *
        * 1. newNode = nextNode is 55
        * 2. index-1 nextNode is newNode
        *
        * */

        if(index==0){
            insertAtStart(value);
        }else{
            Node n=headNode;
            // 2-1= 1 <-index
            for(int i=0;i<index-1;i++){
                n=n.nextNode;
                //n=1; value is 43 ;|| n.nextNode is 55
                //now n is 2 ; 55

            }
            // store current 2nd index value to nextValue for the newNode
            newNode.nextNode=n.nextNode;
            // make index-1 value's nextNode as newNode
            n.nextNode=newNode;
        }
    }


    /*
    * delete At
    * */
    public void deleteAt(int index){
        if(index==0){
            headNode=headNode.nextNode;
        }else{
            Node n=headNode;
            for(int i=0;i<index-1;i++){
                n=n.nextNode;
            }
            Node n1=n.nextNode;
            n.nextNode=n1.nextNode;
            n1=null;
        }
    }
}















