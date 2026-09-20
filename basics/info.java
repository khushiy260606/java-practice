import java.util.Scanner;

class info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your nickname: ");
        String nickname = sc.nextLine();
        System.out.print("Enter your 10th marks: ");
        double marks10th = sc.nextDouble();
        System.out.print("Enter your 12th marks: ");
        double marks12th = sc.nextDouble();
        System.out.print("Enter your phone number: ");
        String phoneNum = sc.next();
        sc.nextLine();
        System.out.print("Enter your father's name: ");
        String fatherName = sc.nextLine();
        System.out.print("Enter your mother's name: ");
        String motherName = sc.nextLine();
        System.out.print("Enter your father's phone number: ");
        String fatherNum = sc.next();
        System.out.print("Enter your mother's phone number: ");
        String motherNum = sc.next();
        System.out.println("\n----- YOUR INFORMATION -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nickname: " + nickname);
        System.out.println("10th Marks: " + marks10th);
        System.out.println("12th Marks: " + marks12th);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Father's Phone: " + fatherNum);
        System.out.println("Mother's Phone: " + motherNum);
        sc.close();
    }
}