import java.util.Scanner;
 class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                   
        char n = sc.next().charAt(0);
        System.out.println((int)n);
        for(char i = 'A' ; i<= n;i++){
            for(char j = 'A';j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
// charracter limit of d 
/*A A A A
  B B B B
  C C C C
  D D D D
   */