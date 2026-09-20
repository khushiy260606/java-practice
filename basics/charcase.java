 import java.util.Scanner;
 class charcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
      //  if (ch>=65 && ch<=90){
        //    System.out.println(ch+" is uppercase");
        //}
        //else if (ch>=97 && ch<=120) {
          //  System.out.println(ch+" is lowercase");
        //}else{
          //  System.out.println("invalid");
        //}
        if( ch >= 'a'&& ch <= 'z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
        sc.close();
        }
}
