
import java.util.Scanner;
public class t{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number limit:");
        int s = sc.nextInt();
        
        for(int i = 1;i<=s;i++){
            for(int j = 1;j<=s;j++){
                
                
                if(i==2 || i == 3|| i == 4|| i == 5){
                     System.out.print( i*j +" " );
                 
                } else{
                     System.out.print( j+" " );
                }
                
        }
        System.out.println();


    }
} }
/* pattern 14 */