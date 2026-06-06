import java.util.Scanner;
public class  h{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Enter the rectangle length:"+i);
        int j = sc.nextInt();
         System.out.println("Enter the rectangle breadth:"+j);
        for(int a=1;a<=i;a++){
            for( int b = 1; b<=j;b++){
                System.out.print("* ");
                 // rectaangle pattern
            }
            System.out.println();
        }
    }
}
/* * * * * * *
   * * * * * *
   * * * * * *
   * * * * * * 
     */