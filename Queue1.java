class Queue1{
    int front=0,rear=0;

    
    int max1=10;
    int[] a=new int[max1];
    

    public void push(int elem){
        if(front>=max1){
            System.out.println("size exceeded");
            return;
        }
        a[front++]=elem;
               
    }


    public void pop(){
        if(front==-1){
            System.out.println("Nothing to pop");
            return;
        }
        int x=a[rear++];
        System.out.print(x+" Popped");
        System.out.println();
    }


    public int peek(){
        return a[front];
    }
    public int size(){
        return front+1;
    }

    public void print(){
        if(a[0]==0){
            System.out.println("Empty");
        return;
        }
        for(int i=rear;i<front;i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.println();
    }

    public static void main(String[] args){
        Queue1 st=new Queue1();
        st.push(1);
        st.push(20);
        st.push(210);
        st.push(204);
        st.push(100);
        st.push(300);
        st.print();
        st.pop();
        st.pop();
        st.pop();

        st.print();
    }
}
