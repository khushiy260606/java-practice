 import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        // TO PRINT FIBONACCI SERIES
       // for(int i = 0; i <= n ; i++){
        //    System.out.println(a + " ");
          //  int sum = a + b;
          //   a = b;
          //   b = sum;
        //}
        // TO FIND Nth FIBONACCI NUMBER
        for(int i =1; i <= n ; i++){
            int sum = a+b;
            a = b;
            b = sum;
        }
        System.out.println(a);
        sc.close();
    }
}
