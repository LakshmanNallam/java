public class LL {
    public Node head;
    public Node tail;
    public int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(size==0){
            tail=head;
        }
        size+=1;
    }

    public void bubbelSort(Node node,int row,int col){
        if(row==0){
            return;
        }

        if(col<row-2){
            if(node!=null && node.next!=null && node.value>node.next.value){
                if(head==node){
                    head=node.next;
                }
                
                System.out.println(head.value);
                Node temp=node.next;
                node.next=node.next.next;
                temp.next=node;
                
            }else{
                node=node.next;
            }
            System.out.println(node.value);
            System.out.println(node.next.value);
            System.out.println(node.next.value);
       
            System.out.println(node.value);
            bubbelSort(node, row, col+1);
        }else{
            display();
            bubbelSort(node, row-1, 0);
        }
   
    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            size+=1;
            return;
        }else{
            Node node=new Node(value);
            tail.next=node;
            tail=node;
            size+=1;
            return;
        }  
    }

    public void insert(int index,int value){
       
        if(index==0){
            insertFirst(value);
        }else if(index==size){
            insertLast(value);
        }else{
            Node tempnode=head;
          
            for(int i=1;i<index;i++){
                
                tempnode=tempnode.next;
            }
           

           Node node=new Node(value, tempnode.next);
  
           tempnode.next=node;    
            size++;
        }
    }

    public int deleteFirst(){
        int val=head.next.value;
        this.head=head.next;
        size--; 
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

       Node secondLast=getNode(size-2);
        //System.out.println(secondLast.value);
        tail=secondLast;
        tail.next=null;
        return 5;
    }
   
   

    public Node getNode(int index){
        Node node=head;
        
        for(int i=0;i<index;i++){
            node=node.next;
        }

    return node;
    }

    public int deleteNode(int index){
        if(index==0){
            return deleteFirst();    
        }else if(index== size-1){
            return deleteLast();
        }
 
        Node first=getNode(index-1);
        first.next=first.next.next;
        return first.next.value;
    }

    public void display(){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    class Node{
     
     public int value;
     
     public Node next;

     public Node(int value){
        this.value=value;
     }

     public Node(int value,Node next){
        this.value=value;
        this.next=next;
     }

    }
}
