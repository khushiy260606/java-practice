import java.util.Scanner;

class methods {
    public static void main(String[] args) {
        int ans = sum(20,30);
        System.out.println(ans);
        Scanner sc = new Scanner (System.in);
        String name2 = sc.next();
        String intro = name(name2);
        System.out.println(intro);
        sc.close();

    }
    
    // FOR STRING ARGUEMENTS
    static String name(String name1){
        String msg = "hello " + name1;
        return msg;
        }
        // FOR INTEGER ARGUEMENTS
    static int sum(int a, int b){
        int sum =  a+b;
        return sum;
    }
}
