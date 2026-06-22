import java.util.Scanner;
 class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        System.out.println("enter your character limit:"+s);
        for(char i = 'A';i<= s;i++){
            for(char j = 'A';j<=i;j++){
                System.out.println(j);
            }
        }

        
    }
    
}
/*
 A B C D
 A B C D
 A B C D
 A B C D*/
