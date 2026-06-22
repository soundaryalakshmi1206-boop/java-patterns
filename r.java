
import java.util.Scanner;
public class r{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number limit:");
        int s = sc.nextInt();
        int num = 1;
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=s;j++){
                
                System.out.print( num+" " );
                num = num +1;
               num++;
        }
        System.out.println();


    }
} }
/* Pattern Name: Odd Number Matrix Pattern

Input:
5

Output:
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
*/
