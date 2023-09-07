public class LLCircular {
    

    public Node head;
    public Node tail;
    public int size;
    LLCircular(){
        size=0;   
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=tail=node;    
        }
        else{
            node.next=head;
            head=node;
            tail.next=head;
        }   
    }

    public void display(){
        Node temp=head;
        System.out.println(temp.value);
        do{
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }while(temp!=head);
       
        System.out.println();
    }

    class Node{
        public int value;
         Node next;
         Node prev;
 
         Node(int val){
             this.value=val;
             this.prev=null;
             this.next=null;
         }
 
 
         Node(int val,Node next, Node prev){
             this.value=val;
             this.prev=prev;
             this.next=next;
         }
       }
}
