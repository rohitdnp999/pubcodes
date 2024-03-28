import java.util.Scanner;

public class project {
    static Scanner scanner = new Scanner(System.in);
    static int amt1 = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id1 = "123";
        String pass1 = "abc";
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Enter Account No.");
            String id = sc.next();
            System.out.println("Enter Password");
            String pass = sc.next();
            if (id1.equalsIgnoreCase(id) && pass1.equals(pass)) {
                System.out.println("Access Granted");
                disp();
                System.out.print("Enter the action to Perform : ");
                int y = sc.nextInt();
                choice(y);
            } else {
                attempts--;
                System.out.println("Access Denied \nTry Again");
                System.out.println(attempts + " attempts remaining!!! \n");
            }
        }
        if (attempts == 0) {
            System.out.println("Sorry,You have exceeded the maximum number of attempts. Please try again later.\n");
        }
        sc.close();
    }

    static void disp() {
        System.out.println("1. Account Details");
        System.out.println("2. Amount");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Exit");
    }

    static void choice(int x) {

        switch (x) {
            case 1:
                Details();
                last();
                break;
            case 2:
                amount(amt1);
                break;
            case 3:
                deposit();
                break;
            case 4:
                withdraw();
                break;
            case 5:
                System.out.println("Thank You,Visit Again");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                System.out.println("Thank You,Visit Again");
                break;
        }
    }

    static void Details() {
        System.out.println("Name : Rajesh Bansal");
        System.out.println("Account No. : 96023587415");
        System.out.println("Account Type : Savings");
        System.out.println("Balance : " + amt1);
        System.out.println("Address : Patna");
    }

    static void amount(int amt) {
        System.out.println("Total Amount");
        System.out.println("");
        System.out.println("Rs. " + amt + "\n");
        last();
    }

    static void deposit() {
        System.out.println("Current balane:  " + amt1);
        System.out.println("Enter Amount to deposit");
        int damt = scanner.nextInt();
        amt1 = amt1 + damt;
        System.out.println("Current amount : " + amt1 + "\n");
        last();
    }

    static void withdraw() {
        System.out.println("Current balane:  " + amt1);
        System.out.println("Enter amount to Withdraw : ");
        int wamt = scanner.nextInt();
        if (wamt < amt1) {
            amt1 = amt1 - wamt;
            System.out.println("Current amount : " + amt1 + "\n");
        } else {
            System.out.println("Insufficient Balance");
        }
        last();
    }

    static void last() {
        System.out.println("Enter 0 to Exit and 1 to Main Menu");
        int a = scanner.nextInt();
        if (a == 1) {
            disp();
            System.out.print("Enter choice : ");
            int d = scanner.nextInt();
            choice(d);
        } else {
            System.out.println("Thank You,Visit Again ");
            System.exit(0);
        }
    }
}