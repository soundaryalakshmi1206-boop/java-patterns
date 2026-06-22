import java.util.Scanner;

public class u {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number limit:");
        int s = sc.nextInt();
        
        for(int i = 1; i <= s; i++) {
            for(int j = 1; j <= s; j++) {
                if(i == 1 || i == 3 || i == 5) {
                    System.out.print(j);
                } else if(i == 2) {
                    System.out.print("1");
                } else if(i == 4) {
                    System.out.print("2");
                } else {
                    System.out.print("3");
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
/* 
Pattern Name: Alternating Row Constant Pattern

Input:
5

Output:
12345
11111
12345
22222
33333
*/
