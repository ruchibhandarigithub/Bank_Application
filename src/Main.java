import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name
                = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter your Password");
        String password = sc.next();
        System.out.println("Enter the amount ");
        int balance = sc.nextInt();
        SBI user = new SBI(name,balance, password);
        System.out.println("Choose one Option");
        System.out.println("Balance Check");
        System.out.println("Add amount");
        System.out.println("Withdraw money");
        System.out.println("Get Interest");
        System.out.println("Enter your choose");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                   System.out.println("The account balance of "+user.getName()+"  with account number "+user.getAccountNo()+" is  "+user.checkBalance());
                   break;
            case 2:
                   System.out.println("Enter the amount you want to add");
                   int amount = sc.nextInt();
                   user.addMoney(amount);
                   break;
            case 3:
                  System.out.println("Enter the amount you want to withdraw");
                  int withdraw = sc.nextInt();
                  System.out.println("Enter the password ");
                  String p = sc.next();
                  System.out.println(user.withdrawMoney(withdraw,p));
                  break;
            case 4:
                  System.out.println("Enter the year ");
                  int year = sc.nextInt();
                  System.out.println(user.calculateInterest(year));
                  break;
            default:
                  System.out.println("Oops !! You have enter wrong input");
                  break;
        }


    }
}