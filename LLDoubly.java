public class LLDoubly {
      public Node head;
      public Node tail;
      public int size;
        LLDoubly(){
            size=0;   
        }

        public int insertFirst(int val){
            Node node=new Node(val);
            
            node.next=head; 
            node.prev=null;
            
            if(head!=null){
                head.prev=node;
            }
            head=node;
            if(size==0){
                tail=head;
            }
            size++;
           return node.value;
        }

        public void display(){
            Node temp=head;
            
            while(temp!=null){
            
                System.out.print(temp.value+"<-->");
                
                temp=temp.next;
               
            }
            System.out.print("End");
            System.out.println();

            Node last=tail;
            while(last!=null){
                System.out.print(last.value+"-->");
                last=last.prev;
            }
            System.out.print("End");
            System.out.println();
        }


        public void insertLast(int val){
            Node node=new Node(val,null,tail);
            tail.next=node;
            tail=node;
            size++;
        }

        public void insertatele(int value,int insertingval){
            Node node=getEle(value);
            Node tempforwardpath=node.next;
            Node insertNode=new Node(insertingval,tempforwardpath,node);
            node.next.prev=insertNode;
            node.next=insertNode;
            size++;
        }

        public Node getEle(int val){
           Node node=head;
            while(node.value!=val){
                node=node.next;
            }

            return node;
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
