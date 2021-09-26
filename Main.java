public class Main{
    public static void main(String[] args){
        int rows=5;
        for(int i=1;i<=5;i++)
        for(int j=1;j<=rows-i;j++){
            System.out.print("* ");
            System.out.println();
        }
        System.out.println("\n");
    }
}