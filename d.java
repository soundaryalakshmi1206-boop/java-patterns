import java.util.Scanner;
 class d{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
// so here we using the i is the output so its like the 1 1 2 2 based on the n
/* 1111
   2222
   3333
   4444
 */
