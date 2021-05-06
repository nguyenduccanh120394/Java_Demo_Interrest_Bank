import java.util.Scanner;

public class BankInterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount Money");
        double money = scanner.nextDouble();
        System.out.println("Enter Number of Month send");
        int month = scanner.nextInt();
        System.out.println("Enter Interest");
        double interest = scanner.nextDouble();
        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest += money*(interest/100)/12*month;
        }
        System.out.println("Total Interest = :"+total_interest);
    }
}
