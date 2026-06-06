
import java.util.Scanner;
public class q{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character limit:");
        char s = sc.next().charAt(0);
        int num = 65;
        for(char i = 'A';i<= s;i++){
            for(char j = 'A';j<=s;j++){
                System.out.print( (char)num+" " );
               num++;
        }
        System.out.println();


    }
} }
/* pattern - 11 */