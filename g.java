import java.util.Scanner;
public class g{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        System.out.println("Enter your character limit:"+s);
        for(char i = 'A'; i<= s ;i++ ){
            for(char j = 'A'; j<=s ;j++){
                System.out.print(j);
            }
        
        System.out.println();
        }
    }
}
/*A B C D 
  A B C D
  A B C D
  A B C D*/