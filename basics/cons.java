// WAP to store students information[name,roll no,age,contact no, address] inside of an array where user is going to decide the num of students and info about students.
import java.util.Scanner;
class students{
    String name;
    int rollno;
    int age;
    long contactno;
    String address;
    students(String name,int rollno,int age,long contactno,String address){
        this.name = "babla";
        this.rollno = 21;
        this.age = 20;
        this.contactno = 1234567890L;
        this.address = "xyz";
    }
}
class cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in
            
        );
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        students[] s = new students[n];
        for(int i=0;i<n;i++){
          //  s[i] = new students();
            System.out.println("Enter the name of student "+(i+1)+":");
           // s[i].name = sc.next();
           System.out.println("Enter the roll no of student "+(i+1)+":");
          //  s[i].rollno = sc.nextInt();
           System.out.println("Enter the age of student "+(i+1)+":");
           // s[i].age = sc.nextInt();
            System.out.println("Enter the contact no of student "+(i+1)+":");
           // s[i].contactno = sc.nextLong();
            System.out.println("Enter the address of student "+(i+1)+":");
          //  s[i].address = sc.next();
        }
        System.out.println("Student Information:");
        for(int i=0;i<n;i++){
            System.out.println("Name: "+s[i].name);
            System.out.println("Roll No: "+s[i].rollno);
            System.out.println("Age: "+s[i].age);
            System.out.println("Contact No: "+s[i].contactno);
            System.out.println("Address: "+s[i].address);
        }
        sc.close();
    }
    
}
