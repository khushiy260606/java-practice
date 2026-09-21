import java.util.Scanner;
class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int day = sc.nextInt();
        // enhanced switch statements
       // switch (day) {
		//	case 1 -> System.out.println("Monday");
		//	case 2 -> System.out.println("tuesday");
		//	case 3 -> System.out.println("wednesday");
		//	case 4 -> System.out.println("thursday");
		//	case 5 -> System.out.println("friday");
		//	case 6 -> System.out.println("saturday");
		//	case 7 -> System.out.println("sunday");
		//	default -> System.out.println("enter valid number");
		//}
        // NESTED SWITCH
        int empID = sc.nextInt();
        String depart = sc.next();
        switch (empID) {
            case 1 :
                System.out.println("khushi");
                break;
            case 2 :
                System.out.println("shraddha");
                break;
            case 3:
                switch (depart) {
                    case "CSE":
                        System.out.println("CSE BRANCH");
                        break;
                    case "AIML":
                        System.out.println("aiml branch");
                        break;
                    case "IT":
                        System.out.println("IT branch");
                        break;
                    default:
                        System.out.println("enter valid department");
                        break;
                }
                break;
            default:
                System.out.println("enter valid id");
                break;
        }
        sc.close();
    }
}
