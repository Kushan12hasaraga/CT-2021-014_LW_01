package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int MONTHS_IN_YEAR = 12;

        System.out.print("Enter loan amount ($): ");
        float loanAmount = scanner.nextFloat();
        System.out.print("Enter Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Enter loan period: ");
        float loanPeriod = scanner.nextFloat();

        double monthlyInterestRate = annualInterestRate/100.0/MONTHS_IN_YEAR;
        double numberOfPayments = loanPeriod*MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-Math.pow(1/(1+monthlyInterestRate),numberOfPayments));
        double totalPayment = monthlyPayment*numberOfPayments;

        System.out.println("Your Monthly Payment: "+monthlyPayment+" $");
        System.out.println("Your Total Payment: "+totalPayment+" $");
    }
}
