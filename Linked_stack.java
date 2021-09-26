import java.util.*;

public class Linked_stack {
    static class Node{
        int value;
        Node next;

        Node(int key){
            value=key;
            next=null;
        }
        
    }
    static int count=0;
    static Node head;
    static Node tail;
    
    // Linked_stack(int key){
    //     head=new Node(key);
    //     tail=head;
    //     count++;
    // }
    public static void push(int key){
        Node newNode=new Node(key);
        tail.next=newNode;
         tail=tail.next;
         count++;
    }

    public static int pop(){
        Node temp=head;
        if(head==null){
            System.out.println("Not possible");
            return -1;
        }
        if(head==tail){
            int x=head.value;
            head=null;
            tail=head;
            return x;
        }
        while(temp.next!=tail){
            temp=temp.next;
        }
        int x=tail.value;
        tail=temp;
        tail.next=null;
        count--;
        return x;
    }
    public static void printNode(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }   
   }

    public static void main(String[] args){
        
        System.out.println("Enter total number to be pushed");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        head=new Node(0);
        tail=head;
        for(int i=0;i<n;i++){
            System.out.println("Enter the number to be pushed");
            int num=sc.nextInt();
            if(i==0){
                head.value=num;
            }
            else{
                push(num);

            }
        }
        printNode(head);
        System.out.println("element pooped"+pop());
        System.out.println("element pooped"+pop());
        System.out.println("element pooped"+pop());
        printNode(head);
        
        sc.close();
    }


    
}
