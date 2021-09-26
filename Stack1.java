class Stack1{
    int top=0;
    
    int max1=10;
    int[] a=new int[max1];
    

    public void push(int elem){
        if(top>=max1){
            System.out.println("size exceeded");
            return;
        }
        a[top++]=elem;
               
    }


    public void pop(){
        if(top==-1){
            System.out.println("Nothing to pop");
            return;
        }
        int x=a[--top];
        System.out.print(x+" Popped");
        System.out.println();
    }


    public int peek(){
        return a[top];
    }
    public int size(){
        return top+1;
    }

    public void print(){
        if(a[0]==0){
            System.out.println("Empty");
        return;
        }
        for(int i=0;i<top;i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.println();
    }

    public static void main(String[] args){
        Stack1 st=new Stack1();
        st.push(1);
        st.push(20);
        st.print();
        st.pop();
        st.print();
    }
}
