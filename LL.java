package LuffyLinkedList;
public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int val){
        if(size==0){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node curr=get(index);
        Node node=new Node(val);
        node.next=curr.next;
        curr.next=node;
        size++;
    }
    public int deleteFirst(){
        int val= head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val= tail.val;
        Node secondLast=get(size-1);
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }
    public void display(){
        Node t=head;
        while(t!=null){
            System.out.print(t.val+"->");
            t=t.next;
        }
        System.out.println("END");
    }
    public Node get(int index){
        Node t=head;
        for(int i=1;i<index;i++){
            t=t.next;
        }
        return t;
    }
    private class Node{
        private int val;
        private Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
