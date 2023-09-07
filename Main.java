import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) {
        LL linkedlist=new LL();
        LLDoubly doublyLinkedList=new LLDoubly();
        LLCircular circularLinkedList=new LLCircular();
         linkedlist.insertFirst(2);
        
        linkedlist.insertFirst(8);
        linkedlist.insertFirst(9);
        
        linkedlist.insertLast(10);
    
        linkedlist.insertFirst(19);
        linkedlist.insertLast(40);

        linkedlist.insert(5, 43);
        
        //System.out.println(linkedlist.getNode(2).value);
        System.out.println(linkedlist.size);
     linkedlist.display();
       
       
        linkedlist.display();
        System.out.println();

        //linkedlist.deleteNode(3);
        //linkedlist.display();
        //System.out.println(linkedlist.tail.value);

        //linkedlist.display();

       /*doublyLinkedList.insertFirst(7);
        //System.out.println(doublyLinkedList.head.value);
      doublyLinkedList.insertFirst(8);
        //System.out.println(doublyLinkedList.head.value);
        doublyLinkedList.insertFirst(3);
        //System.out.println(doublyLinkedList.head.value);
        System.out.println(doublyLinkedList.tail.value);
        doublyLinkedList.insertLast(10);
        System.out.println(doublyLinkedList.tail.value);
        doublyLinkedList.insertatele(8,6);
        doublyLinkedList.display();*/

       /*  circularLinkedList.insertFirst(10);
        circularLinkedList.insertFirst(20);
        circularLinkedList.insertFirst(30);
        circularLinkedList.display();*/
        
    

        /*package whatever //do not write package name here */
        int[] arr = {1,2,3,5};
        int k = 3;
        PriorityQueue<cmclass> q=new PriorityQueue<>((a,b)->{
            if(b.getFraction()>a.getFraction()){
                return 1;
            }else if(b.getFraction()<a.getFraction()){
                return -1;
            }return 0;
        });



        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                q.add(new cmclass(arr[i],arr[j]));
                if(q.size()>k){
                    q.poll();
                }
            }
        }


        for(cmclass items:q){
            System.out.println(items.leftval+" "+items.rightval+" "+items.getFraction());
        }
        
        
        int[] nums={4,2,2,2,4,4,2,2};
        int limit=0;
        System.out.println(longestSubarray(nums, limit));

        PriorityQueue<Integer> minheap=new PriorityQueue<>();

    }


    public static  int longestSubarray(int[] nums, int limit) {
            PriorityQueue<Integer> minheap=new PriorityQueue<>();
            PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
            int start=0;
            int end=0;
            int maxlength=0;
            minheap.add(nums[end]);
            maxheap.add(nums[end]);
            while(end<nums.length && start<=end){
                
                while(end<nums.length && start<=end && Math.abs(maxheap.peek()-minheap.peek())<=limit){
                    maxlength=Math.max((end-start)+1,maxlength);
                    end++;
                    if(end<nums.length){
                        minheap.add(nums[end]);
                        maxheap.add(nums[end]);
                    }
                    
                }
                
                while(start<end && Math.abs(maxheap.peek()-minheap.peek())>limit){
                    minheap.remove(nums[start]);
                    maxheap.remove(nums[start]); 
                    start++;
                }
            }
            return maxlength;
                
        }

}