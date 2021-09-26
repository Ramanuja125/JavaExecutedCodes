import java.util.*;
public class linkedList {
    static class Node{
        int value;
        Node next;
        

        Node(int x){
          this.value=x;
          next=null;
       }
    }
    public static void printNode(Node head){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.value+" ");
             temp=temp.next;
         }   
    }

    public static void main(String[] args){
        Node head=new Node(0);
        Node temp=head;
      System.out.println("Enter total no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the no");
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            Node nextNode = new Node(c);

            if(head.value==0){
                head=nextNode;
                temp=head;
                continue;
            }

            temp.next=nextNode;
            temp=temp.next;
        }
        printNode(head);

            sc.close();
        
    }



    
}
