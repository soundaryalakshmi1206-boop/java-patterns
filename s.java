
import java.util.Scanner;
public class s{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number limit:");
        int s = sc.nextInt();
        int num = 2;
        for(int i = 1;i<=s;i++){
            for(int j = 1;j<=s;j++){
                
                System.out.print( num+" " );
                num = num +1;
               num++;
        }
        System.out.println();


    }
} }
/* 
2 4 6 8
10 12 14 16
18 20 22 24
26 28 30 32
*/
