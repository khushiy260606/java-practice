import java.util.Scanner;
class occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long no = sc.nextLong();
        int key = sc.nextInt();
        int count = 0;
        while (no > 0){
            long lastdigit = no % 10;
            if (lastdigit == key){
                count ++;
            }
             no = no / 10;
        }
        System.out.println(count);
        sc.close();
        }
}
